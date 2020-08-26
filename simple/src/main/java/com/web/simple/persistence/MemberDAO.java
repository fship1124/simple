package com.web.simple.persistence;

import java.util.List;

import com.web.simple.domain.BoardVO;
import com.web.simple.domain.MemberVO;

public interface MemberDAO {
	
	public String getTime();
	
	public int insertMember(MemberVO vo);

	public MemberVO readMember(String userid) throws Exception;

	public MemberVO readWithPW(String userid, String pw) throws Exception;
	
	public List<BoardVO> listPage(int page) throws Exception;
}
