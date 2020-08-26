package com.web.simple.database;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.web.simple.controller.BoardController;
import com.web.simple.domain.BoardVO;
import com.web.simple.persistence.BoardDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
	locations ={"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class TestListPage {
	
	private static final Logger logger = LoggerFactory.getLogger(TestListPage.class);
	
	@Inject
	private BoardDAO dao;
	
	@Test
	public void testListPage() throws Exception{
		int page = 1;
		List<BoardVO> list = dao.listPage(page);
	
		for (BoardVO boardVO : list) {
			logger.info(boardVO.getBno() + ":" + boardVO.getTitle());
		}
	}
}
