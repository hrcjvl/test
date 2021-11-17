package org.apache.commons.math3.analysis.function;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;
import org.apache.commons.math3.analysis.function.Tan;
import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
/** 
* Tan Tester. 
* 
* @author <Authors name> 
* @since <pre>10/13/2021</pre> 
* @version 1.0 
*/ 
public class TanTest { 
    Tan tan;
@Before
public void before() throws Exception {
    tan=new Tan();
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: value(double x) 
* 
*/ 
@Test
public void testValue() throws Exception { 
//TODO: Test goes here...
    System.out.print("计算tan(0)的值：");
    System.out.println(tan.value(0));

    System.out.print("计算tan(pi/2)的值：");
    System.out.println(tan.value(Math.PI/2));
} 

/** 
* 
* Method: derivative() 
* 
*/ 
@Test
public void testDerivative() throws Exception { 
//TODO: Test goes here... 
} 


} 
