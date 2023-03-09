package Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int result[]=new int[arr.length];
         result[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            result[i]=result[i-1]+arr[i];
        }
        for(int ele:result){
            System.out.print(ele+",");
        }
    }
    
}
