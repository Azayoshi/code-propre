package fr.diginamic.immobilier.entites;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaisonTest {
    private Maison maison;

    @BeforeEach
    void setUp() {
        maison=new Maison();
    }

    @Test
    void ajouterPiece() {
        maison.ajouterPiece(new WC(0,1));
        assertEquals(1,maison.getPieces().length);
    }
    @Test
    void ajouterPiece_null() {
        maison.ajouterPiece(null);
        assertEquals(0,maison.getPieces().length);
    }

    @Test
    void nbPieces_null() {
        maison.ajouterPiece(null);
        assertEquals(0,maison.nbPieces());


    }
    @Test
    void nbPieces() {
        maison.ajouterPiece(new WC(1,1));
        assertEquals(1,maison.nbPieces());

    }

    @Test
    void superficieEtage() {
        maison.ajouterPiece(new Chambre(1,1));
        maison.ajouterPiece(new WC(1,1));
        maison.ajouterPiece(new WC(1,1));
        maison.ajouterPiece(new WC(0,1));
        assertEquals(3,maison.superficieEtage(1));
    }

    @Test
    void superficieTypePiece_1() {
        maison.ajouterPiece(new Chambre(1,1));
        maison.ajouterPiece(new WC(1,1));
        maison.ajouterPiece(new WC(1,1));
        maison.ajouterPiece(new WC(0,1));
        assertEquals(3,maison.superficieTypePiece("wc"));
    }
    @Test
    void superficieTypePiece_2() {
        maison.ajouterPiece(new Chambre(1,1));
        maison.ajouterPiece(new WC(1,1));
        maison.ajouterPiece(new WC(1,1));
        maison.ajouterPiece(new WC(0,1));
        assertEquals(3,maison.superficieTypePiece("Wc"));

    }
    @Test
    void superficieTypePiece_3() {
        maison.ajouterPiece(new Chambre(1,1));
        maison.ajouterPiece(new WC(1,1));
        maison.ajouterPiece(new WC(1,1));
        maison.ajouterPiece(new WC(0,1));
        assertEquals(3,maison.superficieTypePiece("WC"));

    }
    @Test
    void superficieTypePiece_null() {
        maison.ajouterPiece(new Chambre(1,1));
        maison.ajouterPiece(new WC(1,1));
        maison.ajouterPiece(new WC(1,1));
        maison.ajouterPiece(new WC(0,1));
        assertEquals(0,maison.superficieTypePiece(null));

    }

    @Test
    void calculerSurface() {
        maison.ajouterPiece(new Chambre(1,1));
        maison.ajouterPiece(new WC(1,1));
        maison.ajouterPiece(new WC(1,1));
        maison.ajouterPiece(new WC(0,1));
        assertEquals(4,maison.calculerSurface());
    }
}