package Arrays;

import java.util.ArrayList;

public class Stock {
    public static void stockbuysell(int arr[],int N){
        ArrayList<ArrayList<Integer> > ans = new ArrayList<>();
        int sell=0;
        int buy=0;
        for(int i= 0;i<N-1;i++){
            if(arr[i+1]>arr[i]){
                sell++;
            }else {
                if(sell>buy){
                    ArrayList<Integer> li = new ArrayList<>();
                    li.add(buy);
                    li.add(sell);
                    ans.add(li);
                }
                buy=i+1;
                sell=i+1;
            }

        }
        if(sell>buy){
            ArrayList<Integer> li = new ArrayList<>();
            li.add(buy);
            li.add(sell);
            ans.add(li);
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
       int arr[] = {100,180,260,310,40,535,695};
       int N = 7;
       stockbuysell(arr,N);
    }
    
}
