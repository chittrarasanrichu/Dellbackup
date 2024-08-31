package stringInterviewProgram;

public class DuplicateCharInArray {
    public void DupChar(){
        String a = "chittrarasan";
        char [] character = a.toCharArray();
        int len = a.length();
        int occ= 0;
        for (int i=0;i<len;i++){
            if(character[i]=='r')
                occ = occ + 1;
        }
        System.out.println("No. of dup char is : "+occ);
    }
    public void ToUpperCase(){
        String lowercase = "hello how are you?";
        System.out.println(lowercase.toUpperCase());
    }
   // System.out.println(occ);
    public static void main(String[] args){
        DuplicateCharInArray dup = new DuplicateCharInArray();
        dup.DupChar();
        dup.ToUpperCase();
    }
}
