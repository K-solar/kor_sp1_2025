package com.easthot.exam.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.easthot.exam.vo.Article;

@Service
public class ArticleService {
	
	private int articlesLastId;
	
	private List<Article> articles;
	
	
	public ArticleService() {
		
		articlesLastId = 0;
		articles = new ArrayList<>();
	}

	// 게시글 전체 보기
	public List<Article> getArticles() {
		
		return articles;
		
	}
	
	// 게시글 하나 선택 보기
	public Article selectArticle(int id) {
	    for (int i = 0; i < articles.size(); i++) {
	        if (articles.get(i).getId() == id) {
	            
	            return articles.get(i);
	        }
	    }
	    return null;
	}
	
	
	// 게시글 추가 하기
	public Article doAdd(String title, String body) {
		
		int id = articlesLastId + 1;
		Article article = new Article(id, title, body);
		
		articles.add(article);
		
		articlesLastId = id;
		
		return article;		
		
	}
	
	
	// 게시글 삭제 하기
	public String doDelete(int id) {
	    for (int i = 0; i < articles.size(); i++) {
	        if (articles.get(i).getId() == id) {
	            articles.remove(i);
	            return id + "번 글이 삭제되었습니다.";
	        }
	    }
	    return id + "번 글이 존재하지 않습니다.";
	}
	
	
	// 게시글 수정 하기
	public String doModify(int id, String title, String body) {
	    for (int i = 0; i < articles.size(); i++) {
	        if (articles.get(i).getId() == id) {
	        	
	            articles.get(i).setTitle(title);
	            articles.get(i).setBody(body);
	            
	            return id + "번 글이 수정되었습니다.";
	        }
	    }
	    return id + "번 글이 존재하지 않습니다.";
	}
	
	

}
