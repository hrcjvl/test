package org.apache.commons.math3.analysis.function;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 
import org.apache.commons.math3.analysis.function.Sqrt;
/** 
* Sqrt Tester. 
* 
* @author <Authors name> 
* @since <pre>10/13/2021</pre> 
* @version 1.0 
*/ 
public class SqrtTest { 
    Sqrt sqrt;
@Before
public void before() throws Exception {
    sqrt=new Sqrt();
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
    System.out.println(sqrt.value(4));
    System.out.println(sqrt.value(-4));
} 

/** 
* 
* Method: derivative() 
* 
*/ 
@Test
public void testDerivative() throws Exception { 
//TODO: Test goes here...
    System.out.println(sqrt.derivative().value(0));
} 


} 
