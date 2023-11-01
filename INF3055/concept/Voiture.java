package INF3055.concept;

public class Voiture{
    //attribut
    private String nom;
    private int puissance;
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

    public void demarre(){
        estDemarrer = true;
    }

    public void accelere(double v){
        if(estDemarrer){
            vitesse = vitesse + v;
        }
    }

    public void afficher(){
        System.out.println("Voiture :" + this.toString());
        System.out.println("Nom :"+ nom);
        System.out.println("Puissance :" + puissance);
        System.out.println(" est demarree ? :"+estDemarrer);
        System.out.println("Vitesse :"+ vitesse);

    }

    public static void main(String args[]){
        Voiture voiture1 = new Voiture("Rav4", 10, true, 2.6);
        Voiture voiture2 = new Voiture("Yaris", 6, false, 2);

        
        voiture1.accelere(1);
        voiture1.afficher();

        voiture2.demarre();
        voiture2.accelere(0.9);
        voiture2.afficher();

    }
}