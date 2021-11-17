package org.apache.commons.math3.analysis.function;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 
import org.apache.commons.math3.analysis.function.Log;
/** 
* Log Tester. 
* 
* @author <Authors name> 
* @since <pre>10/13/2021</pre> 
* @version 1.0 
*/ 
public class LogTest { 
    Log log;
@Before
public void before() throws Exception {
    log=new Log();
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
  Assert.assertEquals(1,log.value(Math.exp(2)));
}

/**
* 
* Method: derivative() 
* 
*/ 
@Test
public void testDerivative() throws Exception { 
//TODO: Test goes here...
    Assert.assertEquals(0.5,log.derivative().value(2));
} 


} 
