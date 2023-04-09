package Arrays;
public class RainWater {
    public static int trapwater(int arr[],int n){
        int trap = 0;
        if(n>2){
            int leftmax[] = new int[n];
            int rightmax[] = new int[n];
            leftmax[0]=arr[0];
            rightmax[n-1]=arr[n-1];
            for(int i=1;i<n;i++){
                leftmax[i]=Math.max(arr[i], leftmax[i-1]);
            }
            for(int i=n-2;i>=0;i--){
                rightmax[i]=Math.max(arr[i], rightmax[i+1]);
            }
            for(int i=0;i<n;i++){
                trap+=Math.min(leftmax[i], rightmax[i])-arr[i];
            }
           // return trap;
        }
        return trap;
    }
    public static void main(String[] args) {
        int arr[]={0,1,0,2,1,0,1,3,2,1,2,1};
        int n = arr.length;
        int water = trapwater(arr,n);
        System.out.println("stored water is:" + water);
    }
}
