public class Callstack{
    public static void D(){
        float d = 2.54f;
        System.out.println("In method D " +  d);
    }
    public static void C(){
        double c =30.5;
        System.out.println("In method C " +  c);
    }
    public static void B(){
        int b=70;
        C();
        System.out.println("In method B " +  b);
    }
    public static void A(){
        int a = 25;
        B();
        System.out.println("In method A " +  a);
    }
}