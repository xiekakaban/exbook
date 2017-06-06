package com.st.exbook.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by e604845 on 5/16/2017.
 */
public class WelcomeEntity extends AbstractEntity{
    private static final SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String msg = "平等交流，以书汇友";
    String visitTime = sf.format(new Date());

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static SimpleDateFormat getSf() {
        return sf;
    }

    public String getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(String visitTime) {
        this.visitTime = visitTime;
    }
}
