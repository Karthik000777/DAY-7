
import java.util.Scanner;
class inputnameageaddress{
    public static void main(String[] args){
        Scanner panda=new Scanner(System.in);
        String name=panda.nextLine();
        Double age=panda.nextDouble();
        panda.nextLine();
        String address=panda.nextLine();
        System.out.println("my name is ;"+name);
        System.out.println("my age is:"+age);
        System.err.println("my address is:"+address);



}
}