package bank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    public void testThatNewAccountIsCreated() {
        BankAccount account = new BankAccount();

        assertNotNull(account);
    }


    @Test
    public void testThatMyBalanceISFiveThousandWhenIDepositFiveThousand() {
        BankAccount account = new BankAccount();

        account.deposit(5000);

        assertEquals(5000, account.getBalance());

    }

    @Test

    public void testThatICanWithrawTwoThousandFromThreeThousand() {
        BankAccount account = new BankAccount();

        account.deposit(3000);
        account.widthdraw(2000);

        assertEquals(1000, account.getBalance());

    }


    @Test
    public void testThatICanWithdrawMoreThanCurrentBalance() {
        BankAccount account = new BankAccount();

        account.deposit(3000);

        account.withdraw(4000);

        assertEquals(3000, account.getBalance());
    }


    @Test
    public void testThatBalanceshouldNotWithdrawWithoutPin() {

        BankAccount account = new BankAccount(2000, "1995");


        boolean result = account.withdraw(1000, null);


        assertFalse(result);
        assertEquals(0.0, account.getBalance());


    }

    @Test
    public void testToWithdrawSuccessfullyWithCorrectPin() {

        BankAccount account = new BankAccount(2000, "1122");

        boolean result = account.withdraw(1000, "1122");

        assertTrue(result);
        assertEquals(1000, account.getBalance());
    }


}