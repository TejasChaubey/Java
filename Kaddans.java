package Arrays;

public class Kaddans {
    public static long kadan(int arr[], int n){
      long ms = Integer.MIN_VALUE;
      long cs = 0;
      for(int i=0;i<n;i++){
        cs+=arr[i];
        if(cs<0){
            cs=0;
        } 
        ms = Math.max(cs,ms);
      }
      if(ms==0){
        long min = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            min= Math.max(arr[i],min);
            ms=min;
        }
      }
    
      return ms;
    }
    public static void main(String[] args) {
        int arr[]={-1,-2,-3,-4};
        int n= arr.length;
        long  sum= kadan(arr, n);
        System.out.println(sum);
    }    
}
