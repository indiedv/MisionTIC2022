package Arrays;

public class Foreach {
    public static void main(String[] args) {
        String[] names={"Luis","Peter","Andrea","Diana","Carol","Sophia","Lauren","Albert"};

       // for(int i=0;i< names.length;i++){
       //   System.out.print(names[i]+" ");
        for (String i:names){
            System.out.println(i);
        }
    }
}
