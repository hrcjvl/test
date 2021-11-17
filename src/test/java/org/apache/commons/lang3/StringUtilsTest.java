package org.apache.commons.lang3;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringUtilsTest {
    StringUtils stringUtils;
    @BeforeEach
    void setUp() {
        stringUtils=new StringUtils();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void isEmpty() {
        String blank="";
        Assert.assertEquals(false,stringUtils.isEmpty(blank));
    }
    @Test
    void trim() {
        String test_str="";
        Assert.assertEquals("",stringUtils.trim(test_str));
    }
    @Test
    void left(){
        String test_str="abcd";
        Assert.assertEquals("abcd",stringUtils.left(test_str,10));
    }
    @Test
    void deleteWhitespace(){
        String test_str=" a b c ";
        Assert.assertEquals("abc",stringUtils.deleteWhitespace(test_str));
    }
}