package Arrays;

import java.util.Scanner;
//to check whether array is in ascending or not.....
public class AscendingArray {
    public static void main(String[] args) {
        int size=4;
        try (Scanner sc = new Scanner(System.in)) {
            int number[]=new int[size];
            for(int i=0;i<size;i++){
                System.out.println("enter no");
                number[i]=sc.nextInt();
            }
            boolean isascending = true;
            for(int i=0;i<number.length-1;i++){
                if (number[i]>number[i+1]){
                    isascending=false;
                }
            }
            if(isascending){
                System.out.println("array is in ascending order");
            }
            else System.out.println("not in ascending order");
        }
    }
    
}
