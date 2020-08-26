package com.web.simple.persistence;

import com.web.simple.domain.MemberVO;

public interface MemberDAO {
	
	public String getTime();
	
	public int insertMember(MemberVO vo);

	public MemberVO readMember(String userid) throws Exception;

	public MemberVO readWothPW(String userid, String pw) throws Exception;
}
