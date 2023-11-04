package Execice1;

public class exo1{
   public static void main(String[] args) {
      
      Point point1 =  new Point();
      point1.Afficher();
      point1.deplacer(1, 2);
      point1.Afficher();

      Point point2 =  new Point();
      point2.Afficher();
      point2.initialiser(1,1);
      point2.Afficher();

      point2.deplacer(1, 2);
      point2.Afficher();

      
   }
    
}
     class Point{
    private double abscisse;
    private double ordonnee;


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
