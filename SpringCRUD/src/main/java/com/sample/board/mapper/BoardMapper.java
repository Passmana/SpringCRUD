package com.sample.board.mapper;

import java.util.List;

import com.sample.board.vo.BoardVO;
import com.webjjang.util.PageObject;

public interface BoardMapper {

	
	// 리스트
		public List<BoardVO> list(PageObject pageObject) throws Exception;
		// 전체 데이터 개수
		public long getTotalRow(PageObject pageObject) throws Exception;
		
		// 보기
		public BoardVO view(long no) throws Exception;
		// 조회수 1 증가
		public int increase(long no) throws Exception;
		
		public int write(BoardVO vo)throws Exception;

		// 수정하기
		public int update(BoardVO vo) throws Exception;

		// 삭제하기
		public int delete(long no) throws Exception;
}
