package com.kuzuro.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.kuzuro.domain.BoardVO;
import com.kuzuro.domain.Criteria;
import com.kuzuro.persistence.BoardDAO;

@Service
public class BoardServiceImpl implements BoardService {

	@Inject
	private BoardDAO dao;

	@Override
	public void write(BoardVO vo) throws Exception {
		dao.write(vo);

	}

	@Override
	public BoardVO read(int bno) throws Exception {

		return dao.read(bno);
	}

	@Override
	public void update(BoardVO vo) throws Exception {
		dao.update(vo);

	}

	@Override
	public void delete(int bno) throws Exception {
		dao.delete(bno);

	}
	
	 // 목록
	 @Override
	 public List<BoardVO> list() throws Exception {
	  return dao.list();
	 }
	 
	 // 목록  + 페이징
	@Override
	public List<BoardVO> listPage(Criteria cri) throws Exception {
		
		return dao.listPage(cri);
	}

	@Override
	public int listCount() throws Exception {
		
		return dao.listCount();
	}

}
