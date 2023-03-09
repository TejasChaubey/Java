package Arrays;

public class SecondLargest {
   public static void main(String[] args) {
    int arr[]={2,1,3,4,5,6};
    int max=arr[0];
    int secmax=-1;
    for(int i=1;i<arr.length;i++){
        if(arr[i]>max){
            secmax=max;
            max=arr[i];
        }
       if(arr[i]!=max){
        if(arr[i]>secmax){
            secmax=arr[i];
        }
       }
    }
    System.out.println(secmax);
   } 
}
