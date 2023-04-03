package fr.diginamic.enumerations;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SaisonTest {
    private final String ETE1="ete";
    private final String ETE2="Ete";
    private final String ETE3="Eté";
    private final String ETE4="ETE";
    private final String PRINTEMPS1="PRINTEMPS";
    private final String PRINTEMPS2="printemps";
    private final String PRINTEMPS3="Printemps";
    private final String HIVER1="HIVER";
    private final String HIVER2="hiver";
    private final String HIVER3="Hiver";
    private final String AUTOMNE1="AUTOMNE";
    private final String AUTOMNE2="Automne";
    private final String AUTOMNE3="automne";

    @Test
    void testValueOfLibelle_EteGood1() {
        Saison saison = Saison.valueOfLibelle(ETE1);
        assertEquals(Saison.ETE,saison);

    }
    @Test
    void testValueOfLibelle_EteGood2() {
        Saison saison = Saison.valueOfLibelle(ETE2);
        assertEquals(Saison.ETE,saison);
    }

    @Test
    void testValueOfLibelle_EteGood3() {
        Saison saison = Saison.valueOfLibelle(ETE3);
        assertEquals(Saison.ETE,saison);
    }
    @Test
    void testValueOfLibelle_EteGood4() {
        Saison saison = Saison.valueOfLibelle(ETE4);
        assertEquals(Saison.ETE,saison);
    }

    @Test
    void testValueOfLibelle_HiverGood1() {
        Saison saison = Saison.valueOfLibelle(HIVER1);
        assertEquals(Saison.HIVER,saison);

    }
    @Test
    void testValueOfLibelle_HiverGood2() {
        Saison saison = Saison.valueOfLibelle(HIVER2);
        assertEquals(Saison.HIVER,saison);
    }

    @Test
    void testValueOfLibelle_HiverGood3() {

        Saison saison = Saison.valueOfLibelle(HIVER3);
        assertEquals(Saison.HIVER,saison);
    }
    @Test
    void testValueOfLibelle_AutomneGood1() {
        Saison saison = Saison.valueOfLibelle(AUTOMNE1);
        assertEquals(Saison.AUTOMNE,saison);

    }
    @Test
    void testValueOfLibelle_AutomneGood2() {
        Saison saison = Saison.valueOfLibelle(AUTOMNE2);
        assertEquals(Saison.AUTOMNE,saison);
    }

    @Test
    void testValueOfLibelle_AutomneGood3() {

        Saison saison = Saison.valueOfLibelle(AUTOMNE3);
        assertEquals(Saison.AUTOMNE,saison);
    }
    @Test
    void testValueOfLibelle_PrintempsGood1() {
        Saison saison = Saison.valueOfLibelle(PRINTEMPS1);
        assertEquals(Saison.PRINTEMPS,saison);

    }
    @Test
    void testValueOfLibelle_PrintempsGood2() {
        Saison saison = Saison.valueOfLibelle(PRINTEMPS2);
        assertEquals(Saison.PRINTEMPS,saison);
    }

    @Test
    void testValueOfLibelle_PrintempsGood3() {

        Saison saison = Saison.valueOfLibelle(PRINTEMPS3);
        assertEquals(Saison.PRINTEMPS,saison);
    }


}