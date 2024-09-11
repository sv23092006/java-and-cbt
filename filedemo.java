import java.io.*;
class filedemo
  {
 public static void main(String args[])
 {
    try{
         DataInputStream din=new
DataInputStream(System.in);
         System.out.println("Enter the data to write:");
        String s =din.readLine();
           FileOutputStream fout = new
FileOutputStream("demo.txt");
             byte b[] = s.getBytes();
             fout.write(b);
          System.out.println("File created successfully");
            
            fout.close();
       }
        catch (IOException e)
            {
            System.out.println(e);
        }
      }
    }   