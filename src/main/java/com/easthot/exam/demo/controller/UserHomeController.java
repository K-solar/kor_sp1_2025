package com.easthot.exam.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.easthot.exam.vo.Article;

@Controller
public class UserHomeController {
	
	private int count = -1;
	

	
	private int id;
	private String title;
	private String body;
	
	
	
	
	@RequestMapping("/usr/home/main")
	@ResponseBody
	public String showMain() {
		return "안녕하세요";
		
	}
	
	@RequestMapping("/usr/home/getCount")
	@ResponseBody
	public int getCount() {
		count++ ;
		return count;
		
	}
	
	@RequestMapping("/usr/home/doSetCount")
	@ResponseBody
	public String doSetCount() {
		
		return "count의 값이 " + (this.count + 1) + "으로 초기화 되었습니다.";
		
	}	
	

	 @RequestMapping("/usr/home/getArticles")
	 @ResponseBody 
	 public List<Article> getArticle() {
	
	 Article article1 = new Article(1, "제목1", "내용1"); 
	 Article article2 = new Article(2, "제목2", "내용2");
	 
	 List<Article> list = new ArrayList<>(); 
	 
	 list.add(article1); 
	 list.add(article2);
	 
	 return list;
	 
	 }

	
	

}
 