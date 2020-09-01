package com.web.simple.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.web.simple.domain.BoardVO;


@Controller
@RequestMapping("/script/*")
public class ScriptController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/num", method = RequestMethod.GET)
	public void home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		BoardVO board = new BoardVO();
		board.setBno(1);
		board.setTitle("mod title1");
		board.setContent("mod content1");
		model.addAttribute("board", board);
		model.addAttribute("test", "test");
	}
}
