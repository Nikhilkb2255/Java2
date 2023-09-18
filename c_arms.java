import java.util.*;
class arms
{
    int num;
    arms(int x)
    {
        num = x;
    }

    public void f_arm()
    {
        int number,temp,total=0;
        number = num;
        while(number != 0)
        {
            temp = number % 10;
            total = total + temp*temp*temp;
            number /= 10;
        }
        if(total == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
    }
}

public class c_arms
{
    public static void main(String[] args)
    {
        int x;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the digit: ");
        x = s.nextInt();
        arms a1 = new arms(x);
        a1.f_arm();
    }
}
