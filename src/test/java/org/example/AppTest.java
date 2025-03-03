package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
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

        String nom = "Alexandrelepetit";
        String messageErreur = "Le nom est trop long (maximum 12 lettres)";

        ByteArrayOutputStream sortie = new ByteArrayOutputStream();
        System.setOut(new PrintStream(sortie));

        boolean resultat = app.estNomValide(nom);
        assertTrue(sortie.toString().contains(messageErreur));
        assertFalse(resultat);

        System.setOut(console);
    }


}
