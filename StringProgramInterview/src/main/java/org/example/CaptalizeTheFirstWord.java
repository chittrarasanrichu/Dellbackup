package org.example;

import java.util.Locale;

public class CaptalizeTheFirstWord {
    public void CaptialLetter(){
        String b = "this is javatpoint";
       String[] splitted =  b.split(" ");
       for (String d : splitted) {
           char[] ch = d.toCharArray();
           if (ch[0]>=97 && ch[0]<=122){
               ch[0] = (char)(ch[0]-32);
           }
           String f = new String(ch);
           System.out.println(f);

       }

    }
    public static void main(String[] args){
     CaptalizeTheFirstWord cap = new CaptalizeTheFirstWord();
     cap.CaptialLetter();
    }

}
