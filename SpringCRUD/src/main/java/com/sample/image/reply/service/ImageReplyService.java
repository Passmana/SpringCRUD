package com.sample.image.reply.service;

import java.util.List;

import com.sample.image.reply.vo.ImageReplyVO;
import com.webjjang.util.PageObject;

public interface ImageReplyService {

	// list
	public List<ImageReplyVO> list(PageObject pageObject, Long no);
	
	// write
	public int write(ImageReplyVO vo);
	
	// update
	public int update(ImageReplyVO vo);
	
	// delete
	public int delete(long rno);
	
}
