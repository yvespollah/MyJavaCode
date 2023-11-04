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

     public void identifie() {
      System.out.println("Je suis un point");
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

    public void identifie() {
      System.out.println("Je suis un point coloré de couleur \"" + couleur + "\"");
  }

 
}

public static void main(String[] args) {
   int i;

   Point[] tableauHeterogene = new Point[5];
   tableauHeterogene[0] = new Point(1.0, 2.0);
   tableauHeterogene[1] = new Pointcol(3.0, 4.0, (byte) 1);
   tableauHeterogene[2] = new Point(5.0, 6.0);
   tableauHeterogene[3] = new Pointcol(7.0, 8.0, (byte) 2);
   tableauHeterogene[4] = new Point(9.0, 10.0);

   for(i=0;i<tableauHeterogene.length;i++){
      tableauHeterogene[i].identifie();
   }

   Pointcol point1 =  new Pointcol(2,4,(byte)1);
   
   point1.Afficher();
   point1.deplacer(1, 2);
   point1.Afficher();

   Point point2 =  new Point(2,4);
   point2.Afficher();
   point2.initialiser(1,1);
   point2.Afficher();

   point2.deplacer(1, 2);
   point2.Afficher();   


}
}