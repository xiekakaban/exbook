package com.st.exbook.controller;

import com.st.exbook.dto.ResultBack;
import com.st.exbook.entity.UserEntity;
import com.st.exbook.service.UserService;
import com.st.exbook.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import sun.security.pkcs11.Secmod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by e604845 on 5/16/2017.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ModelAndView userLogin(String username,String password,RedirectAttributes redirectAttributes,HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();
        HttpSession session = request.getSession();
        UserEntity u = userService.checkUserLogin(username, password);
        if(u!=null){
            session.setAttribute(Constants.SESS_USER,u);
            redirectAttributes.addAttribute("Login Success");
        }
        else{
            redirectAttributes.addAttribute("Please Check Your username/password");
        }
        modelAndView.setViewName("index");
        return modelAndView;
    }

}
