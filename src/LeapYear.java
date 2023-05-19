import java.util.Scanner;

public class LeapYear {

        public static void leapCheck(int a){
            if(a%4==0 && a%100!=0 ||a%400==0 ){

                System.out.println(a +" is a leap year");
            } else{
                System.out.println(a +" is not leap year ");
            }

        }
        public static void main(String[] args) {
            System.out.println("Enter year to check leap year");
            Scanner scanner = new Scanner(System.in);
            int year = scanner.nextInt();
            leapCheck(year);

        }
    }


