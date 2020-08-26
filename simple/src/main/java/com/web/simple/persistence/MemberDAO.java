package com.web.simple.persistence;

import com.web.simple.domain.MemberVO;

public interface MemberDAO {
	
	public String getTime();
	
	public void insertMember(MemberVO vo);
}
