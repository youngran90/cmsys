package com.nc.cms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nc.cms.domain.UserInfoBean;
import com.nc.cms.mapper.UserInfoMapper;

@Service
public class UserInfoService {

	@Autowired
	private UserInfoMapper userInfoMapper;
	
	public UserInfoBean getUserInfo(String id) throws Exception{
		
		return userInfoMapper.getUserInfo("youngran");
	};
	
/*	public int userCount() throws Exception{
		
		System.out.println(session.selectOne(""));
		
		return session.selectOne("");
		return userInfoMapper.userCount();
	}
	*/

}
