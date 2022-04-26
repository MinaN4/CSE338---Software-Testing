import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import static java.lang.System.in;

public class myclass extends InputStream {
    public String problem69A(int n) {
            Scanner sc = new Scanner(in);
            int x = 0, y = 0, z = 0;
            while (n-- >= 1) {
                x = x + sc.nextInt();
                y = y + sc.nextInt();
                z = z + sc.nextInt();
            }
            if (x == 0 && y == 0 && z == 0) {
                return "Yes";
            } else {
                return "No";
            }
    }

    @Override
    public int read() throws IOException {
        return 0;
    }
}
