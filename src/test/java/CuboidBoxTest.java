import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* CuboidBox Tester. 
* 
* @author <Authors name> 
* @since <pre>3�� 13, 2021</pre> 
* @version 1.0 
*/ 
public class CuboidBoxTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: changeLength(double length) 
* 
*/ 
@Test
public void testChangeLength() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: changeWidth(double width) 
* 
*/ 
@Test
public void testChangeWidth() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: changeHeight(double height) 
* 
*/ 
@Test
public void testChangeHeight() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: printVolume() 
* 
*/ 
@Test
public void testPrintVolume() throws Exception {
    CuboidBox mybox = new CuboidBox();
    mybox.changeLength(10);
    mybox.changeWidth(10);
    mybox.changeHeight(20);
    int ret = (int)mybox.printVolume();
    Assert.assertEquals(ret, 2000);
} 


} 
