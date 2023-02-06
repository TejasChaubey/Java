import java.util.Scanner;

public class GCD {
    public static void CalculateGcd(int a, int b){
        while(a!=b){
            if(a>b){a=a-b;}
            else{b=b-a;}
        }
        System.out.println("gcd is"+ b);

    }
    public static void main(String[] args) {
        System.out.println("Enter two no");
        try (Scanner sc = new Scanner(System.in)) {
            int a =sc.nextInt();
            int b = sc.nextInt();
            CalculateGcd(a, b);
        }

        
    }
    
}
