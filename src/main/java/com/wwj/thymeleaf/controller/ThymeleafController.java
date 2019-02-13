package com.wwj.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ThymeleafController {

    @RequestMapping("/getsession")
    public String getSession(HttpSession session){
        session.setAttribute("session_msg","session");
        return "getSession";
    }

    @RequestMapping("/getrequest")
    public String getRequest(HttpServletRequest request,String request_msg){
        request.setAttribute("request_msg",request_msg);
        return "getRequest";
    }

    @RequestMapping("/gettemplate")
    public String getTemplate(){
        return "template";
    }

    @RequestMapping("/getifnull")
    public String getIfNull(String ifnull,HttpServletRequest request){
        request.setAttribute("ifnull",ifnull);
        return "getIfNull";
    }

    @RequestMapping("/getforeach")
    public String getForeach(HttpServletRequest request){
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<5;i++)
            list.add(i);
        request.setAttribute("lists",list);
        return "getForeach";
    }

}
