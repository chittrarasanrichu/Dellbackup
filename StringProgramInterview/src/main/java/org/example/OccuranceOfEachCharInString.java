package org.example;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfEachCharInString {
   public void Duplicate() {
       String a = "Chittrarasan";
       HashMap<Character, Integer> coll = new HashMap<Character, Integer>();
       char[] cha = a.toCharArray();
       for (char c : cha) {
           if (coll.containsKey(c)) {
               coll.put(c, coll.get(c) + 1);
           } else {
               coll.put(c, 1);
           }
       }
       for (Map.Entry map : coll.entrySet()) {
           System.out.println(map.getKey() + " " + map.getValue());
       }

   }
    public static void main(String[] args)
       {
OccuranceOfEachCharInString occ = new OccuranceOfEachCharInString();
occ.Duplicate();
       }

   }
