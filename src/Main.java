
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

        /* 2D ARRAYS */
        int arr1[][] = {{1,2},{2,3,4},{5,6,7,8}};

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                System.out.print(arr1[i][j]+" ");

            }
            System.out.println();
        }

        Scanner input = new Scanner(System.in);
        Integer rows, cols;
        rows = input.nextInt();
        cols = input.nextInt();
        int arr2[][] = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr2[i][j]+" ");

            }
            System.out.println();
        }

       
        int[][][] num = new int[3][][];
        int i, j;
        num[0] = new int[4][];
        num[1] = new int[2][];
        num[2] = new int[5][];
        for (i = 0; i < num.length; i++) {
            for (j = 0; j < num[i].length; j++) {
                num[i][j] = new int[i + j + 1];
                System.out.println("size = " + num[i][j].length);
            }
        }
    
    }
}
