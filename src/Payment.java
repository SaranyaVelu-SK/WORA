

public class Payment{
        void pay(){
            System.out.println("Parent Payment");
        }
}
// 2. Child classes override the parent method
class UPI extends Payment {
    void pay() {
        System.out.println("Payment done using UPI");
    }
    void getPay(){
        System.out.println("Payment got using UPI");
    }
}

class Card extends Payment {
    void pay() {
        System.out.println("Payment done using Card");
    }
}

class Wallet extends Payment {
    void pay() {
        System.out.println("Payment done using Wallet");
    }
}


