import java.util.Scanner;

public class Problem4A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //this is the weight of lemon

        if (n%2 == 0) {

            if(n<=2) {
                System.out.println("NO");
            }
            else{

                System.out.println("YES");

            }
        }
        else {
            System.out.println("NO");
        }

    }
}
