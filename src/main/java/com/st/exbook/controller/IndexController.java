package com.st.exbook.controller;

import com.st.exbook.annotation.AuthorCheckAnnotation;
import com.st.exbook.dto.ResultBack;
import com.st.exbook.entity.UserEntity;
import com.st.exbook.entity.WelcomeEntity;
import com.st.exbook.service.UserService;
import com.st.exbook.util.ResultBackUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

/**
 * Created by e604845 on 5/16/2017.
 */
@Controller
public class IndexController extends AbstractController {
    @Autowired
    private UserService userService;
    @GetMapping("/")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView();
        UserEntity u = userService.findUserById("b6a0ff05-f4b8-47c3-b130-38b43f6319aa");
        modelAndView.addObject("currentUser",u);
        modelAndView.setViewName("index");
        return modelAndView;
    }
    @GetMapping("/aj/get/welcome")
    @ResponseBody
    public ResultBack ajIndex(){
        UserEntity u = userService.findUserById("b6a0ff05-f4b8-47c3-b130-38b43f6319aa");
        return ResultBackUtil.success(u);
    }



}
