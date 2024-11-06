package com.future.my.member.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.future.my.member.dao.IMemberDAO;
import com.future.my.member.vo.MemberVO;

@Service  // 비즈니스 로직을 처리하는 계층
public class MemberService {
	
	@Autowired
	IMemberDAO dao;
	
	public ArrayList<MemberVO> memList(){
		return dao.memList();
	}
}
