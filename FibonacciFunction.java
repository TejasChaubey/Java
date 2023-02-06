import java.util.Scanner;

public class FibonacciFunction {
    public static void CalculateFiboSeries(int n){
        int a=0;int b=1;
        System.out.print(a+" ,");
        if(n>1){
            for(int i=2;i<=n;i++){
                System.out.print(b+" ,");
                int temp=b;
                b=a+b;
                a=temp;
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        System.out.println("Enter the no till whre you want sereise ");
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            CalculateFiboSeries(n);
        }
    }
    
}
