import java.util.Scanner;

public class HarmonicNo {
    public static void main(String[] args) {
        double harmonicNo = 0.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a No");
        int num = scanner.nextInt();
        if (num == 0){
            System.out.println(" Invalid input");

        }
        for(int i =1; i<=num; i++){
            harmonicNo += (double) 1/i;

        }
        System.out.println(" Nth harminc no is "+harmonicNo);
    }
}
