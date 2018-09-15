package com.nc.cms.domain;

import java.sql.Date;

import org.apache.ibatis.type.Alias;
import org.springframework.stereotype.Repository;

@Alias("userInfo")
@Repository
public class UserInfoBean {
	
	private String id;
	private String passWord;
	private String auth_level;
	private String name;
	private String sex;
	private String brith;
	private String dept_code;
	private String phone; 
	private String email;
	private String adress;
	private String profile_img;
	private Date lst_login_dt;
	private String lst_login_ip;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getAuth_level() {
		return auth_level;
	}
	public void setAuth_level(String auth_level) {
		this.auth_level = auth_level;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBrith() {
		return brith;
	}
	public void setBrith(String brith) {
		this.brith = brith;
	}
	public String getDept_code() {
		return dept_code;
	}
	public void setDept_code(String dept_code) {
		this.dept_code = dept_code;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getProfile_img() {
		return profile_img;
	}
	public void setProfile_img(String profile_img) {
		this.profile_img = profile_img;
	}
	public Date getLst_login_dt() {
		return lst_login_dt;
	}
	public void setLst_login_dt(Date lst_login_dt) {
		this.lst_login_dt = lst_login_dt;
	}
	public String getLst_login_ip() {
		return lst_login_ip;
	}
	public void setLst_login_ip(String lst_login_ip) {
		this.lst_login_ip = lst_login_ip;
	}

}
