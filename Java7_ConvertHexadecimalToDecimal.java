public class Java7_ConvertHexadecimalToDecimal{
    public static void main(String[] args) {
        String hexaNumber = "25";

        int decimalNumber = Integer.parseInt(hexaNumber,16);//dont forgetthe radix indcating hexa= 16

        System.out.println("The answer is " + decimalNumber);

    }
}