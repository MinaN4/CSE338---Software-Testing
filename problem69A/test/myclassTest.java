import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static junit.framework.TestCase.assertEquals;

class myclassTest {

    @Test
    void problem69A() {
        myclass trial_1 = new myclass();
        Scanner sc = new Scanner(System.in);
        assertEquals("No",trial_1.problem69A(3));
    }
}