package com.kuzuro.service;

import java.util.List;

import com.kuzuro.domain.BoardVO;
import com.kuzuro.domain.Criteria;

public interface BoardService {
	
	// 작성
	 public void write(BoardVO vo) throws Exception;
	 
	 // 조회
	 public BoardVO read(int bno) throws Exception;
	 
	 // 수정
	 public void update(BoardVO vo) throws Exception;
	 
	 // 삭제
	 public void delete(int bno) throws Exception;
	 
	 // 목록
	 public List<BoardVO> list() throws Exception;
	 
	 // 목록 + 페이징
	 public List<BoardVO> listPage(Criteria cri) throws Exception;
	 
	 // 게시물 총 갯수
	 public int listCount() throws Exception;

}
