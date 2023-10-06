public class Java4_MultiplyTwoBinaryNumbers {
    public static void main(String[] args) {
        
        String binaryNumber1 = "10100";
        String binaryNumber2 = "10010";

        int decimalNumber1 = Integer.parseInt(binaryNumber1, 2);
        int decimalNumber2 = Integer.parseInt(binaryNumber2, 2);
        // need to input radix to inform that itis a binary numner

        int product = decimalNumber1 * decimalNumber2 ;

        String productOfBinary = Integer.toBinaryString(product);

        System.out.println("The product of two Binary numbers "+binaryNumber1+" and "+binaryNumber2+" is "+ productOfBinary);
    }
}
