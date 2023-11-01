package INF3055.concept;

public class Voiture{
    //attribut
    private String nom;
    private int puisance;
    private boolean estDemarrer;
    private double vitesse;

    public Voiture(String nom, int puissance, boolean estDemarrer, double vitesse){
        this.nom = nom;
        this.puissance = puissance;
        this.estDemarrer = estDemarrer;
        this.vitesse = vitesse;
    }

    public int deQuellePuissance(){
        return puissance;
    }

    public demarre(){
        estDemarrer = true;
    }

    public void accelere(double v){
        if(estDemarrer){
            vitesse = vitesse + v;
        }
    }

    public void afficher(){
        System.out.println("Voiture :" + this.toString());
    }
}