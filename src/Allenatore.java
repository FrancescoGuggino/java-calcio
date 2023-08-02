public class Allenatore extends Persona{

    private String strategia;


    public Allenatore(String nome, int eta,String strategia) {
        super(nome, eta);
        this.strategia = strategia;
    }

    public String getStrategia () {
        return strategia;
    }



    @Override
    public String toString() {
        return "Allenatore{" +
                "strategia='" + strategia + '\'' +
                '}';
    }
}
