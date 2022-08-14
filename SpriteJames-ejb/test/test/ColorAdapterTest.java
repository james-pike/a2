package test;

import cst8218.pike0040.xml.ColorAdapter;
import java.awt.Color;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This is a testing class for ColorAdapter entity.
 * @author Alejandro Suarez, James Pike
 */
public class ColorAdapterTest {
    
    public ColorAdapterTest() {
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
     * Test of unmarshal method, of class ColorAdapter.
     */
    @Test
    public void testUnmarshal() throws Exception {
        System.out.println("unmarshal");
        ColorAdapter.ColorValueType v = null;
        ColorAdapter instance = new ColorAdapter();
        Color expResult = null;
        Color result = instance.unmarshal(v);
        assertEquals(expResult, result);
    }

    /**
     * Test of marshal method, of class ColorAdapter.
     */
    @Test
    public void testMarshal() throws Exception {
        System.out.println("marshal");
        Color v = null;
        ColorAdapter instance = new ColorAdapter();
        ColorAdapter.ColorValueType expResult = null;
        ColorAdapter.ColorValueType result = instance.marshal(v);
        assertEquals(expResult, result);
    }
    
}
