package com.st.exbook.dto;

/**
 * Created by e604845 on 5/16/2017.
 */
public class ResultBack<T> {
    private String code;
    private String msg;
    private T backData;

    public ResultBack() {
    }

    public ResultBack(String code, String msg, T backData) {
        this.code = code;
        this.msg = msg;
        this.backData = backData;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getBackData() {
        return backData;
    }

    public void setBackData(T backData) {
        this.backData = backData;
    }
}
