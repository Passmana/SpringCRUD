package com.sample.image.reply.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sample.image.reply.service.ImageReplyService;
import com.sample.image.reply.vo.ImageReplyVO;
import com.webjjang.util.PageObject;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@RestController
@RequestMapping("/imagereply")
@Log4j
public class ImageReplyController {

	@Autowired
	@Qualifier("imageReplyServiceImpl")
	private ImageReplyService service;
	
	// list
	@GetMapping(value = "/list.do",
//			consumes = "application/json",
			produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_UTF8_VALUE})
	public ResponseEntity<Map<String, Object>> list(PageObject pageObject, Long no){
		// 페이지에 맞는 list 데이터 가져오기
		List<ImageReplyVO> list = service.list(pageObject, no);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("pageObject", pageObject);
		map.put("list", list);
		
		log.info(map);
		
		return new ResponseEntity<>(map, HttpStatus.OK);
	}
	
	// write
	@PostMapping(value = "/write.do", consumes = "application/json", produces = {MediaType.TEXT_PLAIN_VALUE})
	public ResponseEntity<String> write(@RequestBody ImageReplyVO vo){
		log.info(vo);
		service.write(vo);
		return new ResponseEntity<>("write success~!", HttpStatus.OK);
	}
	
	// update
	@RequestMapping(method = {RequestMethod.PUT, RequestMethod.PATCH},
			value = "/update.do", consumes = "application/json",
			produces = {MediaType.TEXT_PLAIN_VALUE})
	public ResponseEntity<String> update(@RequestBody ImageReplyVO vo){
		log.info(vo);
		int result = service.update(vo);
		return (result == 1)
				? new ResponseEntity<>("update success~!", HttpStatus.OK)
				: new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR)
				;
	}
	
	
	// delete

	@RequestMapping(method = {RequestMethod.DELETE},
			value = "/delete.do",
			produces = {MediaType.TEXT_PLAIN_VALUE})
	public ResponseEntity<String> delete(Long rno){
		log.info(rno);
//		int result = service.delete(rno);
		int result = 1;
		return service.delete(rno) == 1
				? new ResponseEntity<>("delete success~!", HttpStatus.OK)
						: new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR)
						;
	}
	
}
