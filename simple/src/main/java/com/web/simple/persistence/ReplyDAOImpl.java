package com.web.simple.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import com.web.simple.domain.ReplyVO;

public class ReplyDAOImpl implements ReplyDAO {

    @Inject
	private SqlSession session;

	private static String namespace = "org.simple.mapper.ReplyMapper";
	
	@Override
	public List<ReplyVO> list(Integer bno) throws Exception {
		
		return session.selectList(namespace + ".list", bno);
	}

	@Override
	public void create(ReplyVO vo) throws Exception {
		session.insert(namespace + ".create", vo);
	}

	@Override
	public void update(ReplyVO vo) throws Exception {
		session.insert(namespace + ".update", vo);
	}

	@Override
	public void delete(Integer rno) throws Exception {
		session.insert(namespace + ".delete", rno);
	}
	
}
