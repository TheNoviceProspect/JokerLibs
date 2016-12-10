/*
 * Copyright (C) 2016 smzb
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package me.mitos_kalandiel.libs;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author smzb
 */
public class JokerHelperTest {
    
    private int IntNum1;
    private int IntNum2;
    private double DblNum1;
    private double DblNum2;
    
    public JokerHelperTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        IntNum1 = 5;
        IntNum2 = 6;
        DblNum1 = 5.3;
        DblNum2 = 2;
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addNumbers method, of class JokerHelper.
     */
    @Test
    public void testAddNumbers_int_int() {
        System.out.println("addNumbers");
        JokerHelper instance = new JokerHelper();
        int expResult = 11;
        int result = instance.addNumbers(IntNum1, IntNum2);
        assertEquals(expResult, result);
    }

    /**
     * Test of subNumbers method, of class JokerHelper.
     */
    @Test
    public void testSubNumbers_int_int() {
        System.out.println("subNumbers");
        JokerHelper instance = new JokerHelper();
        int expResult = -1;
        int result = instance.subNumbers(IntNum1, IntNum2);
        assertEquals(expResult, result);
    }

    /**
     * Test of mulNumbers method, of class JokerHelper.
     */
    @Test
    public void testMulNumbers_int_int() {
        System.out.println("mulNumbers");
        JokerHelper instance = new JokerHelper();
        int expResult = 30;
        int result = instance.mulNumbers(IntNum1, IntNum2);
        assertEquals(expResult, result);
    }

    /**
     * Test of divNumbers method, of class JokerHelper.
     * TODO come up with a good test for division
     */
    @Test
    public void testDivNumbers_int_int() {
        System.out.println("divNumbers");
        int Num1 = 0;
        int Num2 = 1;
        JokerHelper instance = new JokerHelper();
        int expResult = 0;
        int result = instance.divNumbers(Num1, Num2);
        assertEquals(expResult, result);
    }

    /**
     * Test of addNumbers method, of class JokerHelper.
     */
    @Test
    public void testAddNumbers_double_double() {
        System.out.println("addNumbers");
        JokerHelper instance = new JokerHelper();
        double expResult = 7.3;
        double result = instance.addNumbers(DblNum1, DblNum2);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of subNumbers method, of class JokerHelper.
     */
    @Test
    public void testSubNumbers_double_double() {
        System.out.println("subNumbers");
        JokerHelper instance = new JokerHelper();
        double expResult = 3.2;
        double result = instance.subNumbers(DblNum1, DblNum2);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of mulNumbers method, of class JokerHelper.
     */
    @Test
    public void testMulNumbers_double_double() {
        System.out.println("mulNumbers");
        JokerHelper instance = new JokerHelper();
        double expResult = 10.6;
        double result = instance.mulNumbers(DblNum1, DblNum2);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of divNumbers method, of class JokerHelper.
     */
    @Test
    public void testDivNumbers_double_double() {
        System.out.println("divNumbers");
        JokerHelper instance = new JokerHelper();
        double expResult = 2.65;
        double result = instance.divNumbers(DblNum1, DblNum2);
        assertEquals(expResult, result, 0.0);
    }
    
}