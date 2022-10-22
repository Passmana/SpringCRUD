package com.sample.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sample.board.mapper.BoardMapper;
import com.sample.board.vo.BoardVO;
import com.webjjang.util.PageObject;


@Service
@Qualifier("BoardServiceImpl")
public class BoardServiceImpl implements BoardService {

	@Inject
	private BoardMapper mapper;
	
	@Override
	public List<BoardVO> list(PageObject pageObject) throws Exception {
		// TODO Auto-generated method stub
		pageObject.setTotalRow(mapper.getTotalRow(pageObject));
		return mapper.list(pageObject);
	}

	@Override
	public BoardVO view(long no, int inc) throws Exception {
		// TODO Auto-generated method stub		
		return mapper.view(no);
	}

	@Override
	public int write(BoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		return mapper.write(vo); 
	}

	@Override
	public int update(BoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		return mapper.update(vo);
	}

	@Override
	public int delete(long no) throws Exception {
		// TODO Auto-generated method stub
		return mapper.delete(no);
	}

}
