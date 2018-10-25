package com.ssm.controller;
import javax.servlet.http.HttpServletRequest;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/user")
public class UserController {

    //@Resource
    //private IUserService userService;


    @RequestMapping("/index")
    public String index(HttpServletRequest request, HttpServletResponse response) throws IOException {


        return "user/index";
    }

    @RequestMapping("/showUser.do")
    public void selectUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        //long userId = Long.parseLong(request.getParameter("id"));
        //User user = this.userService.selectUser(userId);
        //ObjectMapper mapper = new ObjectMapper();
        //response.getWriter().write(mapper.writeValueAsString(user));
        //response.getWriter().close();
        response.getWriter().write("初次见面 多多关照");
    }

}