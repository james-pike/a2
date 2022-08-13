package test;

import cst8218.pike0040.appuser.AppUser;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This is a testing class for AppUser entity.
 * @author Alejandro Suarez, James Pike
 */
public class AppUserTest {
    
    public AppUserTest() {
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
     * Test of getId method, of class AppUser.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        AppUser instance = new AppUser();
        Long expResult = 1L;
        instance.setId(expResult);
        Long result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class AppUser.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = 1L;
        AppUser instance = new AppUser();
        instance.setId(id);
        assertEquals(id, instance.getId());
    }

    /**
     * Test of getUserid method, of class AppUser.
     */
    /*@Test
    public void testGetUserid() {
        System.out.println("getUserid");
        AppUser instance = new AppUser();
        String expResult = "";
        String result = instance.getUserid();
        assertEquals(expResult, result);
    }*/

    /**
     * Test of setUserid method, of class AppUser.
     */
    @Test
    public void testSetUserid() {
        System.out.println("setUserid");
        String userid = "";
        AppUser instance = new AppUser();
        instance.setUserid(userid);
    }

    /**
     * Test of getPassword method, of class AppUser.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        AppUser instance = new AppUser();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPassword method, of class AppUser.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        AppUser instance = new AppUser();
        instance.setPassword(password);
    }

    /**
     * Test of getGroupname method, of class AppUser.
     */
    /*@Test
    public void testGetGroupname() {
        System.out.println("getGroupname");
        AppUser instance = new AppUser();
        String expResult = "";
        String result = instance.getGroupname();
        assertEquals(expResult, result);
    }*/

    /**
     * Test of setGroupname method, of class AppUser.
     */
    @Test
    public void testSetGroupname() {
        System.out.println("setGroupname");
        String groupname = "";
        AppUser instance = new AppUser();
        instance.setGroupname(groupname);
    }

    /**
     * Test of hashCode method, of class AppUser.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        AppUser instance = new AppUser();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class AppUser.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        AppUser instance = new AppUser();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class AppUser.
     */
    /*@Test
    public void testToString() {
        System.out.println("toString");
        AppUser instance = new AppUser();
        String expResult = null;
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }*/
    
}
