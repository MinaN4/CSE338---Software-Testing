public class myclass {
    public static int max_value(int[] array) {
        int var = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > var) {
                var = array[i];
            }
        }
        return var;
    }

    public static int min_value(int[] array) {
        int var = array[0];
        for (int i=0; i < array.length; i++) {
            if (array[i] < var) {
                var = array[i];
            }
        }
        return var;
    }
}
