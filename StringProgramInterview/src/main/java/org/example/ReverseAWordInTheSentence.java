package org.example;

public class ReverseAWordInTheSentence {
    public static void main(String[] abcs){
        String s = "geeks quiz practice code" ;
           String[] v= s.split(" ");
        int len = v.length;

            String rev ="";
        StringBuilder builder =new StringBuilder();
            for (int i =len-1;i>=0;i--) {
               builder.append(v[i]);
            if (i>0){
                    builder.append(" ");
                }
            }
            System.out.println(builder);




    }
}
