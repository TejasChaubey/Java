import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            int arr[] = new int[size];
            System.out.println("enter the no of array");
            for(int i=0;i<size;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println("enter the positon you want to rotate the array");
            int rotation=sc.nextInt();
            int n=arr.length;
            while(rotation!=0){
                int first =arr[0];
            for(int i=1;i<=n-1;i++){
                arr[i-1]=arr[i];
                
            }
   
            arr[n-1]=first;
            rotation--;}
            for(int i=0;i<=n-1;i++){
                System.out.print(arr[i]+",");
            }
        }
    }
}
