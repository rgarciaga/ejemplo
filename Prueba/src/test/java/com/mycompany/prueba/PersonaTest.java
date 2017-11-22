/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prueba;

import com.mycompany.prueba.vo.Persona;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author formacion
 */
public class PersonaTest {
    
    private Persona persona;
    private static Persona personaNull;
    
    public PersonaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        personaNull = new Persona();
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        persona = new Persona("123456");
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testLongitudNombre() {
        assertTrue(persona.getNombre().length() > 5);
    }
    
    @Test(expected = NullPointerException.class)
    public void nullNombre() {
        String r = personaNull.getNombre().toUpperCase();
    }
}
