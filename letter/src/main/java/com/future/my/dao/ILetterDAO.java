package com.future.my.dao;

import org.apache.ibatis.annotations.Mapper;

import com.future.my.vo.LetterVO;

@Mapper
public interface ILetterDAO {
	
	public LetterVO getLetter(LetterVO vo);
	
	public int sendLetter(LetterVO vo);
}
