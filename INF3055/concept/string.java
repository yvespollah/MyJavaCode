package INF3055.concept;

public class string {

    public static void main(String[] args){
    String s = "C'est ";
    String t = s + "le moment";

    System.out.println(t);

    String t1 = s + " " + 2.4;

    System.out.println(t1);

    int len  = t.length();
    System.out.println(len);

    String sub = t.substring(3, 5); // extraction d'une sous-chaine
    System.out.println(sub);

    char c = t.charAt(2); // extraction d'un caractere
    System.out.println(c); 

    boolean b1;
    b1 = t.equals("helo"); // test d'egelite
    System.out.println(b1);

    int r;
    r=t.compareTo("bonjour"); //comparaison alphabetique (==o si il sont egaux, -ve si le premier est plus petit que le deuxieme et vive versa)
    System.out.println(r);

    r =t.indexOf(t); //recherche l'occurence de t dans t et renvoit le premier indice du caratere similaire. et si le text recherecher n'est pas present, la fonction renvoi -1
    System.out.println(r);

   r = t.indexOf(t, r+1); // il fait pareil que lautre juste que le deuxieme parametre indique ou la recherche de la sous chaine doit debuter
   System.out.println(r);

   r = t.lastIndexOf(t); // il affiche la dernierer occurence de t(sous chaine ) dans t et -1 si il n'existe pas
   System.out.println(r);

   r = t.lastIndexOf(t, r-1);
   System.out.println(r);

   String nouv = t.replace("a", "h"); // .replace("a", "h") est une méthode qui recherche toutes les occurrences de "a" dans la chaîne t et les remplace par "h".

   System.out.println(nouv);



 }   
}
