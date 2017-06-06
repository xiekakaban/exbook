package com.st.exbook.exception;

/**
 * Created by e604845 on 5/16/2017.
 */
public class NoPermissionException extends RuntimeException{
    public NoPermissionException(){
        super("No Authority,You need login First");
    }
}
