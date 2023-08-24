public class JavaLoops {
    public static void main(String[] args) {
        int amount = 12;
        for(int i =0; i<=amount; i++){
            if(i==33){
                System.out.println(" du r");
                break;
            }
            System.out.println(i);
        }
        String [] so = {" minh","tu","hiue","phuong","dao","man", "hong"};
        for(String soo: so){
            System.out.println(soo);
        }

        int i =0;
        while (i<=4){
            System.out.println(i);
            i++;
        }
        System.out.println("--------------------------------------------------------");
        int n = 7;
        do{
            if(n==1){
                System.out.println("hihhihi");
                continue;
            }
            System.out.println(n);
            n--;
        } while (n>2);

    }
}
