import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        //int power = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a No");
        int num = scanner.nextInt();
        if(num<=0 || num<31){
            for(int i = 0; i<=num; i++){
                System.out.println(1 << i);


            }

        } else {
            System.out.println("Invalid Number");
        }


    }
}
