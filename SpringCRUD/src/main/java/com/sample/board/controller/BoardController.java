package com.sample.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sample.board.service.BoardService;
import com.sample.board.vo.BoardVO;
import com.webjjang.util.PageObject;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/board")
@Log4j
public class BoardController {

	@Autowired
    @Qualifier("BoardServiceImpl")
	private BoardService service;
	
	@GetMapping("/list.do")
	public String list (PageObject pageObject, Model model) throws Exception{
				
		model.addAttribute("list", service.list(pageObject));
		model.addAttribute("pageObject", pageObject);
		
		return "board/list";
	}
	

	@GetMapping("/view.do")
	public String view (long no, int inc, Model model) throws Exception{
		
		model.addAttribute("vo", service.view(no, inc)); 
		
		return "board/view";
	}
	
	@GetMapping("/write.do")
	public String writeForm () throws Exception{
		 
		
		return "board/write";
	}
	
	@PostMapping("/write.do")
	public String write (BoardVO vo, int perPageNum) throws Exception{
		 
		service.write(vo);
		
		return "redirect:list.do?perPageNum=" + perPageNum;
	}
	
	@GetMapping("/update.do")
	public String updateForm (long no, Model model) throws Exception{
		log.info("-----------------------------------------------------udpate 폼");
		model.addAttribute("vo",service.view(no, 0));
		return "board/update";
	}
	
	@PostMapping("/update.do")
	public String update(BoardVO vo,PageObject pageObject) throws Exception{
		
		service.update(vo);
		log.info("-----------------------------------------------------update 완료");
		return "redirect:view.do?no=" + vo.getNo() + "&inc=0"
		+ "&page=" + pageObject.getPage()
		+ "&perPageNum=" + pageObject.getPerPageNum()
		+ "&key=" + pageObject.getKey()
		+ "&word=" + pageObject.getWord();
	}
	
	
	
	
	
	// 삭제처리
		@GetMapping("/delete.do")
		public String delete(long no, PageObject pageObject) throws Exception {
			
			//DB 처리
			service.delete(no);
			
			return "redirect:list.do?page=" + pageObject.getPage()
			+ "&perPageNum=" + pageObject.getPerPageNum()
			+ "&key=" + pageObject.getKey()
			+ "&word=" + pageObject.getWord();
		}
	
}
