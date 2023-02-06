package Arrays;

import java.util.Scanner;

public class LinearSearchTwoDA {
    public static void main(String[] args) {
        System.out.println("Enter row and cols");
        try (Scanner sc = new Scanner(System.in)) {
            int row = sc.nextInt();
            int cols = sc.nextInt();
            int numbers[][]=new int[row][cols];
            for(int i=0;i<row;i++){
                for(int j=0;j<cols;j++){
                    numbers[i][j]=sc.nextInt();
                }
                System.out.println();
            }
            System.out.println("Enter you wants to search");
            int x = sc.nextInt();
            for(int i=0;i<row;i++){
                for(int j=0;j<cols;j++){
                    if (x==numbers[i][j]){System.out.println("index is "+ i+" "+j);}
                }
            }
        }
    }
    
}
