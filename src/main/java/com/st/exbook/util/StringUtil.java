package com.st.exbook.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by e604845 on 5/15/2017.
 */
public class StringUtil {
    private static final GsonBuilder gb = new GsonBuilder().serializeNulls();
    private static Gson g = gb.create();

    public static boolean isNullOrEmpty(String str){
        return (str==null || str.length()<0);
    }
    public static String GsonSerializeNulls(Object o){
        return g.toJson(o);
    }
}
