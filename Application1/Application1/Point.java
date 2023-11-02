package Application1;

public class Point{
    private double x;
    private double y;

    //constructeur surcharger( constructeur par defaut)

     public Point(){
            this.x = 0;
            this.y = 0;
        }

    public Point(double x, double y){
            this.x = x;
            this.y = y;
        }

    
    // Constructeur pour créer un point par copie d'un autre point
    public Point(Point autrePoint) {
        this.x = autrePoint.x;
        this.y = autrePoint.y;
    }
    

        public void deplacer(double dx , double dy){
            x = x + dx;
            y = y + dy;
        }

        public void Afficher(){
            System.out.println("Les coordonnees du point est (" +x+","+y+")");
        }

          // Méthode pour calculer la distance entre le point actuel et un autre point donné
    public double distance(Point autrePoint) {
        double deltaX = this.x - autrePoint.x;
        double deltaY = this.y - autrePoint.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

}