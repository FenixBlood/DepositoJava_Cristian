import java.util.Scanner; // Qui si importa la classe scanner
public class EsempioScanner {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // Qui si crea l'oggetto scanner
        System.out.println("Enter Username");

        String userName = myObj.nextLine(); // Qui l'utente inserirà un input dalla tastiera
        System.out.println("Username is: "+ userName);
    }
}
