import java.util.*;
import java.io.*;

class exp9 
   {
   static public  void main(String[] args) throws IOException
 
        {
            BufferedReader  in = null;
            List<String> mylist = new ArrayList<String>();
            try
             {
              in = new BufferedReader(new FileReader("RAhul"));
              String str;
              int i =3;
               
              while((str = in.readLine())!= null) 
                 {
                     if(i%2==1)
                       {
                        
                          mylist.add(str);
                         
                       }
                   i++;
                 }
              }
              
      catch(FileNotFoundException e)  
            {

           e.printStackTrace();
            } 
      catch(IOException e)
              {
           e.printStackTrace();
              }
     finally 
        {
            if(in != null)
              
               {
                        
            in.close();
                         
              }
        }
          System.out.println(mylist);
     }
}

                 
