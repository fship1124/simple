package com.web.simple.controller;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.simple.service.ReplyService;

@RestController
@RequestMapping("/replies/")
public class ReplyController {
	@Inject
	private ReplyService service;
	
	
}
