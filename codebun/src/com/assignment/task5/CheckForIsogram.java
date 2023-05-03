package com.assignment.task5;

import java.io.*;
import java.util.*;

public class CheckForIsogram {
	static boolean is_isogram(String str)
    {
        // Convert the string in lower case letters
        str = str.toLowerCase();
        int len = str.length();
 
        char arr[] = str.toCharArray();
 
        Arrays.sort(arr);
        for (int i = 0; i < len - 1; i++) {
            if (arr[i] == arr[i + 1])
                return false;
        }
        return true;
    }
 
    // Driver code
    public static void main(String[] args)
    {
        String str1 = "care";
        System.out.println(is_isogram(str1));
        
        String str2 = "isogram";
       
          // Function call
        System.out.println(is_isogram(str2));
 
        String str3 = "latha";
       
          // Function call
        System.out.println(is_isogram(str3));
 
        String str4 = "Ram";
       
          // Function call
        System.out.println(is_isogram(str4));
    }

}
