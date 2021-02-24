package com.company;

public class Main3
{

        public static void main(String[] args)
        {
            // write your code here
            int liczba1 = -10;
            int liczba2 = 40;
            while ((liczba1++) < liczba2)
            {
                if ((Math.abs(liczba1) % 2 == 1))
                {
                    System.out.println(liczba1);
                }
            }
        }
}
