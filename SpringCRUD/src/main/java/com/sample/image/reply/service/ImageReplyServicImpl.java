package com.sample.image.reply.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sample.image.reply.mapper.ImageReplyMapper;
import com.sample.image.reply.vo.ImageReplyVO;
import com.webjjang.util.PageObject;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
@Qualifier("imageReplyServiceImpl")
public class ImageReplyServicImpl implements ImageReplyService {

	private ImageReplyMapper mapper;
	
	@Override
	public List<ImageReplyVO> list(PageObject pageObject, Long no) {
		// TODO Auto-generated method stub
		// 이미지 번호에 맞는 전체 데이터 개수 처리 -> 안하면 데이터 안나옴.
		pageObject.setTotalRow(mapper.getTotalRow(no));
		return mapper.list(pageObject, no);
	}

	@Override
	public int write(ImageReplyVO vo) {
		// TODO Auto-generated method stub
		return mapper.write(vo);
	}

	@Override
	public int update(ImageReplyVO vo) {
		// TODO Auto-generated method stub
		return mapper.update(vo);
	}

	@Override
	public int delete(long rno) {
		// TODO Auto-generated method stub
		return mapper.delete(rno);
	}

}
