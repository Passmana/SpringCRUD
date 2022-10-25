package com.sample.security;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sample.member.mapper.MemberMapper;
import com.sample.member.vo.MemberVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
	"file:src/main/webapp/WEB-INF/spring/root-context.xml"
})
@Log4j
public class MemberMapperTests {
	
	@Setter(onMethod_ = @Autowired)
	private MemberMapper mapper;
	
	@Test
	public void testView() {
		MemberVO vo =mapper.view("admin90");
		
		log.info(vo);
		vo.getAuthList().forEach(autoVO -> log.info(autoVO));
	}
}
