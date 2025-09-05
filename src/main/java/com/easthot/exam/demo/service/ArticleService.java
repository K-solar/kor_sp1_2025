package com.easthot.exam.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easthot.exam.demo.repository.ArticleRepository;
import com.easthot.exam.vo.Article;

@Service
public class ArticleService {
	
	@Autowired
	private ArticleRepository ar;
	
	

	// 게시글 전체 보기
	public List<Article> getArticles() {
		
		return ar.getArticles();
		
	}
	
	// 게시글 하나 선택 보기
	public Article selectArticle(int id) {
	    for (int i = 0; i < ar.getArticles().size(); i++) {
	        if (ar.getArticles().get(i).getId() == id) {
	            
	            return ar.getArticles().get(i);
	        }
	    }
	    return null;
	}
	
	
	// 게시글 추가 하기
	public Article doAdd(String title, String body) {
		
		int articlesLastId = ar.getArticlesLastId();
		
		int id = articlesLastId + 1;
		Article article = new Article(id, title, body);
		
		ar.getArticles().add(article);
		
		ar.setArticlesLastId(id);
		
		return article;		
		
	}
	
	
	// 게시글 삭제 하기
	public String doDelete(int id) {
	    for (int i = 0; i < ar.getArticles().size(); i++) {
	        if (ar.getArticles().get(i).getId() == id) {
	            ar.getArticles().remove(i);
	            return id + "번 글이 삭제되었습니다.";
	        }
	    }
	    return id + "번 글이 존재하지 않습니다.";
	}
	
	
	// 게시글 수정 하기
	public String doModify(int id, String title, String body) {
	    for (int i = 0; i < ar.getArticles().size(); i++) {
	        if (ar.getArticles().get(i).getId() == id) {
	        	
	            ar.getArticles().get(i).setTitle(title);
	            ar.getArticles().get(i).setBody(body);
	            
	            return id + "번 글이 수정되었습니다.";
	        }
	    }
	    return id + "번 글이 존재하지 않습니다.";
	}
	
	

}
