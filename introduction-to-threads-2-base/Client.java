import java.io.*;
import java.util.Scanner;
public class Client {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();


        Adder adds = new Adder(x,y);

        ScalerThread t1 = new ScalerThread(adds);
        t1.start();

    }
}
