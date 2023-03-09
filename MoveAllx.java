public class MoveAllx {
    public static void SetX(String str,int idx, int count, String newstr ){
        if(str.length()==idx){
            for(int i=0;i<count;i++){
                newstr+='x';
            }
            System.out.println(newstr);
            return;
        }
        char currchar = str.charAt(idx);
        if(currchar=='x'){
            count++;
            SetX(str, idx+1, count, newstr);
        }
        else{
            newstr+=currchar;
            SetX(str, idx+1, count, newstr);}
        
    }
    public static void main(String[] args) {
        String str="abxxcdxexd";
        SetX(str,0,0,"");
    }
    
    }

