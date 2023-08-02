import java.lang.reflect.Array;
import java.util.Random;

public class Main {

    public static void main(String[] args) {


        String[] nomi = {"mario rossi", "paolo bianchi", "sandro verdi", "gino paoli", "paolo blue", "antonio gialli" +
                "gianni ciano", "roberto topo", "carlo masso", "gigi nomo", "oscar faro", "matteo parto",
                "giulio andrei", "artiom priviet", "manuele ciao"};

        Random random = new Random();
        for (int i = 0; i < 11; i++) {

            int trovaNomi = random.nextInt(0, nomi.length);
            System.out.println(nomi(trovaNomi));

        }

        String[] ruoli = {"difensore", "centrocampista", "attaccante"};

    }
}
