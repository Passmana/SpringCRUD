package com.sample.security.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.sample.member.mapper.MemberMapper;
import com.sample.member.vo.MemberVO;
import com.sample.security.user.CustomUser;

import lombok.Setter;
import lombok.extern.log4j.Log4j;


@Log4j
public class CustomUserDetailsService implements UserDetailsService{
	
	@Setter(onMethod_ = @Autowired)
	private MemberMapper memberMapper;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		log.warn("Load User By UserName : " + userName);
		
		// userName means userid
		MemberVO vo = memberMapper.view(userName);
		log.warn("queried by member mapper: "+ vo);
		
		
		return vo == null ? null : new CustomUser(vo);
	}

}
