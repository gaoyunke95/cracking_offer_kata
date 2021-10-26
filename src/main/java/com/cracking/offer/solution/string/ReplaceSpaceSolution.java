package com.cracking.offer.solution.string;

/**
 * @author Henry Gao
 * @date 10/25/21 - 9:56 PM
 */
public class ReplaceSpaceSolution {

    /**
     * this is a solution has O(n) space.
     * @param s
     * @return
     */
    private static String replaceSpaceOnSpace(String s) {
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
