package Application1; // Déclaration de package

public class TestPoint {
    public static void main(String[] args) {
        Point point1 = new Point();
        point1.Afficher();
        point1.deplacer(2, 4);
        point1.Afficher();


        Point point2 = new Point(2, 4);
        point2.Afficher();
        point2.deplacer(1, 2);
        point2.Afficher();

        Point point3 = new Point(point2);
        point3.Afficher();
        point3.deplacer(8, 0);
        point3.Afficher();
    }
}
