package qa.homeworktwo;
import java.util.Scanner;

public class BankAccount {
    long accountNumber;
    int balance;
    int sum;

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }


    public void setSum(int sum)
    {
        this.sum  = sum;
    }

    public int getSum() {

        return sum;
    }



    public int credit(long accountNumber, int balance, int sum){

        System.out.println("Текущий баланс: "+ balance);
        System.out.println("Номер получателя: "+ accountNumber);
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму начисления: ");
        int sum = scanner.nextInt();*/

        System.out.println("Сумма начисления: "+ sum);
        //scanner.close();

        this.balance = this.balance+ sum;
        System.out.println("Текущий баланс: "+ this.balance);
        System.out.println("Вы вышли с аккаунта");

        return this.balance;


    }
    public int debit(long accountNumber1, int balance, int sum){


        System.out.println("Текущий баланс: "+ balance);
        System.out.println("Номер получателя: "+ accountNumber1);
        /*Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Введите сумму перевода: ");
        int sum = scanner.nextInt();*/

        System.out.println("Сумма перевода: "+ sum);
        //scanner.close();
        if (this.sum> this.balance){
            System.out.println("Сумма снятия больше чем остаток на счету!");
        }
        if(sum< this.balance){
            /*System.out.print("Введите номер получателя: " );
            int accountNumber2= scanner2.nextInt();
            System.out.println("Номер счета получателя: "+ accountNumber2);*/

            this.balance = this.balance - this.sum;
            System.out.println("Текущий баланс: " + this.balance);

        }

        System.out.println("Вы вышли с аккаунта");


        return this.balance;

    }
}
