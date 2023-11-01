package Application1; // Déclaration de package

import Application1.Point; // Import de la classe Point depuis le même package

public class TestPoint {
    public static void main(String[] args) {
        Point point1 = new Point();
        point1.Afficher();

        Point point2 = new Point(2, 4);
        point2.Afficher();

        Point point3 = new Point(point2);
        point3.Afficher();
    }
}
