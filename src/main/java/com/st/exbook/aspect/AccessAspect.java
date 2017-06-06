package com.st.exbook.aspect;

import com.st.exbook.annotation.AuthorCheckAnnotation;
import com.st.exbook.exception.NoPermissionException;
import com.st.exbook.util.Constants;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import org.aspectj.lang.reflect.MethodSignature;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
/**
 * Created by e604845 on 5/16/2017.
 */
@Component
@Aspect
public class AccessAspect {
    private static final Logger logger = LoggerFactory.getLogger(AccessAspect.class);



    @Pointcut("execution(public * com.st.exbook.controller.*.*(..))")
    public void accessLog(){}

    @Before("accessLog()")
    public void logBefore(JoinPoint joinPoint){
        HttpServletRequest request = getServletRequest();

        StringBuffer sb = new StringBuffer();
        sb.append("url: "+request.getRequestURL()).append("\t");
        sb.append("method: "+request.getMethod()).append("\t");
        sb.append("ip: "+request.getRemoteAddr()).append("\t");
        //类方法
        sb.append("class: "+joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName()).append("\t");;
        //参数
        sb.append("args: "+joinPoint.getArgs()).append("\n");
        logger.warn(sb.toString());
    }

    //权限检查
    @Before("execution(public * com.st.exbook.controller.*.*(..)) && @annotation(com.st.exbook.annotation.AuthorCheckAnnotation)")
    public void AuthorCheck(JoinPoint jp) throws NoPermissionException {
        HttpServletRequest request = getServletRequest();
        MethodSignature methodSignature = (MethodSignature)jp.getSignature();
        AuthorCheckAnnotation authorCheckAnnotation = methodSignature.getMethod().getAnnotation(AuthorCheckAnnotation.class);
        //需要进行权限检查
        if(authorCheckAnnotation != null && authorCheckAnnotation.value() == Boolean.TRUE){
            if(request.getSession().getAttribute(Constants.SESS_USER) == null){
                throw new NoPermissionException();
            }
        }
    }


    private HttpServletRequest getServletRequest(){
        ServletRequestAttributes attributes = (ServletRequestAttributes)RequestContextHolder.currentRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        return request;
    }
}
