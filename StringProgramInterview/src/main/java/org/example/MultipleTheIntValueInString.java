package org.example;

public class MultipleTheIntValueInString {
    public static void main(String[] args){

        String s ="5*4*3*2*1";
        String[] str = s.split("\\*");
        int res =1;
        for (String num : str){
            res*=Integer.parseInt(num);//factorial formula
        }

        System.out.println(res);





    }
}
