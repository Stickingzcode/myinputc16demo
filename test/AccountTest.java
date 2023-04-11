import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AccountTest {

    @Test
    public void testThatAccountObjectCanBeCreated(){
        //given
        Account myAccount;
        //when
        myAccount = new Account();
        //assert
        assertNotNull(myAccount);
    }
    @Test
    public void testToSetAccountName (){
        //given
        Account myAccount = new Account();
        //when
        myAccount.setName("Torin");
        //assert

    }
}
