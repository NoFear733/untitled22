package BookSort;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Readtxt {
    public static void read(ArrayOfBook X) {
        FileReader fileReader = null;
        try {
            String file = Readtxt.class.getClassLoader().getResource("Book").getPath();
            fileReader = new FileReader(file);
            BufferedReader buff = new BufferedReader(fileReader);
            while (buff.ready()){
                String[] arr = buff.readLine().split(" ");
                if(arr[0].equals("b")){
                    
                    X.addBook(arr[1],arr[2],arr[3]);
                    

                    
                }
                else{

                    X.addBookFlibusta(arr[1],arr[2],arr[3],arr[4]);
                    
                }
                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Readtxt.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Readtxt.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fileReader.close();
            } catch (IOException ex) {
                Logger.getLogger(Readtxt.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
