public class operators {
    public static void main(String[] args){
        int numberOne = 23;
        int numberTwo = 56;

        int myResult1 =  numberOne + numberTwo;
        System.out.println("Addition: " + myResult1);

        int myResult2 =  numberOne - numberTwo;
        System.out.println("Subtraction: " + myResult2);

        int myResult3 =  numberOne * numberTwo;
        System.out.println("Multiplication: " + myResult3);

        double myResult4 =  (double) numberOne / numberTwo;
        System.out.println("Division: " + myResult4);

        double myResult5 =  (double) numberOne % numberTwo;
        System.out.println("Remainder: " + myResult5);

        //Extra practice!
        double myResult6 = 3.14156;
        long rounded = Math.round(myResult6);
        System.out.println("Rounded: " + rounded);
    }
}
