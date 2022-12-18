
package task5;
import java.util.Scanner;

public class Task5 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
       
        
        String line = "Good morning , There are cheese , olive , and bread ";
        for (int i=0 ; i<line.length(); i++){
        char ch = line.charAt(i);
        if (ch==','){
          line= line.replaceAll(",", "");
        }
        }
        System.out.println(line);
    }  
}
