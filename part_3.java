package new_pack;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class part_3 {

    public static int num(int a) {
        if (a >= 0) return a * 2;
        else return -a;
    }
        public static void main(String[] args) throws IOException  {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(num(Integer.parseInt(reader.readLine())));


    }
}
