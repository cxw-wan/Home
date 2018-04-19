package com.sptpc.persistence;

import org.springframework.stereotype.Repository;

import com.sptpc.domain.Userlogin;

@Repository
public interface UserLoginMapper {
	public Userlogin getUserLogin(Userlogin ul);
}
