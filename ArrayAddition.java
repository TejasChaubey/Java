package Arrays;
public class ArrayAddition {
   public static void main(String[] args) {
    int first[]={9,1,8,9,2};
    int second[]={2,1,1,5};
    int result[]=new int[Math.max(first.length, second.length)];
    int carry=0;
    int sum=0;
    int i=first.length-1;
    int j=second.length-1;
    int k=result.length-1;
    while(k>=0){
        if(i>=0&&j>=0){
            sum=first[i]+second[j]+carry;
        }

        else if(i>=0 && j<0){
            sum=first[i]+carry;
        }

        else if(i<0 && j>=0){
            sum=second[j]+carry;
        }
        //to upate the carry for next operation.......
        carry=sum/10;
        //to update the specific digti at the plcce.....
        sum=sum%10;
        result[k]=sum;
        i--;
        j--;
        k--;    
    }
    if(carry!=0){
        System.out.println(carry);
    }
    //also a way to print loop in java.....
    for(int r:result){
        System.out.print(r);
    }
    System.out.println();
   
   }
}   

