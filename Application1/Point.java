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

        public void deplacer(double dx , double dy){
            x = x + dx;
            y = y + dy;
        }

}