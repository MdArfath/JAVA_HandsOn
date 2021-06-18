package in.stackroute.main;

import java.util.Scanner;

public class Main {
        public static void main (String[]args)
        {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            String s = Integer.toString(num);
            int result = UserMainCode.checkSum(s);
            if (result == -1)
                System.out.println("Sum of odd digits is even.");
            else {
                System.out.println("Sum of odd digits is odd.");
            }

        }
}

class UserMainCode {

    static int checkSum(String s){
        char[] mychar = s.toCharArray();
        int sum = 0;
        for(int i=0; i<mychar.length; i++) {
            if (i % 2 != 0)
                sum += mychar[i];
        }
        if(sum%2 == 0)
            return -1;
        else
            return 1;
    }

}