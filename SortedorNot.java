package Arrays;

public class SortedorNot {
    public static void main(String[] args) {
        int arr[]={3,4,12,5,1};
        for (int i=0;i<arr.length;i++){
            if(arr[i]>arr[i+1]){
                System.out.println("array is not sorted");return;
            }
        }
        System.out.println("sorted");
        
    }
    
}
