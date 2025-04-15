

public class SortFruitsName {

    static void selectionsort(String []fruits){
        for(int i = 0; i<fruits.length;i++ ){
            int minIdx = i;
            for(int j = i+1; j<fruits.length;j++){
                if(fruits[j].compareTo(fruits[minIdx])<0){
                    minIdx = j;
                }  
            }
            String temp = fruits[i];
            fruits[i]=fruits[minIdx];
            fruits[minIdx]= temp;
        }
    }

    public static void main(String[] args) {
        String fruits[] = {"papaya", "lime", "watermelon","apple","mango","kiwi", "apqple"};
        selectionsort(fruits);
        for (String string : fruits) {
            System.out.print(string + " ");
        }
    }
    
}

