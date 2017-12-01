package BookSort;

import java.util.*;

class Sorter {
public static void sort(List<Book> arr, Comparator compi) { 
    int j,x;
    Book temp;
   
        for(int i = 0; i < arr.size() - 1; i++){
        x=compi.compare(arr.get(i).name, arr.get(i+1).name);
        
        if (x>0) {
           temp = arr.get(i+1);
           arr.set(i+1, arr.get(i));      
           j = i;
           x=compi.compare(arr.get(j-1).name, temp.name);
           while (j > 0 && x>0 ) {
               arr.set(j,arr.get(j-1));               
               j--;
           }
           arr.set(j,temp);             
        }        
    }
}
}

