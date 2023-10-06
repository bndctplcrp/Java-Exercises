public class Java3_SwapTwoVariable{
    public static void main(String[] args) {
        
        int number1 = 23231;
        int number2 = 3423423;

        //use temp to swap the two variable

        int temp = number1;
        number1 = number2; // no need to use another datatype keyword  like int 
        number2 =temp;

        System.out.println("number1 ="+number1+ " and number2="+ number2);
    }
}