package qa.homeworktwo;
import java.util.Scanner;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BankAccountTest {
    private BankAccount bankAccount;

    @Before

    public void setup(){
        System.out.println("Before");
        bankAccount = new BankAccount();

    }
    @Test
    public void testsetBalance() {
        System.out.println("setBalance");
        int expResult = 50000;
        bankAccount.setBalance(expResult);
        int actResult = bankAccount.getBalance();
        assertEquals(actResult, expResult);
    }
    @Test
    public void testsetAccountNumber() {
        System.out.println("setAccountNumber");
        long expResult = 12345678;
        bankAccount.setAccountNumber(expResult);
        long actResult = bankAccount.getAccountNumber();
        assertEquals(actResult, expResult);
    }
    @Test

    public void testgetBalance(){
        System.out.println("getBalance");
        int expResult = 50000;
        bankAccount.setBalance(50000);
        int actResult = bankAccount.getBalance();
        assertEquals(expResult, actResult);
    }
    @Test
    public void testgetSum(){
        System.out.println("getSum");
        int expResult = 1000;
        bankAccount.setSum(1000);
        int actResult = bankAccount.getSum();
        assertEquals(expResult, actResult);
    }
    @Test
    public void testsetSum() {
        System.out.println("setSum");
        int expResult = 1000;
        bankAccount.setSum(expResult);
        int actResult = bankAccount.getSum();
        assertEquals(actResult, expResult);
    }

    @Test
    public void testCredit(){
        System.out.println("Credit");
        int expBalance = 2000;
        int expSum = 1000;
        int expAccountNumber=12345678;
        long expResult = 3000;
        bankAccount.setAccountNumber(expAccountNumber);
        bankAccount.setBalance(expBalance);
        bankAccount.setSum(expSum);

        assertEquals(expResult, bankAccount.credit(bankAccount.getAccountNumber(),bankAccount.getBalance(),bankAccount.getSum()));
    }
    @Test
    public void testDebit(){
        System.out.println("Debit1");
        int expBalance = 2000;
        int expSum = 1000;
        int expAccountNumber=12345678;
        long expResult = 1000;
        bankAccount.setAccountNumber(expAccountNumber);
        bankAccount.setBalance(expBalance);
        bankAccount.setSum(expSum);
        assertEquals(expResult, bankAccount.debit(bankAccount.getAccountNumber(),bankAccount.getBalance(),bankAccount.getSum()));

        System.out.println("Debit2");
        int expBalance2 = 2000;
        int expSum2 = 8000;
        int expAccountNumber2=12345678;
        int expResult2 = 2000;
        bankAccount.setAccountNumber(expAccountNumber2);
        bankAccount.setBalance(expBalance2);
        bankAccount.setSum(expSum2);

        assertEquals(expResult2, bankAccount.debit(bankAccount.getAccountNumber(),bankAccount.getBalance(),bankAccount.getSum()));
    }
}
