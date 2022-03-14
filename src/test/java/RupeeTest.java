import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RupeeTest {
    @Test
    void oneTenRupeeNotSameAnotherTenRupee() {
        Rupee oneTenRupee = new Rupee(10);
        Rupee anotherTenRupee = new Rupee(10);

        assertNotSame(oneTenRupee, anotherTenRupee);
    }

    @Test
    void oneTenRupeeEqualsAnotherTenRupee() {

        Rupee oneTenRupee = new Rupee(10);
        Rupee anotherTenRupee = new Rupee(10);

        assertEquals(oneTenRupee, anotherTenRupee);


    }

    @Test
    void oneTenRupeeNotEqualsAnotherTenRupee() {

        Rupee tenRupee = new Rupee(10);
        Rupee fiveRupee = new Rupee(5);

        assertNotEquals(tenRupee, fiveRupee);

    }

    @Test
    void tenRupeeIsNotNull() {

        Rupee tenRupee = new Rupee(10);

        assertNotEquals(tenRupee, null);

    }

    @Test
    public void tenRupeeIsNotSameAsAnotherObject() {

        Rupee tenRupee = new Rupee(10);

        Object anotherObject = new Object();

        assertNotSame(anotherObject, tenRupee);
    }
}
