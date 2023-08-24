import java.util.Scanner;

public class homeWork {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" please, input your expected number ");
        int expectedNumber  = Integer.parseInt(input.nextLine());
        if(expectedNumber<0){
            System.out.println(" This is positive number "+ expectedNumber);
        } else if (expectedNumber == 0) {
            System.out.println(" This is zero "+ expectedNumber);
        } else if (expectedNumber<10) {
            System.out.println(" This number is less than 10 "+ expectedNumber);
        } else if (expectedNumber<100 && expectedNumber != 23) {
            System.out.println(" nho hon 100");
        }else if (expectedNumber==23) {
            System.out.println(" la Minh ne "+ expectedNumber);
        }
        else {
            System.out.println(" so qua to "+ expectedNumber);
        }

    }
}
