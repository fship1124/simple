package com.web.simple.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.web.simple.domain.SearchCriteria;
import com.web.simple.service.BoardService;
import com.web.simple.service.PageMaker;

@Controller
@RequestMapping("/searchboard/*")
public class SearchBoardController {

	  private static final Logger logger = LoggerFactory.getLogger(SearchBoardController.class);

	  @Inject
	  private BoardService service;
	
	  @RequestMapping(value = "/list", method = RequestMethod.GET)
	  public void listPage(@ModelAttribute("cri") SearchCriteria cri, Model model) throws Exception {

	    logger.info(cri.toString());

	    // model.addAttribute("list", service.listCriteria(cri));
	    model.addAttribute("list", service.listSearchCriteria(cri));

	    PageMaker pageMaker = new PageMaker();
	    pageMaker.setCri(cri);

	    // pageMaker.setTotalCount(service.listCountCriteria(cri));
	    pageMaker.setTotalCount(service.listSearchCount(cri));

	    model.addAttribute("pageMaker", pageMaker);
	  }
}
