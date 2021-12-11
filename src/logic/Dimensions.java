package logic;

public class Dimensions implements Validable,Comparable {

    private String longueurString;
    private String largeurString;
    private int longueur;
    private int largeur;
    private int longueurInitiale;
    private int largeurInitiale;

    public Dimensions(String longueurString, String largeurString) {
        this.longueurString = longueurString;
        this.largeurString = largeurString;
    }

    @Override
    public Boolean isValid() {

        if (!isDouble(longueurString) || !isDouble(largeurString)) {
            return false;
        }

        longueur = (int)Double.parseDouble(longueurString);
        largeur = (int)Double.parseDouble(largeurString);
        longueurInitiale = longueur;
        largeurInitiale = largeur;

        if (longueur != Double.parseDouble(longueurString) || largeur != Double.parseDouble(largeurString)) {
            return false;
        }
        return longueur > 0 && largeur > 0 && longueur >= largeur;
    }
    public Boolean toCompare(Validable v) {
        Dimensions dimensions_to_compare = (Dimensions)v;
        return (dimensions_to_compare.getLongueur() >= longueur) && (dimensions_to_compare.getLargeur() >= largeur);
    }

    public String getLongueurInitialeString() {return String.format("%d.00",longueurInitiale);}

    public String getLargeurInitialeString() {return String.format("%d.00",largeurInitiale);}

    public void setDimensions(int longueur, int largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
        longueurString = String.format("%d.00",longueur);
        largeurString = String.format("%d.00",largeur);
    }

    public int getLongueurInitiale() {
        return longueurInitiale;
    }

    public int getLargeurInitiale() {
        return largeurInitiale;
    }

    public int getLongueur() {
        return longueur;
    }

    public int getLargeur() {
        return largeur;
    }

}
