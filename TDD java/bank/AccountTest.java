package bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    Account account = new Account("Samuel", "1111", "550008");


    @Test
    public void newAccount_balanceIsZeroTest(){
        assertEquals(0, account.getBalance("1111"));
    }

    @Test
    public void newAccount_deposit2k_balanceIs2kTest(){
        account.deposit(2_000);
        assertEquals(2_000, account.getBalance("1111"));
    }

    @Test
    public void newAccount_deposit2k_withdraw_Minus_5k_balanceIs2kTest(){
        account.deposit(2_000);
        assertEquals(2_000, account.getBalance("1111"));
        account.withdraw(-5_000);
        assertEquals(2_000, account.getBalance("1111"));
    }

    @Test
    public void newAccount_deposit2k_withdraw10k_balanceIs2kTest(){
        account.deposit(2_000);
        assertEquals(2_000, account.getBalance("1111"));
        account.withdraw(10_000);
        assertEquals(2_000, account.getBalance("1111"));
    }


    @Test
    public void newAccount_deposit2k_withdraw1k_balanceIs1kTest(){
        account.deposit(2_000);
        assertEquals(2_000, account.getBalance("1111"));
        account.withdraw(1_000);
        assertEquals(1_000, account.getBalance("1111"));
    }

}
