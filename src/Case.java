

public class Case {
    private int valeur;
    private boolean visible;

    public Case(int val , boolean visible){
        this.valeur = val;
        this.visible = visible ; }

    public int getValeur(){return valeur;}
    public boolean getVisible(){return visible;}

    public void setVisible(boolean visible){ this.visible = visible ; }

}
