import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
    public static void main (String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int X = ob.nextInt();
        int Y = ob.nextInt();
        int count =0;
        for (int i = X; i < Y; i = i + X) 
        {
            count++;
        }
        System.out.print(count);
    }
}


	

