
package BookSort;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

class BookSort {

	public static void main(String[] args) {
               // array_of_book = Execute.insertIntoSort(array_of_book);
                ArrayOfBook ArrayX = new ArrayOfBook();
                Readtxt.read(ArrayX);
                
                for ( Book s : ArrayX.listOfBook ){
                    System.out.println(s.name);
                }
                
                MyNameComp compi = new MyNameComp();
                
                Sorter.sort(ArrayX.listOfBook,compi);
                
	}
        
        
        
}
        
