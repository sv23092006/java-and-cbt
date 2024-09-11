import java.io.*;
import java.util.*;
public class demovector
{
    public static void main(String[] args) 
    {
        Vector vec=new Vector(5,2);
        System.out.println("Size="+vec.size());
        System.out.println("Capacity="+vec.capacity());
        for(int i=1;i<6;i++)
        vec.addElement(new Integer(i));
        System.out.println("The created Vector is:"+vec);
        System.out.println("capacity="+vec.capacity());
        System.out.println("size="+vec.size());
        vec.add(new Integer(13));
        System.out.println("size="+vec.size());
        int n = vec.size();
        Integer a[] = new Integer[n];
        vec.copyInto(a);
        System.out.println("The array element are:");
        for (int i=0;i<n;i++)
        System.out.println(vec.removeElement(new Integer(13)));
        System.out.println("size="+vec.size());
        String s=new String("God");
        vec.insertElementAt(s,2);
        System.out.println("The created Vector is:"+vec);
        vec.removeAllElements();
        System.out.println("The created Vector is:"+vec);
        System.out.println("size="+vec.size());

    }
}
