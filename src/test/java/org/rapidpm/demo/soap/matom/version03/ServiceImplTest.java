package org.rapidpm.demo.soap.matom.version03;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ServiceImplTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testWork() throws Exception {
        ServiceImpl service = new ServiceImpl();
        String txt = "AEAEAE";
        String aeaeae = service.work(txt);
        Assert.assertNotNull(aeaeae);
        Assert.assertEquals("ServiceImpl - "+txt, aeaeae);
    }
}