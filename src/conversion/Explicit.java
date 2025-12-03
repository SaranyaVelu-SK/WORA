package conversion;

public class Explicit {

    public static void expli() {
        int intNum = 65536;
        short shortNum2 = (short) intNum;
        System.out.println(shortNum2);

        char abc = 'A';
        int charNum = (int) abc;
        System.out.println(charNum);

        int intNum2 = 65;
        char char1 = (char) intNum2;
        System.out.println(char1);

        double floatNum = 9.876543E17;
        long longNum = (long) floatNum;
        System.out.println(longNum);
    }
}
