public class Grille {
    private int[][] grille;
    private boolean complette;

    public Grille(int[][] line){
            this.grille = line;      
        }

    public int[][] getLigne() {
        return grille;
    }

    public boolean getComplette() {
        return complette;
    }

}