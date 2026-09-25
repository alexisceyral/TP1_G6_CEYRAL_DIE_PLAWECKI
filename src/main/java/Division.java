import java.util.Scanner;

public class Division {

    // Fonction division() - similaire à sum()
    public static void division(int a, int b) {
        if (b == 0) {
            System.out.println("Erreur: Division par zéro impossible!");
        } else {
            int result = a / b;
            System.out.println(a + " / " + b + " = " + result);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez le premier nombre (dividende): ");
        int num1 = scanner.nextInt();

        System.out.println("Entrez le deuxième nombre (diviseur): ");
        int num2 = scanner.nextInt();

        // Appel de la fonction division()
        division(num1, num2);
    }
}