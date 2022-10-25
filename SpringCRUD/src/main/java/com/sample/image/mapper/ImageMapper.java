package com.sample.image.mapper;

import java.util.List;

import com.sample.image.vo.ImageVO;
import com.webjjang.util.PageObject;

public interface ImageMapper {
	// list
	public List<ImageVO> list(PageObject pageObject) throws Exception;
	// 전체 데이터 개수
	public long getTotalRow(PageObject pageObject) throws Exception;
	
	// view
	public ImageVO view(long no) throws Exception;
	
	// imageChange 처리
	public int imageChange(ImageVO vo) throws Exception;
	// write처리
	public int write(ImageVO vo) throws Exception;
	// update처리
	public int update(ImageVO vo) throws Exception;
	// delete 처리
	public int delete(long no) throws Exception;
	

}
