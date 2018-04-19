package com.sptpc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sptpc.domain.Userlogin;
import com.sptpc.persistence.UserLoginMapper;

@Service
public class LoginService {
	@Autowired
	private UserLoginMapper userLoginMapper;
	//根据用户名和密码得到UserLogin对象（包含了权限的名字）
	public Userlogin getUserByNameAndPwd(String name,String pwd){
		Userlogin ul = new Userlogin();//创建UserLogin对象
		ul.setUserName(name);
		ul.setPassword(pwd);
		return userLoginMapper.getUserLogin(ul);
	}
}
