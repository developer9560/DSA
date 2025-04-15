// package Arraylist;
// a class whose object contains or wraps PDT
// object of wrapper class conain a field which stores PDT.
import java.util.ArrayList;

public class intro {
    public static void main(String[] args){
        // Integer n = new Integer(5);
        Integer n = Integer.valueOf(4);
        System.out.println(n);
        Float f = Float.valueOf(5.3f);
        System.out.println(f); 

        // syntax to create arrayList;
       ArrayList<Integer> list1 = new ArrayList<>();
       ArrayList<String> list2 = new ArrayList<>();
       list1.add(5);
       list1.add(34);
       list1.add(43);
       list1.addFirst(100);
       list1.addLast(200);
       list1.add(2, 90);
       list1.set(0, 1000);
       list1.remove(2);
       list1.remove(Integer.valueOf(200));
       System.out.println(list1  + " "+ list1.get(2));
       boolean ans = list1.contains(Integer.valueOf(5));
       System.out.println(ans);

       ArrayList allList = new ArrayList();
       allList.add("suraj");
       allList.add(5);
       System.out.println(allList);
     }
}
