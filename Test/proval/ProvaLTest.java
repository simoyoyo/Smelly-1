/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proval;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Eddy
 */
public class ProvaLTest {
    
    public ProvaLTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void addLast() {
        ProvaL l = new ProvaL();
        l.addLast("Ciao");
        assertEquals("Puntatore dall'primo al ultimo.",l.next.prev.nome,"Ciao");
        assertEquals("Puntatore dall'ultimo al primo.",l.next.prev.next.nome,l.next.nome);
        //assertEquals("Puntatore dall'ultimo al penultimo.","Ciao",l.next.prev);
        assertEquals("Puntatore dall'penultimo al ultimo.",l.next.prev.prev.next.nome,"Ciao");
        
        
        
    }
    
}
