import java.util.Random;

public class Persona {

    // attributi
    private String nome;

    private int eta;


    // costruttori

    public Persona (String nome, int eta){

        Random random = new Random();
        int etaRandom = random.nextInt(18,40);
        this.nome = nome;
        this.eta = etaRandom;

    }

    // getter setter

    public String getNome () {
        return nome;
    }

    public int getEta () {
        return eta;
    }

    // metodi

    @Override
    public String toString() {
        return "nome: " + nome + " età: " + eta;
    }
}
