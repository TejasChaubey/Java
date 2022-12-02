public class CalculateGCD {
    public static void main(String[] args) {
        int largen=42;
        int smalln=18;
        int result;
        while(largen%smalln==0){
            result=largen%smalln;
            largen=smalln;
            smalln=result;
        }
        
         System.out.println("GCD of "+largen+" & "+ smalln+" = "+ result);
    }
    
}
