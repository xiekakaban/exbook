package com.st.exbook.util;

/**
 * Created by e604845 on 5/15/2017.
 */
import java.util.UUID;

public class GenerateId {
    public static String generate(){
        UUID uniqueKey = UUID.randomUUID();
        return uniqueKey.toString();
    }
    public static void main(String[] args){
        System.out.println(generate());
    }
}
