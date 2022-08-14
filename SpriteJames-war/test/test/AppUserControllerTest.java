/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import cst8218.pike0040.appuser.AppUser;
import cst8218.pike0040.util.PaginationHelper;
import javax.faces.model.DataModel;
import javax.faces.model.SelectItem;
import jsfAppUser.AppUserController;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This is a testing class for AppUserController entity.
 * @author Alejandro Suarez, James Pike
 */
public class AppUserControllerTest {
    
    public AppUserControllerTest() {
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
     * Test of getSelected method, of class AppUserController.
     */
    @Test
    public void testGetSelected() {
        System.out.println("getSelected");
        AppUserController instance = new AppUserController();
        AppUser expResult = new AppUser();
        AppUser result = instance.getSelected();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPagination method, of class AppUserController.
     */
    @Test
    public void testGetPagination() {
        System.out.println("getPagination");
        AppUserController instance = new AppUserController();
        PaginationHelper expResult = instance.getPagination();;
        PaginationHelper result = instance.getPagination();
        assertEquals(expResult, result);
    }

    /**
     * Test of prepareList method, of class AppUserController.
     */
    @Test
    public void testPrepareList() {
        System.out.println("prepareList");
        AppUserController instance = new AppUserController();
        String expResult = "List";
        String result = instance.prepareList();
        assertEquals(expResult, result);
    }

    /**
     * Test of prepareView method, of class AppUserController.
     */
    /*@Test
    public void testPrepareView() {
        System.out.println("prepareView");
        AppUserController instance = new AppUserController();
        String expResult = "view";
        String result = instance.prepareView();
        assertEquals(expResult, result);
    }
*/
    /**
     * Test of prepareCreate method, of class AppUserController.
     */
    @Test
    public void testPrepareCreate() {
        System.out.println("prepareCreate");
        AppUserController instance = new AppUserController();
        String expResult = "Create";
        String result = instance.prepareCreate();
        assertEquals(expResult, result);
    }

    /**
     * Test of create method, of class AppUserController.
     */
    /*@Test
    public void testCreate() {
        System.out.println("create");
        AppUserController instance = new AppUserController();
        String expResult = "";
        String result = instance.create();
        assertEquals(expResult, result);
    }*/

    /**
     * Test of prepareEdit method, of class AppUserController.
     */
    /*@Test
    public void testPrepareEdit() {
        System.out.println("prepareEdit");
        AppUserController instance = new AppUserController();
        String expResult = "Edit";
        String result = instance.prepareEdit();
        assertEquals(expResult, result);
    }*/

    /**
     * Test of update method, of class AppUserController.
     */
    /*@Test
    public void testUpdate() {
        System.out.println("update");
        AppUserController instance = new AppUserController();
        String expResult = "update";
        String result = instance.update();
        assertEquals(expResult, result);
    }*/

    /**
     * Test of destroy method, of class AppUserController.
     */
    /*@Test
    public void testDestroy() {
        System.out.println("destroy");
        AppUserController instance = new AppUserController();
        String expResult = "List";
        String result = instance.destroy();
        assertEquals(expResult, result);
    }*/

    /**
     * Test of destroyAndView method, of class AppUserController.
     */
    /*@Test
    public void testDestroyAndView() {
        System.out.println("destroyAndView");
        AppUserController instance = new AppUserController();
        String expResult = "List";
        String result = instance.destroyAndView();
        assertEquals(expResult, result);
    }
*/
    /**
     * Test of getItems method, of class AppUserController.
     */
    /*@Test
    public void testGetItems() {
        System.out.println("getItems");
        AppUserController instance = new AppUserController();
        DataModel expResult = instance.getPagination().createPageDataModel();
        DataModel result = instance.getItems();
        assertEquals(expResult, result);
    }*/

    /**
     * Test of next method, of class AppUserController.
     */
    /*@Test
    public void testNext() {
        System.out.println("next");
        AppUserController instance = new AppUserController();
        String expResult = "List";
        String result = instance.next();
        assertEquals(expResult, result);
    }*/

    /**
     * Test of previous method, of class AppUserController.
     */
    @Test
    public void testPrevious() {
        System.out.println("previous");
        AppUserController instance = new AppUserController();
        String expResult = "List";
        String result = instance.previous();
        assertEquals(expResult, result);
    }

    /**
     * Test of getItemsAvailableSelectMany method, of class AppUserController.
     */
    /*@Test
    public void testGetItemsAvailableSelectMany() {
        System.out.println("getItemsAvailableSelectMany");
        AppUserController instance = new AppUserController();
        SelectItem[] expResult = null;
        SelectItem[] result = instance.getItemsAvailableSelectMany();
        assertArrayEquals(expResult, result);
    }*/

    /**
     * Test of getItemsAvailableSelectOne method, of class AppUserController.
     */
    /*@Test
    public void testGetItemsAvailableSelectOne() {
        System.out.println("getItemsAvailableSelectOne");
        AppUserController instance = new AppUserController();
        SelectItem[] expResult = null;
        SelectItem[] result = instance.getItemsAvailableSelectOne();
        assertArrayEquals(expResult, result);
    }*/

    /**
     * Test of getAppUser method, of class AppUserController.
     */
    /*@Test
    public void testGetAppUser() {
        System.out.println("getAppUser");
        Long id = null;
        AppUserController instance = new AppUserController();
        AppUser expResult = null;
        AppUser result = instance.getAppUser(id);
        assertEquals(expResult, result);
    }*/
    
}
