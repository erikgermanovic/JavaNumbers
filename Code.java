import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;
 
public class Code
{
  public static void main(String[] args)
                        throws FileNotFoundException
  {
    File file = new File("input.txt");
    Scanner sc = new Scanner(file);

    List<String> str_list = new ArrayList<String>();
 
    sc.useDelimiter("\\Z");

    while (sc.hasNext()) {
        str_list.add(sc.nextLine());
    }
    int number;
    for (int i = 0; i < str_list.size(); i++) {
        String[] parts = str_list.get(i).split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
        for (int j = 0; j < parts.length; j++) {
            try{
                number = Integer.parseInt(parts[j]);
                if (number >= 10) {
                    System.out.println(str_list.get(i));
                }
            }
            catch (NumberFormatException ex){
                ;
            }
        }
    }
    sc.close();
  }
}