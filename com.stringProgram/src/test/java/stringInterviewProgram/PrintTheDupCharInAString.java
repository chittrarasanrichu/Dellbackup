package stringInterviewProgram;

public class PrintTheDupCharInAString {
    public void DupChr(){
        String DupChar = "chittrarasan";
        int count;
        char[] charValue = DupChar.toCharArray();
        for (int i=0;i<DupChar.length();i++){
            count=1;
            for (int j=i+1;j<DupChar.length();j++){
                if (charValue[i]==charValue[j]&&charValue[i]!=' '){
                count++;
               charValue[j]= '0';
                }
            }
            if (count>1 && charValue[i]!='0'){
                System.out.println(" No. of times occured char is " +charValue[i] +" = " +count);
            }

        }
    }
    public static void main(String[]args){
        PrintTheDupCharInAString DupString = new PrintTheDupCharInAString();
        DupString.DupChr();
    }
}
