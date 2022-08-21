package lesson2;

public class BankAccount {
    private String id;
    private String name;
    private int balance;

    public BankAccount(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int plus){
        return balance += plus;
    }
    public int debit(int minus){
        if(minus > getBalance()){
            System.out.println("Недостаточно средств");
            return getBalance();
        }
        else{
            return balance - minus;
        }

    }
    public int transfer (BankAccount b, int amount){
        if(amount > getBalance()){
            System.out.println("Недостаточно средств");
            return getBalance();
        }else{
            b.credit(amount);
            return balance-=amount;}
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance;
    }

    public static void main(String[] args) {
        BankAccount d = new BankAccount("12", "sERGEY", 2000);
        System.out.println(d.credit(3000));
        System.out.println(d.debit(6000));
        System.out.println(d.transfer(new BankAccount("11","tim",2000),2000));
    }
}
