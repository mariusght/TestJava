package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class UniqueCharacters {

    public static void main (String args[])
    {
        boolean result=false;
        String inputstring="hello!";
        System.out.println("String method 3 answer "+ method3(inputstring));
    }
    public static boolean method3(String input)
    {
        ArrayList ar= new ArrayList();
        for (int i=0; i < input.length() ; i++ )
        {
            int j = input.indexOf(input.charAt(i));
            ar.add(j);
        }
        Collections.sort(ar);
        for (int i=0;i < (ar.size()-1);i++)
        {
            if (ar.get(i) == ar.get(i+1))
                return false;
        }
        return true;
    }
}
