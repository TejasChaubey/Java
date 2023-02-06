package Arrays;

public class Max_Min {
    public static void main(String[] args) {
        int number[]={54,50,15,95};
        int max=number[0];
        int min=number[0];
        for(int i=1;i<number.length;i++){
            if(number[i]>max){
                max=number[i];
            }
            if(number[i]<min){
                min=number[i];
            }
        }
        System.out.println("maximum no in array is "+max);
        System.out.println("minimum no in array is "+min);
        /*alternate method using java Integer.MAX_Value */
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
       
         for(int i=0; i<number.length; i++) {
             if(number[i] < minimum) {
                 min = number[i];
             }
             if(number[i] > maximum) {
                 max = number[i];
             }
         }
  
  
         System.out.println("Largest number is : " + max);
         System.out.println("Smallest number is : " + min);
  
    }
    
}
