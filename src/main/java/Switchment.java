import java.sql.SQLOutput;
import java.util.Scanner;

public class Switchment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input your expected number: ");
        int month = Integer.parseInt(input.nextLine());
        switch (month) {
            case 1:
                System.out.println("tháng 1");
                break;
            case 2:
                System.out.println("tháng 2");
                break;
            case 3:
                System.out.println(" tháng 3");
                break;
            case 4:
                System.out.println(" tháng 4");
                break;
            case 5:
                System.out.println(" tháng 5");
                break;
            case 6:
                System.out.println(" tháng 6");
                break;
            default:
                System.out.println(" Hăm có năm nào của tháng "+ month );
        }
    }
}
