public class Javamethod {
    public static void main(String[] args) {
        helloMinh();
        hellohm();
        print("minh");
        print("dfghssdfjsd");
        tong(5,6);
        tong(56,75);
        prntage("minh",99);
        prntage("tua",86567);
        int spare = spare(88);

        System.out.println(spare);

    }
    private static void helloMinh(){
        System.out.println(" Minh chan que");
    }
    private static void hellohm(){
        System.out.println("morning");
    }
    private static void print(String name){
        System.out.println("minh "+name);
    }
    private static void tong(int a, int b){
        int sum = a+b;
        System.out.println("tong la " +sum);
    }
    private static void prntage(String name, int age){
        System.out.println("name is "+ name+ " age is" + age);
    }

    private static  int spare(int number){
        int spare = number*number;
        return spare;

    }

}
