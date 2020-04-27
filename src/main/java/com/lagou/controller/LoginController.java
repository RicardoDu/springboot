package com.lagou.controller;

import com.lagou.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Calendar;

@Controller
public class LoginController {

    @Autowired
    ArticleService articleService;

    @RequestMapping("/toLoginPage")
    public String toLoginPage(Model model){

        model.addAttribute("currentYear", Calendar.getInstance().get(Calendar.YEAR));
        return "login";
    }

    @RequestMapping("/index")
    public String index(Model model,@RequestParam("pageNum") int pageNum){
        model.addAttribute("data", articleService.getPage(0,pageNum));
        return "client/index";
    }
}
