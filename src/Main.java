import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess = 0;

        System.out.println("Bienvenue dans le jeu 'Devinez le nombre' !");
        System.out.println("Tapez 'quit' à tout moment pour quitter le jeu.");

        while (true) {
            System.out.println("Devinez le nombre (entre 1 et 100) : ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("quit")) {
                System.out.println("Vous avez quitté le jeu. À bientôt !");
                break;
            }

            try {
                guess = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Veuillez entrer un nombre valide.");
                continue;
            }

            if (guess < targetNumber) {
                System.out.println("Plus grand !");
            } else if (guess > targetNumber) {
                System.out.println("Plus petit !");
            } else {
                System.out.println("Félicitations ! Vous avez trouvé le nombre.");
                break;
            }
        }

        scanner.close();
    }
}