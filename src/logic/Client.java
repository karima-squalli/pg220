package logic;

public class Client extends Personne {

    public Client() {
        super(0);
    }

    public Client(int id) {
        super(id);
    }

    public void ajouterPlanche(Planche planche) {
        super.ajouterP(planche);
    }

    public int getNombrePlanches() {
        return super.getNombreP();
    }
}
