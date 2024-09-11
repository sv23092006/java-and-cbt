class one extends Thread
{
    public void run()
    {
        try {
            sleep(1000);
            System.out.println("good morning");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class two extends Thread
{
    public void run()
    {
        try
        {
            sleep(2000);
            System.out.println("Hello");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class three extends Thread
{
    public void run()
    {
        try
        {
            sleep(3000);
            System.out.println("welcome");
        }
        catch(Exception e)
    {
      System.out.println(e);
}
}
}
class threaddemo
{
    public static void main(String args[])
    {
        one a=new one();
        two b=new two();
        three c=new three();
        a.start();
        b.start();
        c.start();
    }
}