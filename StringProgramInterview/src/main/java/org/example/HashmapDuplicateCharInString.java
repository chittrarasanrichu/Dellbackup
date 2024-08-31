package org.example;

import java.util.HashMap;

public class HashmapDuplicateCharInString {

    public static void main(String[] args){
        String DuplicateChar = "google";
        HashMap<Character,Integer> Map = new HashMap<Character,Integer>();
        char[] ch = DuplicateChar.toCharArray();
        for (int i =0;i<ch.length;i++){
            if (Map.containsKey(ch[i])){
                Map.put(ch[i],Map.get(ch[i])+1);
            }
            else
            {
                Map.put(ch[i],1);
            }
        }
        System.out.println(Map);

    }
}
