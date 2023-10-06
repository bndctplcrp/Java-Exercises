public class Java2_AddToBinaryNumbers{
    public static void main(String[] args) {
        
        String binaryNumber1 = "10101"; // a binary is in String data type
        String binaryNumber2 = "101001";

        //convert the binary into decimal number first

        int decimalNumber1 = Integer.parseInt(binaryNumber1,2); // 
        int decimalNumber2 = Integer.parseInt(binaryNumber2, 2);

        //Get the sum of decimal

        int sum = decimalNumber1 + decimalNumber2;
        
        //convert the decimal to binary

        String sumOfBinary = Integer.toBinaryString(sum);

        System.out.println("The sum of of "+binaryNumber1+" and "+binaryNumber2+ " is " + sumOfBinary);

    }

}