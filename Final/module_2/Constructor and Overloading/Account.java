class AccountDetail {
    int AccNo;
    static int count = 1;
    {
        AccNo = 10000 + count++;
    }
    private int Balance;
    private String Name;
    static String BankName = "Sate Bank Of India";
    private long MoblieNo;

    public int getAccNo() {
        return AccNo;
    }

    public long getMoblieNo() {
        return MoblieNo;
    }

    public String getName() {
        return Name;
    }

    public int getBalance() {
        return Balance;
    }

    AccountDetail(String name, long mobile) {
        Name = name;
        MoblieNo = mobile;
    }

    AccountDetail(String name) {
        Name = name;
    }

    public String Deposite(int amount) {
        Balance = Balance + amount;
        return ("You Deposite: " + amount + " rs\n Current Bank Balance for Account Number '" + getAccNo() + "' is "
                + getBalance() + " rs");
    }

    public String Withdraw(int amount) {
        Balance = Balance - amount;
        return ("You Withdraw: " + amount + " rs\n Current Bank Balance for Account Number '" + getAccNo() + "' is "
                + getBalance() + " rs");
    }

}

public class Account {
    public static int Total(AccountDetail arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i].getBalance();
        }
        return sum;
    }
    public static void main(String[] args) {
        AccountDetail AccHolder1 = new AccountDetail("Dev", 9999999999l);
        AccountDetail AccHolder2 = new AccountDetail("Mit");
        AccountDetail AccHolder3 = new AccountDetail("Neel", 9898989898l);
        AccountDetail AccHolder4 = new AccountDetail("Ved", 98942544334l);
        AccountDetail AccHolder5 = new AccountDetail("Roy", 9845436654l);
        System.out.println(AccHolder1.Deposite(110));
        System.out.println(AccHolder2.Deposite(800));
        System.out.println(AccHolder3.Deposite(300));
        System.out.println(AccHolder4.Deposite(500));
        System.out.println(AccHolder5.Deposite(100));
        System.out.println(AccHolder1.Withdraw(10));
    
        AccountDetail[] dtl = {AccHolder1,AccHolder2,AccHolder3,AccHolder4,AccHolder5 };
        System.out.println("The Total Ammount in the Bank is: "+Account.Total(dtl));
    }
}
