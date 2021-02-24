package com.company;

public class Main5
{
    public static void main(String[] args)
    {
        int liczba;

        for (liczba = 1; liczba < 100; liczba++)
        {
            if (liczba %8 == 0)
            {
                System.out.println(liczba);
            }
        }
    }
}