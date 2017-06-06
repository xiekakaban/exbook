package com.st.exbook.util;

import com.st.exbook.dto.ResultBack;
import com.st.exbook.enums.ResultBackCodeEnum;

/**
 * Created by e604845 on 5/16/2017.
 */
public class ResultBackUtil {

    public static ResultBack success(Object o){
        return new ResultBack(ResultBackCodeEnum.STATE_OK.getCode(),ResultBackCodeEnum.STATE_OK.getMsg(),o);
    }

    public static ResultBack success(){
        return new ResultBack(ResultBackCodeEnum.STATE_OK.getCode(),ResultBackCodeEnum.STATE_OK.getMsg(),"");
    }

    public static ResultBack error(ResultBackCodeEnum resultBackCodeEnum){
        return new ResultBack(resultBackCodeEnum.getCode(),resultBackCodeEnum.getMsg(),"");
    }
}
