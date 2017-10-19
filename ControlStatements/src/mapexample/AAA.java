package mapexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AAA {

    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();
        ArrayList<Integer> phone = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);

        System.out.println("Enter loop value");
        int t = s.nextInt(); // read number of element
        s.nextLine(); // consume new line
        String str[] = new String[t];
        for(int i=0;i<t;i++)
        {
         str[i]=s.nextLine();
        }

        System.out.println(Arrays.toString(str));
        }
    }
