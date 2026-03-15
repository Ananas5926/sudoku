
public class Grille {
    private int[][] grille;
    private boolean remplissement ;
    private int niveau ; 
    public final int TAILLE = 81 ;  

    public Grille( int[][] grille , boolean remplissement , int niveau , int TAILLE){
            this.grille = grille;
            this.remplissement = remplissement ; 
            this.niveau = niveau ; 
        }

    public int[][] getGrille(){return this.grille;}
    public boolean getRemplissement(){return this.remplissement;}
    public int getNiveau(){return this.niveau;}
    public int getTAILLE(){return this.TAILLE;}


    public void setGrille(int[][] grille){this.grille = grille;}
    public void setRemplissement(boolean remplissement){this.remplissement = remplissement;}
    public void setNiveau(int[][] grille){this.niveau = niveau ;}

    public String toString(int[][] g){
        String rep = ""; 
        for(int t = 0 ; t < 81 ; t++){
            for( int a = 0 ; a < 81 ; a++){
                rep = rep + g[t][a] ; 
            }
        }
        return rep; 
    }
}
