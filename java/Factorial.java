import java.io.*;
class Factorial
{
  public static void main(String args[])
  {
    DataInputStream din=new
  DataInputStream(System.in);
      int n;
      try
      {
      System.out.println("Enter a positive integer.");
      n=Integer.parseInt(din.readLine());
      int f=1;
      for(int i=1;i<=n;i++)
      f*=i;
      System.out.println(+n+"!="+f);
      }
      catch(IOException e)
      {
    System.out.println(e);
      }
   }
}