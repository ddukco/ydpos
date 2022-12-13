package com.spring_boot.ydpos.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.spring_boot.ydpos.model.CommentsVO;

public interface ICommentsDAO {
	// 댓글 등록
	public void insertComments(CommentsVO vo);
	
	// 댓글 목록 호출
	public ArrayList<CommentsVO> getCommentList(int writeNo);
}
