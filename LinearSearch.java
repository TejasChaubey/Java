package Arrays;

import java.util.Scanner;

public class LinearSearch {
    //Linear Search in arrays for an element.....
    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        try (Scanner sc = new Scanner(System.in)) {
            int size=sc.nextInt();
            int numbers[]=new int[size];
            for(int i=0;i<size;i++){
                System.out.print("Enter element ");
                numbers[i]=sc.nextInt();
            }
            System.out.println("Enter element you wana search");
            int x=sc.nextInt();
            for(int i=0;i<size;i++){
                if(x==numbers[i]){System.out.println("no at index ="+i);}
                
            }
        }
    }
    
}
