package bank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    Bank bank = new Bank();

    @Test
    public void testThatWhenAUSerCreateAccountTotalNumberOfAccountEqualsOne() {
        String name = "samuel eze";
        String pin = "1111";
        bank.createAccount(name, pin);
        assertEquals(1, bank.getTotalNumberOfAccount());
    }

    @Test
    public void testThatWhen_Two_Users_CreateAccount_TotalNumberOfAccountEquals_Two() {
        Account account1 = bank.createAccount("Samuel Eze", "1111");
        System.out.println(account1);
        Account account2 = bank.createAccount("Joshua Best", "2222");
        System.out.println(account2);
        assertEquals(2, bank.getTotalNumberOfAccount());
    }


    @Test
    public void testThat_when2kIsDeposited_ToAccount1_BalanceIs2k() {
        Account account1 = bank.createAccount("Samuel Eze", "1111");
        account1.deposit(2000);
        assertEquals(2000, account1.getBalance("1111"));
    }


    @Test
    public void testThat_Account1_With2kBalance_Transfers_1k_ToAccount2_BalanceIs_1k() {
        Account account1 = bank.createAccount("Samuel Eze", "1111");
        Account account2 = bank.createAccount("Joshua Best", "2222");
        account1.deposit(2000);
        account1.withdraw(1000);  // add a pin method to validate withdrawal
        account2.deposit(1000);
        assertEquals(1000, account1.getBalance("1111"));
        assertEquals(1000, account2.getBalance("2222"));
    }




        }