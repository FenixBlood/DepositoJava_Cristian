import java.util.Scanner; // Classe Scanner importata
public class EsercizioScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // oggetto scanner creato

        // lo scanner accetta stringhe con solo lettere
        System.out.println("Digita un nome: ");
        String nome = scanner.nextLine();
        System.out.println(nome + " è una stringa");

        // lo scanner accetta numeri interi tipo 12
        System.out.println("Digita un età: ");
        int eta = scanner.nextInt();
        System.out.println(eta + " è un intero");

        // lo scanner accetta solo numeri decimali con la virgola
        System.out.println("Digita un prezzo float");
        float prezzo1 = scanner.nextFloat();
        System.out.println(prezzo1 + " è un float");

        // lo scanner accetta solo numeri decimali con la virgola
        System.out.println("Digita un prezzo double");
        double prezzo2 = scanner.nextDouble();
        System.out.println(prezzo2 + " è un double");

        // lo scanner accetta solo valori true o false
        System.out.println("Digita vero o falso");
        boolean veritiero = scanner.nextBoolean();
        System.out.println(veritiero + " è un boolean");

    }
}
