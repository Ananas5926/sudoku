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
            System.out.println("ok");
            bouclePrincipale();
        }
    }

    public static void bouclePrincipale(){

        System.out.print("ok 2");


        int nbr = (int)(Math.random() * 10);
        
        Case valeur = new Case(nbr);
        System.out.println("val" + nbr);
        
    }

}

