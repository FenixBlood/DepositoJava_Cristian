public class TipiVariabili {
    public static void main(String[] args) {
        final int provaNumero = 12;
        String provaTesto = "Ciao Mondo";
        boolean provaBool = true;

        System.out.println(provaNumero);
        System.out.println(provaTesto);
        /* una costante non può cambiare il suo valore
        provaNumero = 20;
        */

        String testo ="Mondo";
        System.out.println("Ciao "+ testo);

        String firstPart = "Ciao";
        String lastPart = "Mondo";
        String fullPart = firstPart + lastPart;
        System.out.println(fullPart);

        // assegnazione referenziale
        int x = 5;
        int y = 6;
        System.out.println(x+y);

        // assegnazione referenziale
        int x = 5, y = 6, z = 50;
        System.out.println(x + y + z);
        
        // assegniazione a cascata
        int x, y, z;
        x = y = z = 50;
        System.out.println(x+y+z);

        
    }

}
