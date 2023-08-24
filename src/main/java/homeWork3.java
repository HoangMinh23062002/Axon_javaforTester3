public class homeWork3 {
    public static void main(String[] args) {
//        for(int i = 50; i>=0; i = i-2){
//            System.out.println(i);
//        }
        String Array = "we are the one, no one is second";
        String NewArray ="";
        int index = 0;
        while (index<Array.length()){
            char x = Array.charAt(index);
            if(x =='o'){
                NewArray = NewArray +65435430;
            }
            else {
                NewArray =NewArray +x;
            }
            index++;
         }
        System.out.println(NewArray);
    }
}
