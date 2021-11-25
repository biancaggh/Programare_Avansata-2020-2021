package lab5_optional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class addCommand{
   public static Object add() throws IOException {
       String name;
       String an;
       String autor;
       String scor;
       BufferedReader reader = new BufferedReader(
               new InputStreamReader(System.in));
       String s = reader.readLine();
       System.out.println(s);
       if(s=="Book"){
           {
               System.out.println("Introduceti titlul:");
               name= reader.readLine();
               System.out.println("Introduceti anul publicarii:");
               an=reader.readLine();
               System.out.println("Introduceti numele autorului:");
               autor=reader.readLine();
           }
       }
       else if(s=="Movie"){
           System.out.println("Introduceti titlul:");
           name= reader.readLine();
           System.out.println("Introduceti anul aparitiei:");
           an=reader.readLine();
           System.out.println("Introduceti rating ul:");
           scor=reader.readLine();
       }
       return null;
   }
}
