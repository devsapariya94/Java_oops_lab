class InsufficientFunds extends Throwable{
    InsufficientFunds(String s){
        super(s);
    }
}

class IllegalTransfer extends Throwable{
    IllegalTransfer(String s){
        super(s);
    }
}
class BankAccount{
    String name;
    int balance;
    BankAccount(String s, int b){
        name=s;
        balance=b;
    }

    void withdraw(int a){
        try{
            if (a>balance){
                throw new InsufficientFunds("insufficient balance in the account");
            }
            else{
                balance=balance-a;
                System.out.println("Withdraw Done");
            }
        }
        catch(InsufficientFunds e){
            System.out.println(e);
        }
    }

    void deposit(int a){
        
    }

}

public class BankAcc {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("abc",  100);
        a1.withdraw(100);
    }
}
