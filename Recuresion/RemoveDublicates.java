public class RemoveDublicates {
   static String remove(String s, int idx){
    if(idx==s.length()){
        return " ";
    }
    String Ans = remove(s, idx+1);
    char currentCh = s.charAt(idx);
    if(currentCh != 'a'){
        return currentCh+Ans;
    }else{
        return Ans;
    }
   }
    
    public static void main(String[] args) {
        
    }
}
