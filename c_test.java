import java.util.*;
class c_test
{
    c_test(double d)
    {
        this(10);
        System.out.println("Double argument constructor");
    }

    c_test(int i)
    {
        this();
        System.out.println("Int argument constructor");
    }

    c_test()
    {
        System.out.println("No argument constructor");
    }

    public static void main(String[] args)
    {
        c_test t1 = new