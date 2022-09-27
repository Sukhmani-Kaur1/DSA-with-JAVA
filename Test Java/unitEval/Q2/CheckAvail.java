package unitEval.Q2;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class CheckAvail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Date of birth:");
        int dd = sc.nextInt();
        System.out.println("Enter your month of birth:");
        int MM = sc.nextInt();
        System.out.println("Enter your year of birth:");
        int yy = sc.nextInt();
        LocalDate ld = LocalDate.of(yy,MM,dd);
        LocalDate now = LocalDate.now();
        int diff = now.compareTo(ld);

        if(now.isBefore(ld)){
            System.out.println("Date of birth should not be in future");
        }else if(now.isEqual(ld)){
            System.out.println("Happy Birthday, You are eligible to cast your vote");
        }else if(diff>=18){
            System.out.println("You are eligible to cast your vote");
        }else{
            System.out.println("please pass the date in the proper format");
        }
    }
}
