import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class myclassTest {
    int[] array = new int[] {1, 2, 3, 58, 47, 229, 40};
    myclass trial_1 = new myclass();
    @Test
    public void Test_max() {
        assertEquals(trial_1.max_value(array), 229);
        }
    @Test
    public void Test_min() {
        assertEquals(trial_1.min_value(array), 1);
    }
}