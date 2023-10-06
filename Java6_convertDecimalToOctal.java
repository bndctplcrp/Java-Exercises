import java.util.Scanner;

public class Java6_convertDecimalToOctal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("input any Decimal number :");
        int decimalNumber = scan.nextInt();

        String OctalNumber = Integer.toOctalString(decimalNumber);

        System.out.println("The Octadecimal Number of Decimal number "+decimalNumber+" is "+ OctalNumber);
        scan.close();
    }
    }

