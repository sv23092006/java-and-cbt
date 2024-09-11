import java.io.*;

public class Largest {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 0;

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter the value of the first number:");
            n1 = Integer.parseInt(br.readLine());

            System.out.println("Enter the value of the second number:");
            n2 = Integer.parseInt(br.readLine());

            int large = (n1 > n2) ? n1 : n2;
            System.out.println("The largest number is: " + large);

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
