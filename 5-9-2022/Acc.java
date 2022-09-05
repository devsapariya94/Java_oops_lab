class Account {
    int accNo;
    static int count;
    {
        accNo=10001+count++;

    }
    private int  balance;
    private long mobileNo;
    private String Name;
    static String bankname="HDFC";

    public Account(){
        System.out.println("Account created without any information");
    }

    public Account(String name){
        System.out.println("Account created but you have not given the mobile number So account can not be linked " +
                "mobile no.");
    }
    public Account(String name,long mobileNo) {
        this.Name = name;
        this.mobileNo = mobileNo;
    }



    public int getAccNo() {
        return accNo;
    }

    public String getName() {
        return Name;
    }
    public void setName(String name){
        this.Name=name;
    }
    public long getMobileNo(){
        return mobileNo;
    }

    public void setMobileNo(long mobileNo){
        this.mobileNo=mobileNo;
    }

    public int getBalance() {
        return balance;
    }

    public String Deposit(int dep_money){
        this.balance+=dep_money;
        return (dep_money+"RS"+" debited to your account\n");
    }

    public String checkBalance(){
        return ("Your balance is : "+getBalance()+"\n");
    }
    public String withdraw(int money){
        this.balance-=money;
        return ("You have withdraw "+money+"RS from your account\n");

    }

    public void getAccinfo(){
        System.out.println("Bank name: "+bankname);
        System.out.println("Account holder name: "+getName());
        System.out.println("Mobile No."+getMobileNo());
        System.out.println("Account number :"+getAccNo());
        System.out.println("Balance : "+getBalance());
    }
}


class SavingAccount extends Account{
    int interestRate;

    public SavingAccount(){
        System.out.println("Savings Account created");
    }

    public SavingAccount(String name){
        System.out.println("Savings Account created ");
        name = this.getName();
        System.out.printf("Account holder name:%s", name);
    }

    public SavingAccount(String name,long number,int interestRate){
        super.setName(name);
        super.setMobileNo(number);
        this.interestRate=interestRate;

    }

    public String withdraw(int money){
        super.withdraw(money);
        if(super.getBalance()-money>1000){
            return ( money+"Rs has debited successfully from your account");
        }
        else{
            return ("Insufficient balance you can not withdraw money");
        }
    }

}

class Acc{
    public static void main(String[] args) {
        Account a1=new Account("Jainam Parekh", 8469422902L);
        System.out.println(a1.checkBalance());
        System.out.println(a1.Deposit(10000));
        System.out.println(a1.checkBalance());
        System.out.println(a1.withdraw(500));
        a1.getAccinfo();

//        Account a2=new Account();
//        a2.setAccount("Vasudev",7890964263L);
//        a2.Deposit(10000);
//        a2.withdraw(1300);
//        a2.getAccinfo();

        SavingAccount s1=new SavingAccount("Vasudev",7912982309L,7);
        System.out.println(s1.checkBalance());
        System.out.println(s1.Deposit(10000));
        System.out.println(s1.checkBalance());
        System.out.println(s1.withdraw(500));
        s1.getAccinfo();


    }

}