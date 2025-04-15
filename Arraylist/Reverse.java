
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Reverse {
    public static void main(String[] args) {
     
  
      ArrayList<Integer> list1 = new ArrayList<>();
      for(int i = 0 ;i<10;i++){
        int num =  (int)(Math.random()*100);
        list1.add(num);
      }
      System.out.println(list1);
     
      System.out.println(list1.reversed());
      Collections.sort(list1, Collections.reverseOrder());
      System.out.println(list1);
      Collections.sort(list1);
      System.out.println(list1);
    }
}
