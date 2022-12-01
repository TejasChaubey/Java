public class Palindrome {
    public static void main(String[] args) {
        int n = 153;
        int temp = n;
        int sum=0;
         while(temp!=0){
            int a = temp%10;
            sum= sum + (a*a*a);
            temp=temp/10;

         }
         if(n==sum ){
         System.out.println("no is palindrome");
         }         
         else{
            System.out.println("not a palindrome");
         }

    }
    
}
