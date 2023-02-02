public class Advanceloop {
    public static void main(String[] args) {
        //........butterfly.......
         for (int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(4-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=4;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(4-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    //rhombus..................
        for(int i=1;i<=5;i++){
            for(int j=1;j<=(5-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=5;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        } 
        for(int i=1;i<=5;i++){
            for(int j=1;j<=(5-i);j++){System.out.print(" ");}
            for(int j=1;j<=i;j++){System.out.print(i+" ");}
            System.out.println();
        } 
        //...no pyramid palidroem..
        for(int i=1;i<=5;i++){
            for(int j=1;j<=(5-i);j++)System.out.print(" ");
            for(int j=i;j>=1;j--)System.out.print(j);
            for(int j=2;j<=i;j++)System.out.print(j);
            System.out.println();
        }     
        //.....diamond
        for(int i=1;i<=4;i++){
            for(int j=1;j<=(4-i);j++)System.out.print(" ");
            for(int j=1;j<=(2*i-1);j++)System.out.print("*");
            System.out.println();
        }
        for(int i=4;i>=1;i--){
            for(int j=1;j<=(4-i);j++)System.out.print(" ");
            for(int j=1;j<=(2*i-1);j++)System.out.print("*");
            System.out.println();
        }
        //inverted half pyramid..
        for(int i=1;i<=4;i++){
            for(int j=1;j<=(5-i);j++)System.out.print(i);
            System.out.println();
        }
        //________pascals triangle------
        for(int i=0;i<5;i++){
            for(int j=1;j<(5-i);j++)System.out.print(" ");
            int n=1;
            for(int k=0;k<=i;k++){System.out.print(n+" ");
        n=n*(i-k)/(k+1);}

            System.out.println();
        }
        }
       
    }
    


