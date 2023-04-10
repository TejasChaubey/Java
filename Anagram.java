package String;

public class Anagram {
    public static boolean isAnagram(String a , String b){
        if(a.length()!= b.length()){
            return false;
        }
        int arr[]= new int [26];
        for(int i=0;i<a.length();i++){
            arr[a.charAt(i)-'a']++;
            arr[b.charAt(i)-'a']--;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        String str1 = "tejas";
        String str2 = "sajet";
        boolean ans = isAnagram(str1,str2);
        if(ans){
            System.out.println("Anagram");
        }
        else
        System.out.println("not an Anagram");
    }
    
}
