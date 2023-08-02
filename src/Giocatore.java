public class Giocatore extends Persona{

    private String ruolo;



    public Giocatore(String nome, int eta, String ruolo) {
        super(nome, eta);
        this.ruolo = ruolo;
    }

    public String getRuolo() {
        return ruolo;
    }

    @Override
    public String toString() {
        return "Giocatore{" +
                "ruolo='" + ruolo ;
    }
}
