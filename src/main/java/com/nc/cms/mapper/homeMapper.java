package com.nc.cms.mapper;

import org.apache.ibatis.annotations.Param;

public interface homeMapper {
	
	//param
	public int deleteLimitedId(@Param("mhost") String mhost, @Param("limitedArr") String limitedArr);
	
}
