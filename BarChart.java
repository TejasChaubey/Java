package Arrays;

public class BarChart {
    public static void main(String[] args) {
        int arr[]={2,1,3,5,0,7};
        int m=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<m;i++){
            max=Math.max(max, arr[i]);
        }
        int n=max;
        for(int i=n;i>=1;i--){
            for(int j=0;j<m;j++){
                if(arr[j]>=i){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
    
}
