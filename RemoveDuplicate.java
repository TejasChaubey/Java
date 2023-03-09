package Arrays;

public class RemoveDuplicate {

    static int removeDuplicates(int[] num) {
        int j = 0;
        for(int i = 1 ; i<num.length; i++){
            if(num[j]!= num[i]){
                j++;
                num[j] = num[i];
               
            }   

        }
        return j+1;
    }
    public static void main(String[] args) {
      
        int a[] = {1,1,1,1,1,1,1,2,2,2,2,2,2,3,3,3,3,4,4,4,5};
        int c  = removeDuplicates(a);
        for(int i = 0; i<c;i++){
            System.out.print(a[i]+",");
        }


    }
}