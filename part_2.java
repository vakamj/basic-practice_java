package new_pack;
import java.util.Scanner;
public class part_2 {
    public static String Hello(String argument) {
        String   a = "Hello, ";
        a+=argument;
        return a;
    }
   public static void main(String[] args) {
       Scanner scanner = new Scanner (System.in);
       System.out.println(Hello(scanner.nextLine()));
    }
}