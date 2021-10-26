package com.cracking.offer.kata.string;

/**
 * @author Henry Gao
 * @date 10/22/21 - 10:02 PM
 */
public class ReplaceSpace {

    public static String replaceSpace(String s) {
        if(s == null || s.isEmpty()) return "";

        StringBuilder sb = new StringBuilder();
        for(int idx = 0; idx < s.length(); idx++){
            if(s.charAt(idx) == ' '){
                sb.append("%20");
            }else{
                sb.append(s.charAt(idx));
            }
        }

        return sb.toString();
    }
}
