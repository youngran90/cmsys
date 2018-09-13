package com.nc.cms.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nc.cms.service.UserInfoService;


@Controller
public class UserInfoController {

	private static final Logger logger = LoggerFactory.getLogger(UserInfoController.class);
	
	@Autowired
	private UserInfoService userInfoService;
	
/*	@PostMapping("/getUserInfo")
	public UserInfoBean getUserInfo(@RequestBody String param) throws Exception{
		
		JSONObject paramObj = new JSONObject(param);
		
		return userInfoService.getUserInfo(paramObj.get("id").toString());
	}*/
}
