import java.util.HashMap; // u said make it unique

class BankAccount {
    int account_number;
    String holder_name;
    float balance;
    BankAccount(int account_number, String holder_name, float balance){
        this.account_number = account_number;
        this.holder_name = holder_name;
        this.balance = balance;
    }
    public void deposit(float amount){
        balance+=amount;
    }
    public void withdraw(float amount){
        balance-=amount;
    }
    public float checkBalance() {
        System.out.println(balance);
        return balance;
    }
}

class SavingsAccount extends BankAccount{
    double interest_rate;
    SavingsAccount(int account_number, String holder_name, float balance, double interest_rate){
        super(account_number,holder_name,balance);
        this.interest_rate = interest_rate;
    }
    public void addInterest(){
        balance+=(interest_rate*balance);
    }
}

public class Exercise_1 {
    public static void main(String[] args) {
        HashMap<Integer, SavingsAccount> accounts = new HashMap<>();
        accounts.put(1, new SavingsAccount(1,"AAAA",100, 2));

        SavingsAccount AAAA = accounts.get(1);

        AAAA.checkBalance();
        AAAA.addInterest();
        AAAA.checkBalance();
        AAAA.deposit((float)50.5);
        AAAA.checkBalance();
        AAAA.withdraw((float)20.5);
        AAAA.checkBalance();

        SavingsAccount B =  accounts.getOrDefault(2, null);
        if(B == null){
            System.out.println("\naccount no exist idk");
        }

    }
}