package com.st.exbook.controller;

import com.st.exbook.annotation.AuthorCheckAnnotation;
import com.st.exbook.dto.ResultBack;
import com.st.exbook.entity.WelcomeEntity;
import com.st.exbook.util.ResultBackUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by e604845 on 5/16/2017.
 */
@Controller
public class IndexController extends AbstractController {

    @GetMapping("/")
    public String index(){
        return "index";
    }
    @GetMapping("/aj/get/welcome")
    @ResponseBody
    public ResultBack ajIndex(){
        return ResultBackUtil.success(new WelcomeEntity());
    }



}
