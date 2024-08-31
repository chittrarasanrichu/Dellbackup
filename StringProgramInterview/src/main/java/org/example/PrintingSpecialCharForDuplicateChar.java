package org.example;

public class PrintingSpecialCharForDuplicateChar {

    public static void main(String[] args){
        String f = "Chittrarasan";
        int len = f.length();
        int occ=0;
        for (int i=0;i<len;i++){
            for (int j = i+1;j<len;j++){
                if (f.charAt(i)==f.charAt(j)){
                    occ++;
                    System.out.println(f.charAt(i)+"-"+occ);
                }
            }
        }

    }
}
