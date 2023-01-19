import java.util.Scanner;

public class scannercridet {
    public static void main(String[] args) {
        Scanner cridet = new Scanner(System.in);
        for (int i = 0; i <= 10; i++) {
            System.out.println("yo should apply for a cridet card");
            String card = cridet.next();
            if (card.equalsIgnoreCase("yes")) {
                System.out.println("congratulation");
                break;
            }

        }
    }
}



