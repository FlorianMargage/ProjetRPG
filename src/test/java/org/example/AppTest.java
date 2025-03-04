package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.example.joueur.Joueur;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    private App app;

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    // Méthode setup() pour initialiser avant chaque test
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        app = new App();  // Créer une instance de la classe App avant chaque test
    }

    // Test d'acceptation 1.1 : Nom valide
    public void testChoisirNomValide() {
        String nom = "Robert";
        boolean resultat = app.estNomValide(nom);
        assertEquals(true, resultat);
    }

    // Test d'acceptation 1.2 : Nom trop court
    public void testChoisirNomTropCourt() {
        PrintStream console = System.out;

        String nom = "Joe";
        String messageErreur = "Le nom est trop court (minimum 4 lettres)";

        ByteArrayOutputStream sortie = new ByteArrayOutputStream();
        System.setOut(new PrintStream(sortie));

        boolean resultat = app.estNomValide(nom);
        assertTrue(sortie.toString().contains(messageErreur));
        assertFalse(resultat);

        System.setOut(console);
    }

    // Test d'acceptation 1.3 : Nom trop long
    public void testChoisirNomTropLong() {
        PrintStream console = System.out;

        String nom = "Alexandrelepetit";
        String messageErreur = "Le nom est trop long (maximum 12 lettres)";

        ByteArrayOutputStream sortie = new ByteArrayOutputStream();
        System.setOut(new PrintStream(sortie));

        boolean resultat = app.estNomValide(nom);
        assertTrue(sortie.toString().contains(messageErreur));
        assertFalse(resultat);

        System.setOut(console);
    }

    // Test d'acceptation 1.4 : Nom avec des caractères non valides
    public void testChoisirNomAvecCaracteresInvalide() {
        PrintStream console = System.out;

        String nom = "Alex62";
        String messageErreur = "Le nom ne doit contenir que des lettres";

        ByteArrayOutputStream sortie = new ByteArrayOutputStream();
        System.setOut(new PrintStream(sortie));

        boolean resultat = app.estNomValide(nom);
        assertTrue(sortie.toString().contains(messageErreur));
        assertFalse(resultat);

        System.setOut(console);
    }

    // Test d'acceptation 5.1 : Affichage du récapitulatif du personnage
    public void testAfficherStats() {
        String nom = "Alice";
        Joueur joueur = new Joueur(nom, "guerrier");
        String resultat = joueur.stats();
        String resultatAttendu = "Nom: Alice\nPV: 150\nPM: 50\nForce: 15\nIntelligence: 5\nDéfense: 12\nRésistance Magique: 6\nAgilité: 8\nChance: 5\nEndurance: 10\nEsprit: 4";
        assertEquals(resultatAttendu, resultat);
    }
}
