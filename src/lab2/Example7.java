package lab2;

interface BankAccount{
    void writeOffMoneyFromAccount(double money);
    void balance();
    void setAmount(double deposit);

}
class Account implements BankAccount{
    private double amount;
    // Создание счета
    public Account(double amount) {
        if (amount >= 0) {
            this.amount = amount;
        } else {
            System.out.println("Депозит не может быть меньше 0");
        }
    }
    // Метод снятия наличных со счета
    public void writeOffMoneyFromAccount(double money) {
        if(amount>=money){this.amount -= money;
        System.out.println("Вы сняли со счета: "+money);
        }else {
            System.out.println("На вашем счете не достаточно средств");
        }
    }
//     Метод получения информации о счете
//    public double getAmount() {
//        return amount;
//    }


    public void balance(){
        System.out.println("На вашем счету осталось средств: " + amount);
    }
    // метод для вклада наличных для депозита
    @Override
    public void setAmount(double deposit) {
        this.amount += deposit;
        System.out.println("Вы положили на счет: "+deposit);
    }
}

public class Example7 {
    public static void main(String[] args) {
//        Account account = new Account(5000);
//        account.setAmount(3000);
//        System.out.println(account.getAmount());
//        account.writeOffMoneyFromAccount(2000);
//        System.out.println(account.getAmount());
        BankAccount bankAccount = new Account(5000);
        bankAccount.writeOffMoneyFromAccount(5000);
        bankAccount.balance();
        bankAccount.setAmount(10000);
        bankAccount.balance();
    }
}
