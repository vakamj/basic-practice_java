package new_pack;
import java.util.Scanner;

public class part_4 {

    public static boolean Massiv(int[] n1) {

            return ((n1.length>0) && (n1[0]==n1[n1.length-1]));
    }

  public static void main(String args[]) {
      Scanner scanner = new Scanner (System.in);
      System.out.println("Введите размер массива");

     int n=Integer.parseInt(scanner.nextLine());
     int[] n1= new int[n];
      System.out.println("Введите значения массива, всего "+n+" цифры");
      for (int i = 0; i <n; i++ )
      {
          n1[i]=Integer.parseInt(scanner.nextLine());
      }
      System.out.println(Massiv(n1));
   }
}