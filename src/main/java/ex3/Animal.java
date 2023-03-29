package ex3;

public class Animal {
    private TypeAnimal types;
    private String noms;
    private Comportementt comportements;

    /**
     * Constructeur
     * @param types
     * @param noms
     * @param comportements
     */
    public Animal(TypeAnimal types, String noms, Comportementt comportements) {
        this.types = types;
        this.noms = noms;
        this.comportements = comportements;
    }

    /**
     * Affichage
     * @return Strings
     */
    @Override
    public String toString() {

        return "types=" + types +
                ", noms='" + noms + '\'' +
                ", comportements=" + comportements;
    }



    public TypeAnimal getTypes() {
        return types;
    }
    public void setTypes(TypeAnimal types) {
        this.types = types;
    }
    public String getNoms() {
        return noms;
    }
    public void setNoms(String noms) {
        this.noms = noms;
    }
    public Comportementt getComportements() {
        return comportements;
    }
    public void setComportements(Comportementt comportements) {
        this.comportements = comportements;
    }
}
