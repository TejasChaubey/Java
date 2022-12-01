import java.util.Scanner;

public class CountDigit{
    public static void main(String[] args) {
        int n = 12345;
        int count = 0;
        int temp=n;
        while(n!=0){
            n=n/10;
            count=count+1;
        }
        System.out.println("The count in  "+ temp + " is  " + count);
    }
}
