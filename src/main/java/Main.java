import java.awt.*;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){



        int n;
        System.out.print("Enter no of term ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        int sum = 0;


        for (int i = 1; i <= n;i++)
        {sum = sum + i;}
        System.out.println("Addition "+ sum);







    }
}
