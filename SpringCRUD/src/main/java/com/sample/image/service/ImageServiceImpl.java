package com.sample.image.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.sample.image.mapper.ImageMapper;
import com.sample.image.vo.ImageVO;
import com.webjjang.util.PageObject;

@Service
public class ImageServiceImpl implements ImageService {

	@Inject
	private ImageMapper mapper;
	
	@Override
	public List<ImageVO> list(PageObject pageObject) throws Exception {
		// TODO Auto-generated method stub
		pageObject.setTotalRow(mapper.getTotalRow(pageObject));
		return mapper.list(pageObject);
	}

	@Override
	public ImageVO view(long no) throws Exception {
		// TODO Auto-generated method stub
		return mapper.view(no);
	}

	@Override
	public int imageChange(ImageVO vo) throws Exception {
		// TODO Auto-generated method stub
		return mapper.imageChange(vo);
	}

	@Override
	public int write(ImageVO vo) throws Exception {
		// TODO Auto-generated method stub
		return mapper.write(vo);
	}

	@Override
	public int update(ImageVO vo) throws Exception {
		// TODO Auto-generated method stub
		return mapper.update(vo);
	}

	@Override
	public int delete(long no) throws Exception {
		// TODO Auto-generated method stub
		return mapper.delete(no);
	}

}
