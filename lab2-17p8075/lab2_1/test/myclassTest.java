import static org.junit.Assert.assertEquals;

class myclassTest {

    @org.junit.jupiter.api.Test
    void test_even_odd() {
        myclass trial_1 = new myclass();
        assertEquals(trial_1.even_odd(2), "Even");
        assertEquals(trial_1.even_odd(3), "Odd");
        assertEquals(trial_1.even_odd(99), "Odd");
        assertEquals(trial_1.even_odd(122), "Even");
    }
}