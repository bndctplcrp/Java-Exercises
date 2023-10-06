import java.util.Scanner;

public class Java5_ConvertDecimalToHexadecimal{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("input any Decimal number :");
        int decimalNumber = scan.nextInt();

        String HexaNumber = Integer.toHexString(decimalNumber);

        System.out.println("The Hexadecimal Number of Decimal number "+decimalNumber+" is "+HexaNumber);
        scan.close();
    }
}