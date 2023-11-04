package Execice1;

public class exo1{

   public  static class Point{
    public double abscisse;
    public double ordonnee;

      public Point(double abscisse , double ordonnee){
         this.abscisse  = abscisse;
         this.ordonnee = ordonnee;
      }


     public void initialiser(double x , double y){
        abscisse =  x;
        ordonnee =   y;

     }

     public void deplacer(double x, double y){
        abscisse = abscisse + x;
        ordonnee = ordonnee + y;
     }

     public void Afficher(){
        System.out.println("je suis un point de coordonnees "+abscisse +" et " + ordonnee);
     }

   }

public static class Pointcol extends Point{
   private byte couleur;
    
      public Pointcol(double abscisse , double ordonnee , byte couleur){
         super(abscisse, ordonnee);
         this.couleur = couleur;
      }

    public void colorer(byte color){
      this.couleur = color;
    }

    public void afficheCol(){
      System.out.println("je suis un point de coordonnees "+abscisse +" et " + ordonnee);
      System.out.println("jai une couleur "+couleur);
    }
}

public static void main(String[] args) {

   Pointcol point1 =  new Pointcol(2,4,(byte)1);
   
   point1.afficheCol();
   point1.deplacer(1, 2);
   point1.afficheCol();

   Point point2 =  new Point(2,4);
   point2.Afficher();
   point2.initialiser(1,1);
   point2.Afficher();

   point2.deplacer(1, 2);
   point2.Afficher();   


}
}