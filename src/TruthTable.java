import java.util.Scanner;

import static java.lang.String.format;

public class TruthTable {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter how many variables you need");
        int variables=scan.nextInt();

        int rows=(1<<(variables));
        for (int i=0; i<=rows-1; i++){
            System.out.format("%0"+variables+"d", Integer.valueOf(Integer.toBinaryString(i)));
            System.out.print("|\n");
        }

    }
}