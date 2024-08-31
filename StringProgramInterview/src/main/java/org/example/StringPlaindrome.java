package org.example;

public class StringPlaindrome {
    public void Plaindrome(){
        String a  = "nitin";
        int len = a.length();
        String rev = "";
        for (int i=len-1;i>=0;i--){
            rev= rev+a.charAt(i);

        }
        System.out.println("Reverse the string without function "+rev);
        if (rev.equalsIgnoreCase(a))
        {
            System.out.println("Given String is palindrome "+rev);
        }else
            System.out.println("Given String is not a palindrome "+rev);
    }
    public static void main(String[] args) {
        StringPlaindrome r = new StringPlaindrome();
        r.Plaindrome();

    }

}
