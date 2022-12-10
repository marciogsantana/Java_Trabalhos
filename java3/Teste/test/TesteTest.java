/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Marcio Gomes
 */
public class TesteTest {
    
    public TesteTest() {
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

    /**
     * Test of iniciarconta method, of class Teste.
     */
    @Test
    public void testIniciarconta() {
        System.out.println("iniciarconta");
        int n = 0;
        int ag = 0;
        Teste instance = new Teste();
        instance.iniciarconta(n, ag);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sacar method, of class Teste.
     */
    @Test
    public void testSacar() {
        System.out.println("sacar");
        double valor = 0.0;
        Teste instance = new Teste();
        instance.sacar(valor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of depositar method, of class Teste.
     */
    @Test
    public void testDepositar() {
        System.out.println("depositar");
        double deposito = 0.0;
        Teste instance = new Teste();
        instance.depositar(deposito);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultarsaldo method, of class Teste.
     */
    @Test
    public void testConsultarsaldo() {
        System.out.println("consultarsaldo");
        Teste instance = new Teste();
        double expResult = 0.0;
        double result = instance.consultarsaldo();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
