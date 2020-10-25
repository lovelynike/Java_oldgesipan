package com.kuzuro.controller;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.kuzuro.domain.BoardVO;
import com.kuzuro.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

	@Inject
	BoardService service;

	// 글 작성 get
	@RequestMapping(value = "/write", method = RequestMethod.GET)
	public void getWrite() throws Exception {
		logger.info("get write");
	}

	// 글 작성 post
	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public String postWrite(BoardVO vo) throws Exception {
		logger.info("post write");

		service.write(vo);

		return "redirect:/";
	}
	
	 // 글 목록
	 @RequestMapping(value = "/list", method = RequestMethod.GET)
	 public void list(Model model) throws Exception {
	  logger.info("get list");
	  
	  List<BoardVO> list = service.list();
	  
	  model.addAttribute("list", list);
	 }
	 
	 // 글 조회
	 @RequestMapping(value = "/read", method = RequestMethod.GET)
	 public void getRead(@RequestParam("bno") int bno, Model model) throws Exception {
	  logger.info("get read");
	  
	  BoardVO vo = service.read(bno);
	  
	  model.addAttribute("read", vo);
	  
	 }

}