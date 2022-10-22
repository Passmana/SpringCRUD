package com.sample.board.service;

import java.util.List;

import com.sample.board.vo.BoardVO;
import com.webjjang.util.PageObject;

public interface BoardService {

	
		// 리스트
		public List<BoardVO> list(PageObject pageObject) throws Exception;
		
		// 보기
		public BoardVO view(long no, int inc) throws Exception;
		
		// 쓰기
		public int write(BoardVO vo) throws Exception;
		
		// 업데이트
		public int update(BoardVO vo) throws Exception;
		
		// 삭제
		public int delete(long no) throws Exception;
}
