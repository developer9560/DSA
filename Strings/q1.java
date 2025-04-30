public class q1 {
    public static void main(String[] args){
        String str = "abcd";
        for(int i = 0; i < str.length(); i++){
            for(int j = i; j < str.length(); j++){
                System.out.println(str.substring(i, j + 1)); // substring() method to get the substring from index i to j
            }
        }
    }
}
