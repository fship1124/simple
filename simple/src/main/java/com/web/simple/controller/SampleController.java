package com.web.simple.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.simple.domain.SampleVO;

@RestController
@RequestMapping("sample")
public class SampleController {

	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello World";
	}

	@RequestMapping("/sendVO")
	public SampleVO sendVO() {
		
		SampleVO vo = new SampleVO();
		vo.setMno(123);
		vo.setFirstName("길동");
		vo.setLastName("홍");
		
		return vo;
	}
	
	@RequestMapping("/sendErrorAuth")
	public ResponseEntity<Void> sendListAuth() {
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}

	@RequestMapping("/sendErrorNot")
	public ResponseEntity<List<SampleVO>> sendListNot() {
		
		List<SampleVO> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			SampleVO vo = new SampleVO();
			vo.setMno(i);
			vo.setFirstName("길동");
			vo.setLastName("홍");
			list.add(vo);
		}
		
		return new ResponseEntity<>(list, HttpStatus.NOT_FOUND);
	}
	
}
 