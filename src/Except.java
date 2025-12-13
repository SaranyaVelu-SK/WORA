


class InsufficientBalanceException extends Exception{
        public InsufficientBalanceException(String msg){
            super(msg);
        }
    }

    class NegativeAmountException extends RuntimeException{

        public NegativeAmountException(String msg) {
            super(msg);
        }
        
    }


public class Except{
        private static int balance = 10000;
        void withdraw(int amount) throws InsufficientBalanceException{
            if(amount > balance){
                throw new InsufficientBalanceException("balance insufficient");
            }
            balance -= amount;
            System.out.println("withdrawn" + amount);
        }
        void deposit(int amount){
            if(amount< 0){
                throw new NegativeAmountException("Can\'t deposit negative amount");
            }
            balance+=amount;
            System.out.println("Amount deposited successfully " + balance);
        }
    
    //Arithmetic Error
  public int divide(int a, int b){
    try {
        return a/b ;
    } catch (ArithmeticException e) {
        System.out.println(e);    }
      return 0;
  }

  //Array Index Out of bound

  public void getIndex(int index){
    try {
        int[] arr = {2,4,3,5,1};
        System.out.println(arr[index]);
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println(e);
    }
  }
}