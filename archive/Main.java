import java.util.Scanner;


public class Main{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quel est votre nom ? ");
        String nom = scanner.nextLine();

        Joueur joueur = new Joueur(nom);
        System.out.println(" Quel difficultée voulez-vous: normal(1) " + joueur.getPseudo() + " ?");
        
        int difficulte = scanner.nextInt();
        if(difficulte == 1){
            bouclePrincipale();
        }
    }

    public static void bouclePrincipale(){
        System.out.println(" ");

        int nbr = (int)(Math.random() * 10);
        
        Case valeur = new Case(nbr);

        int[][] tab = new int[10][10];
        String tabb = "";
        int nb = 0; 
        for(int ligne = 0 ; ligne < 9 ; ligne++){
            for(int colonne = 0 ; colonne < 9 ; colonne++){

                nb =(int)(Math.random() * 10);
                tab[ligne][colonne] = nb;
                
                tabb = tabb + nb + " | ";
            }
            tabb = tabb + "\n";
        }
        System.out.println(tabb);

        Grille ligne = new Grille(tab);
        
    }
}

/*public estValide(int reponseJoureur){
    boolean rep = false; 
    if( reponseJoureur == 1){
        rep = True;
    }
 
    return rep ;
}*/