package qa.homeworktwo;

public class HomeworkOne {

    public static void main(String[] args) {
        HomeworkOneArray firstArray = new HomeworkOneArray();
        HomeworkOnePhone firstPhone = new HomeworkOnePhone();
        BankAccount bankAccount = new BankAccount();
        System.out.println("Первое задание:");
        firstArray.arrayNew();
        System.out.println("Второе задание:");
        firstArray.sortArray(firstArray.ourArray);
        System.out.println("Третье задание:");
        firstPhone.setCompanyName("Apple");
        System.out.println("Производитель:"+firstPhone.getCompanyName());
        firstPhone.setCost(1000);
        System.out.println("Стоимость:"+firstPhone.getCost()+ "$");
        firstPhone.setCompanyName("Samsung");
        System.out.println("Производитель:"+firstPhone.getCompanyName());
        firstPhone.setCost(800);
        System.out.println("Стоимость:"+firstPhone.getCost()+ "$");
        System.out.println("Четвертое задание:");
        bankAccount.setBalance(15000);
        bankAccount.setSum(1000);
        bankAccount.setAccountNumber(12345678);
        System.out.println("Начисление средств:");
        bankAccount.credit(bankAccount.getAccountNumber(), bankAccount.getBalance(), bankAccount.getSum());
        System.out.println("Снятие средств:");
        bankAccount.debit(bankAccount.getAccountNumber(), bankAccount.getBalance(), bankAccount.getSum());

    }
}
