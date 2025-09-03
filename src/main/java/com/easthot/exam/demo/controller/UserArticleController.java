package com.easthot.exam.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.easthot.exam.vo.Article;

@Controller
public class UserArticleController {
	
	@RequestMapping("/usr/article/doAdd")
	@ResponseBody
	public Article doAdd(String title, String body) {
		int id = 1;
		Article article = new Article(id, title, body);
				
		return article;		
		
	}

}
 