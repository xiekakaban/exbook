package com.st.exbook.handler;

import com.st.exbook.dto.ResultBack;
import com.st.exbook.enums.ResultBackCodeEnum;
import com.st.exbook.util.ResultBackUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by e604845 on 5/16/2017.
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    private final static Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);


    @ExceptionHandler(value=Exception.class)
    @ResponseBody
    public ResultBack handler(Exception e){
        logger.error("【系统异常】{}", e);
        return ResultBackUtil.error(ResultBackCodeEnum.UNKNOWN_ERROR);
    }
}
