package stringInterviewProgram;

public class SmallestNumberInArray {
    public static void SmallNumberInArrray(){
     int[] arr = {4,5,6,8,3,1};
     int len = arr.length;
     int temp;
     for (int i=0;i<len;i++){
         for (int j=i+1;j<len;j++){
             if(arr[i]>arr[j]) {
                 temp = arr[i];
                 arr[i] = arr[j];
                 arr[j] = temp;
             }

         }
     }
        for (int k=0;k<len;k++){
            System.out.print(arr[k]);
        }System.out.println();
        System.out.println("SECOND LARGEST NUMBER IS "+arr[len-2]);
        System.out.println("SECOND SMALLEST NUMBER IS "+arr[len-5]);
    }
    public static void main (String[] args){

        SmallestNumberInArray.SmallNumberInArrray();
    }
}
