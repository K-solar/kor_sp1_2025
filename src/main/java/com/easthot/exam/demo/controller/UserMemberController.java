package com.easthot.exam.demo.controller;

import com.easthot.exam.demo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserMemberController {

    @Autowired
    private MemberService ms;

    @RequestMapping("/usr/member/doJoin")
    @ResponseBody
    public String doJoin(String loginId, String loginPw) {

        ms.login(loginId, loginPw);

        return "안녕하세요";
    }

}
