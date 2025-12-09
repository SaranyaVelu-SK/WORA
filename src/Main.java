
// import java.util.Scanner;


// import conversion.Implicit;
// class Illustration {

//     int instanceNum = 10;
//     static int classNum = 20;

//     void func1() {
//         // int instanceNum = 11;
//         // int classNum = 22;
//         this.instanceNum = 33;
//         Illustration.classNum = 44;

//         System.out.println("Value of instance variable : " + this.instanceNum);
//         System.out.println("Value of static variable : " + Illustration.classNum);

//         System.out.println("instanceVar inside method : " + instanceNum);
//         System.out.println("staticVar inside method: " + classNum);
//     }
//     Illustration(){
//         this(66);
//     }
//     Illustration(int x){
//         System.out.println("constructor chaining   "+ x);
//     }
// }

// class Parent{
//     Parent(){
//         System.out.println("This is parent class");
//     }
// }
// class Child extends Parent{
//     int a =5;
//     Child(){
//         System.out.println("a : "+a);
//     }
// }
// class A{
//     B classVar;

//     A(B classVar){
//         this.classVar = classVar;
//     }

//     void valFromB(){
//         System.out.println("valFromBclass "+ this.classVar.val);
//     }
// }
// class B{
//     int val =25;
//      B(){
//         A obj = new A(this);
//         obj.valFromB();
//      }
// }

// class Tree{
//     Tree(){
//         System.out.println("This is parent tree - no args");
//     }
//     Tree(String s){
//         System.out.println("This is parent Tree - with string arg  " + s);
//     }
// }
// class Fruit extends Tree{
//     Fruit(){
//         this("Apple");
//         System.out.println("This is constructor chaining with super");
//     }
//     Fruit(String s){
//         super(s);
//         System.out.println("This is Apple Tree");
//     }
// }



/* POLYMORPHISM */

class Animal{
    String name = "Animals";
    void sound(){
        System.out.println("Animal sound");
    }
}
class Dog extends Animal{
    String name = "dog";
     @Override
     void sound(){
        System.out.println("Barks");
     }

     void color(){
        System.out.println("brown");
     }
}














public class Main {

    // public static void greet() {
    //     System.out.println("Hello from static method");
    // }

    // void greet2() {
    //     System.out.println("Hello from instance method");
    // }

    void paymentDetails(Payment x){
        x.pay();
        
    }
    public static void main(String[] args) {
        // System.out.println("main working");
        // /* IMPLICIT AND EXPLICIT CONVERSION 
        //    Implicit.impli();
        //    Explicit.expli(); */

        // /* METHODS */
        // greet(); //static method
        // Main mainObj = new Main();
        // mainObj.greet2();   //instance method
        // Method methodObj = new Method();
        // methodObj.greet3();
        // /* CALL STACK  */
        // Callstack.A();
        // Callstack.D();
        // Scanner scan = new Scanner(System.in);
        // int inputSize = scan.nextInt();
        // int[] arr = new int[inputSize];
        //         for(int i=0;i<arr.length;i++){
        //             arr[i]=scan.nextInt();
        //     System.out.println(arr[i]);
        // }
        // /* 2D ARRAYS */
        // int arr1[][] = {{1,2},{2,3,4},{5,6,7,8}};
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr1[i].length;j++){
        //         System.out.print(arr1[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        // Scanner input = new Scanner(System.in);
        // Integer rows, cols;
        // rows = input.nextInt();
        // cols = input.nextInt();
        // int arr2[][] = new int[rows][cols];
        // for(int i=0;i<rows;i++){
        //     for(int j=0;j<cols;j++){
        //         System.out.print(arr2[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        // int[][][] num = new int[3][][];
        // int i, j;
        // num[0] = new int[4][];
        // num[1] = new int[2][];
        // num[2] = new int[5][];
        // for (i = 0; i < num.length; i++) {
        //     for (j = 0; j < num[i].length; j++) {
        //         num[i][j] = new int[i + j + 1];
        //         System.out.println("size = " + num[i][j].length);
        //     }
        // }

        // Illustration ill = new Illustration();
        // B bToA =  new B();
        //  Child spr = new Child();

        // Fruit app = new Fruit();

        // Encapsule emp = new Encapsule();
        // emp.setName("saran");
        // System.out.println(emp.getName());






        /* POLYMORPHISM */
        Animal a = new Dog();
        System.out.println(a.name);
        a.sound();
        
        Main pd = new Main();
        pd.paymentDetails(new UPI());



    }
}
