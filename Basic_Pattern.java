public class Pattern {
    public static void main(String[] args) {
        //.1............solid rectangle........
        for(int i=1; i<=4 ; i++){
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //..2........... hollow rectangle.....
        for(int i=1;i<=4;i++){
            for(int j=1;j<=5;j++){
                if(i==1||j==1||i==4||j==5)System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
        //...3.........half pyramid........
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        //....4..Inverted Half pyramid..
        for(int i=5;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        //.....5.inverted half pattern (rotated 180 degeree)
        for(int i=1;i<=4;i++){
            for (int j=1;j<=(4-i);j++){
                System.out.print(" ");}
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            
            System.out.println();            
        }
         int k=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k+" ");
                k=k+1;
            }
            System.out.println();
        }
        //.............o 1 triangle..
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
            }
            else System.out.print("0");
        }
        System.out.println();
    }
    
}
}