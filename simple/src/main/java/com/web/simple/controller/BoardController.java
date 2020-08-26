package com.web.simple.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.web.simple.domain.BoardVO;
import com.web.simple.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Inject
	private BoardService service;

	@RequestMapping(value="/register", method = RequestMethod.GET)
	public void registerGET(BoardVO board, Model model) throws Exception {
		logger.info("register get ...........");
	}
	
	@RequestMapping(value="/register", method = RequestMethod.POST)
	public String registerPOST(BoardVO board, RedirectAttributes rttr) throws Exception {
	    logger.info("regist post ...........");
	    logger.info(board.toString());
	    
	    service.regist(board);
	    
	    rttr.addFlashAttribute("msg", "0000");
	    //return "/board/success";
	    return "redirect:/board/listAll";
	}

	@RequestMapping(value="/listAll", method = RequestMethod.GET)
	public void listAll(Model model) throws Exception {
		logger.info("show all list...........");
		
		model.addAttribute("list", service.listAll());
	}
	
    @RequestMapping(value = "/read", method = RequestMethod.GET)
    public void read(@RequestParam("bno") int bno, Model model) {

    	BoardVO board;
		try {
			board = service.read(bno);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			board = null;
		}
    	
        model.addAttribute(board);
    }
	
    @RequestMapping(value = "/remove", method = RequestMethod.POST)
    public String remove(@RequestParam("bno") int bno, RedirectAttributes rttr) throws Exception {

      service.remove(bno);

      rttr.addFlashAttribute("msg", "0000");

      return "redirect:/board/listAll";
    }
    
    @RequestMapping(value = "/modify", method = RequestMethod.GET)
    public void modifyGET(int bno, Model model) throws Exception {

      model.addAttribute(service.read(bno));
    }
	  
}
