import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        Scanner reader = new Scanner(System.in);//object creation
        int num = reader.nextInt();//reading the integer number
        reader.close();
        if(num % 2 ==0)
         {
             System.out.print("\nEntered number" + num + "is an Even number");
         }
        else
        {
            System.out.print("\nEntered number" + num + "is an odd number");
        }
    }
}
