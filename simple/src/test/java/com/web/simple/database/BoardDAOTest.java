package com.web.simple.database;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.web.simple.domain.BoardVO;
import com.web.simple.persistence.BoardDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
	locations ={"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class BoardDAOTest {
	@Inject
	private BoardDAO dao;
	
	
	//@Test
	public void testCreate() throws Exception{
		BoardVO board = new BoardVO();
		board.setTitle("title1");
		board.setContent("content1");
		board.setWriter("writer1");
		dao.create(board);
	}
	
	//@Test
	public void testRead() throws Exception{
		System.out.println(dao.read(1).toString());
	}
	
	//@Test
	public void testUpdate() throws Exception{
		BoardVO board = new BoardVO();
		board.setBno(1);
		board.setTitle("mod title1");
		board.setContent("mod content1");
		dao.update(board);
	}
	
	@Test
	public void testDelete() throws Exception{
		dao.delete(2);
	}
}
