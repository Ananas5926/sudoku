
public class useGrille {
    public static void main( String [] args ) {

        int[][] g = new int[9][9];
            Grille grille = new Grille(g, false, 1, 81);

        for( int taille = 0 ; grille.getTAILLE() >= taille ; taille++ ){
            System.out.println(grille.toString());
        }
        return ;
    }
}
