import static junit.framework.TestCase.assertEquals;

class myclassTest {

    @org.junit.jupiter.api.Test
    void problem4A() {
        myclass trial_1 = new myclass();
        assertEquals("Yes",trial_1.problem4A(8));
        assertEquals("No",trial_1.problem4A(5));
        assertEquals("Yes",trial_1.problem4A(88));
        assertEquals("No",trial_1.problem4A(3));
        assertEquals("No",trial_1.problem4A(67));
        assertEquals("Yes",trial_1.problem4A(100));
    }
}