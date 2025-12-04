
import java.util.Scanner;

// import conversion.Explicit;
// import conversion.Implicit;

public class Main {

    public static void greet() {
        System.out.println("Hello from static method");
    }

    void greet2() {
        System.out.println("Hello from instance method");
    }

    public static void main(String[] args) {
        System.out.println("main working");
        /* IMPLICIT AND EXPLICIT CONVERSION 
           Implicit.impli();
           Explicit.expli(); */

        /* METHODS */
        greet(); //static method
        Main mainObj = new Main();
        mainObj.greet2();   //instance method

        Method methodObj = new Method();
        methodObj.greet3();

        /* CALL STACK  */
        Callstack.A();
        Callstack.D();

        Scanner scan = new Scanner(System.in);
        int inputSize = scan.nextInt();
        int[] arr = new int[inputSize];
                for(int i=0;i<arr.length;i++){
                    arr[i]=scan.nextInt();
            System.out.println(arr[i]);
        }
    }
}
