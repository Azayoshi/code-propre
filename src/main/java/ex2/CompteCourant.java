package ex2;

public abstract class CompteCourant{

    private String type ;
    private double solde;
    private double tauxRemuneration ;
    private int decouvert = -150 ;

    /**
     * constructeur de livretA
     * @param type
     * @param solde
     * @param tauxRemuneration
     */
    public CompteCourant(String type, double solde, double tauxRemuneration) {
        this.type = type;
        this.solde = solde;
        this.tauxRemuneration = tauxRemuneration;
    }


    /**
     * get
     * @return type
     */
    public String getType() {
        return type;
    }
    /**
     * set
     * @return type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * get
     * @return solde
     */
    public double getSolde() {
        return solde;
    }
    /**
     * set
     * @return solde
     */
    public void setSolde(double solde) {
        this.solde = solde;
    }

    /**
     * get
     * @return tauxRemuneration
     */
    public double getTauxRemuneration() {
        return tauxRemuneration;
    }
    /**
     * set
     * @return tauxRemuneration
     */
    public void setTauxRemuneration(double tauxRemuneration) {
        this.tauxRemuneration = tauxRemuneration;
    }

    /**
     * get
     * @return decouvert
     */
    public int getDecouvert() {
        return decouvert;
    }
    /**
     * set
     * @return decouvert
     */
    public void setDecouvert(int decouvert) {
        this.decouvert = decouvert;
    }

}
