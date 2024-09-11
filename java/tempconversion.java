import java.io.*;
public class tempconversion 
{
  public static void main(String args[])
    {
      float F= 0f;
      float C= 0f; 
       try 
	{
	  DataInputStream din;
	  din=new DataInputStream(System.in);
	  System.out.println("Enter the value of celsius");
	  C=Float.parseFloat(din.readLine());
	  F=(C*9/5)+32;
	  System.out.println(C+"Celsius="+F);
	}
    catch(IOException e)
        {
	  System.out.println(e);
	}
	}
}