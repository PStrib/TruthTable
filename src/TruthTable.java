import java.util.Scanner;

public class TruthTable {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter how many variables you need");
        int variables=scan.nextInt();

        for (int i=0; i<=variables; i++){
            System.out.println(Integer.toBinaryString(i));
        }
    }
}