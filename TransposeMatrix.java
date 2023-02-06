package Arrays;
import java.util.*;
public class TransposeMatrix {
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
            }System.out.println("Transpose of ");
            for(int i=0;i<row;i++){
                for(int j=0;j<cols;j++){
                    System.out.print(numbers[i][j] +" ");
                }
                System.out.println();
            }
            System.out.println("is ");
            for(int i=0;i<row;i++){
                for(int j=0;j<cols;j++){
                    System.out.print(numbers[j][i]+" ");
                }
                System.out.println();
            }
        }
    }
    
}
