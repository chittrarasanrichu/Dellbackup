package org.example;

public class ReverseOfString {

    public void rev(){
        String a  = "this is javatpoint";
        StringBuffer buf = new StringBuffer(a);
        System.out.println(buf.reverse());

    }
    public void WithoutFunction(){
        String a  = "this is javatpoint";
        int len = a.length();
        String rev = "";
        for (int i=len-1;i>=0;i--){
            rev= rev+a.charAt(i);

        }
        System.out.println("Reverse the string without function "+rev);
    }
    public static void main(String[] args) {
        ReverseOfString r = new ReverseOfString();
        r.rev();
        r.WithoutFunction();

    }
}