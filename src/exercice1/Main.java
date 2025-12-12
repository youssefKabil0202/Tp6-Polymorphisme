package exercice1;

public class Main {
    public static void main(String[] args) {
        Forme[] formes = new Forme[] {
                new Cercle("Rouge",   5.0),
                new Rectangle("Bleu", 4.0, 3.0),
                new Triangle("Vert",  6.0, 2.5),
                new Forme("Noir")     // Forme générique
        };

        // 2. Polymorphisme en action
        for (Forme f : formes) {
            f.dessiner();
        }
    }
}
