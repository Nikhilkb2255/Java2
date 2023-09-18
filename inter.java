import java.util.*;

interface shape
{
    void input();
    void area();
    void perimeter();
}

class circle implements shape
{
    int r=0;
    double pi=3.14, a=0, p=0;
    
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius : ");
        r = sc.nextInt();
    }
    
    public void area()
    {
        a = pi*r*r;
        System.out.println("Area of circle is "+a);
    }
    
    public void peri()
    {
        p = 2*pi*r;
    }
}

class rect implements shape
{
    int r=0;
    double pi=3.14, a=0, p=0;
    
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius : ");
        r = sc.nextInt();
    }
    
    public void area()
    {
        a = pi*r*r;
        System.out.println("Area of circle is "+a);
    }
    
    public void peri()
    {
        p = 2*pi*r;
    }
}

class cal
{
    public static void main(String args[])
    {
        circle x = new circle();
        x.input();
        x.area();
        x.peri();
    }
}