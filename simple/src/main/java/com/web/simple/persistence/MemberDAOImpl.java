package com.web.simple.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.web.simple.domain.BoardVO;
import com.web.simple.domain.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO {

	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = "org.simple.mapper.MemberMapper";

	@Override
	public String getTime() {
		return sqlSession.selectOne(namespace+".getTime");
	}

	@Override
	public int insertMember(MemberVO vo) {
		return sqlSession.insert(namespace+".insertMember", vo);
	}

	@Override
	public MemberVO readMember(String userid) throws Exception {
		return (MemberVO) sqlSession.selectOne(namespace + ".selectMember", userid);
	}

	@Override
	public MemberVO readWithPW(String userid, String userpw) throws Exception {
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("userid", userid);
		paramMap.put("userpw", userpw);
		
		return sqlSession.selectOne(namespace + ".readWithPW", paramMap);
	}

	@Override
	public List<BoardVO> listPage(int page) throws Exception {
		if (page <= 0) {
			page = 1;
		}
		
		page = (page - 1) * 1;
		
		return sqlSession.selectList(namespace + ".listPage", page);
	}
	
	
}
