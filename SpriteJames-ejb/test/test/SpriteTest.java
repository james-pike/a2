package test;

import cst8218.pike0040.entity.Sprite;
import java.awt.Color;
import java.awt.Graphics;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This is a testing class for sprite entity.
 * @author Alejandro Suarez, James Pike
 */
public class SpriteTest {
    
    public SpriteTest() {
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
     * Test of getId method, of class Sprite.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Sprite instance = new Sprite();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Sprite.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        Sprite instance = new Sprite();
        instance.setId(id);
    }

    /**
     * Test of getPanelWidth method, of class Sprite.
     */
    @Test
    public void testGetPanelWidth() {
        System.out.println("getPanelWidth");
        Sprite instance = new Sprite();
        Integer expResult = null;
        Integer result = instance.getPanelWidth();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPanelWidth method, of class Sprite.
     */
    @Test
    public void testSetPanelWidth() {
        System.out.println("setPanelWidth");
        Integer panelWidth = null;
        Sprite instance = new Sprite();
        instance.setPanelWidth(panelWidth);
    }

    /**
     * Test of getPanelHeight method, of class Sprite.
     */
    @Test
    public void testGetPanelHeight() {
        System.out.println("getPanelHeight");
        Sprite instance = new Sprite();
        Integer expResult = null;
        Integer result = instance.getPanelHeight();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPanelHeight method, of class Sprite.
     */
    @Test
    public void testSetPanelHeight() {
        System.out.println("setPanelHeight");
        Integer panelHeight = null;
        Sprite instance = new Sprite();
        instance.setPanelHeight(panelHeight);
    }

    /**
     * Test of getX method, of class Sprite.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        Sprite instance = new Sprite();
        Integer expResult = null;
        Integer result = instance.getX();
        assertEquals(expResult, result);
    }

    /**
     * Test of setX method, of class Sprite.
     */
    @Test
    public void testSetX() {
        System.out.println("setX");
        Integer x = null;
        Sprite instance = new Sprite();
        instance.setX(x);
    }

    /**
     * Test of getY method, of class Sprite.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        Sprite instance = new Sprite();
        Integer expResult = null;
        Integer result = instance.getY();
        assertEquals(expResult, result);
    }

    /**
     * Test of setY method, of class Sprite.
     */
    @Test
    public void testSetY() {
        System.out.println("setY");
        Integer y = null;
        Sprite instance = new Sprite();
        instance.setY(y);
    }

    /**
     * Test of getDx method, of class Sprite.
     */
    @Test
    public void testGetDx() {
        System.out.println("getDx");
        Sprite instance = new Sprite();
        Integer expResult = null;
        Integer result = instance.getDx();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDx method, of class Sprite.
     */
    @Test
    public void testSetDx() {
        System.out.println("setDx");
        Integer dx = null;
        Sprite instance = new Sprite();
        instance.setDx(dx);
    }

    /**
     * Test of getDy method, of class Sprite.
     */
    @Test
    public void testGetDy() {
        System.out.println("getDy");
        Sprite instance = new Sprite();
        Integer expResult = null;
        Integer result = instance.getDy();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDy method, of class Sprite.
     */
    @Test
    public void testSetDy() {
        System.out.println("setDy");
        Integer dy = null;
        Sprite instance = new Sprite();
        instance.setDy(dy);
    }

    /**
     * Test of getColor method, of class Sprite.
     */
    //@Test
    /*public void testGetColor() {
        System.out.println("getColor");
        Sprite instance = new Sprite();
        Color expResult = null;
        Color result = instance.getColor();
        assertEquals(expResult, result);
    }*/

    /**
     * Test of setColor method, of class Sprite.
     */
    @Test
    public void testSetColor() {
        System.out.println("setColor");
        Color color = null;
        Sprite instance = new Sprite();
        instance.setColor(color);
    }

    /**
     * Test of draw method, of class Sprite.
     */
    /*@Test
    public void testDraw() {
        System.out.println("draw");
        Graphics g = null;
        Sprite instance = new Sprite();
        instance.draw(g);
    }*/

    /**
     * Test of move method, of class Sprite.
     */
    /*@Test
    public void testMove() {
        System.out.println("move");
        Sprite instance = new Sprite();
        instance.move();
    }*/

    /**
     * Test of hashCode method, of class Sprite.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Sprite instance = new Sprite();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Sprite.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Sprite instance = new Sprite();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Sprite.
     */
    /*@Test
    public void testToString() {
        System.out.println("toString");
        Sprite instance = new Sprite();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
    }*/

    /**
     * Test of updates method, of class Sprite.
     */
    /*@Test
    public void testUpdates() {
        System.out.println("updates");
        Sprite old = null;
        Sprite instance = new Sprite();
        Sprite expResult = null;
        Sprite result = instance.updates(old);
        assertEquals(expResult, result);
    }*/

    /**
     * Test of checkNull method, of class Sprite.
     */
    @Test
    public void testCheckNull() {
        System.out.println("checkNull");
        Sprite instance = new Sprite();
        instance.checkNull();
        
    }
    
}
