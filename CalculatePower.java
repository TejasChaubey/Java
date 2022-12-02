public class Power {
    public static void main(String[] args) {
        int Base = 5;
        int pwr  = 2;
        int p=pwr;
        int result = 1;
        while(pwr!=0){
            result= result * Base;
            pwr=pwr-1;

        }
        System.out.println(Base+"^"+p+" = "+result);
    }
    
}
