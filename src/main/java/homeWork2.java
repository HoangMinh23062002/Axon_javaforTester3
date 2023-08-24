import java.util.Scanner;

public class homeWork2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter day that you really want");
        int day = Integer.parseInt(input.nextLine());
        switch (day) {
            case 2:
                System.out.println(" thu2");
                break;
            case 3:
                System.out.println(" thu 3");
                break;
            case 4:
                System.out.println("thu 4");
                break;
            case 5:
                System.out.println(" thu 5");
                break;
            case 6:
                System.out.println("thu 6");
                break;
            default:
                System.out.println(" cuoi tuan");
        }

    }
}
