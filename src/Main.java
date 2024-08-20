import java.util.Scanner;

class LanguageMenu {
    public void display() {
        System.out.println("Tilni tanlang:");
        System.out.println("1. O'zbekcha");
        System.out.println("2. Ruscha");
        System.out.println("3. Englishcha");
    }
}

class EnterMenu {
    public void display() {
        System.out.println("Kirish menyusi:");
        System.out.println("1. Kurslarni ko'rish");
        System.out.println("2. Ro'yxatdan o'tish");
        System.out.println("3. Kirish");
        System.out.println("4. Chiqish");
    }
}

class ShowCurrencyMenu {
    public void display() {
        System.out.println("Valyuta kurslari:");
        System.out.println("1. USD = 12 420 SUM");
        System.out.println("2. 1 EUR = 13 600 SUM");
        System.out.println("3. 1 RUB = 142 SUM");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LanguageMenu languageMenu = new LanguageMenu();
        EnterMenu enterMenu = new EnterMenu();
        ShowCurrencyMenu showCurrencyMenu = new ShowCurrencyMenu();

        languageMenu.display();
        int languageChoice = scanner.nextInt();

        if (languageChoice == 1) {
            enterMenu.display();
            int enterChoice = scanner.nextInt();

            if (enterChoice == 1) {
                showCurrencyMenu.display();
            } else if (enterChoice == 2) {
                // Ro'yxatdan o'tish
            } else if (enterChoice == 3) {
                // Kirish
            } else if (enterChoice == 4) {
                // Chiqish
            } else {
                System.out.println("Noto'g'ri tanlov");
            }
        } else if (languageChoice == 2) {
            // Ruscha
        } else if (languageChoice == 3) {
            // Englishcha
        } else {
            System.out.println("Kere bo'sa tarjima qivol");
        }
    }
}
