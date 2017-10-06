/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metropolitan.it355.domaci1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author darko
 */
public class FXMLControllerTest {

    /**
     * Test of reverse method, of class FXMLController.
     */
    @Test
    public void testReverse() {
        System.out.println("reverse");
        String source = "asdf";
        FXMLController instance = new FXMLController();
        String expResult = "fdsa";
        String result = instance.reverse(source);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
