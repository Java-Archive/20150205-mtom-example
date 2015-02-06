package org.rapidpm.demo.soap.matom.version03.remote;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.rapidpm.demo.soap.matom.version03.ServiceImpl;

import javax.xml.ws.Endpoint;

public class ServiceRemoteProxyTest {


    Endpoint endpoint;

    @Before
    public void setUp() throws Exception {
        endpoint = Endpoint.publish("http://localhost:9999/ws/service", new ServiceImpl());
    }

    @After
    public void tearDown() throws Exception {
        endpoint.stop();
    }

    @Test
    public void testWork() throws Exception {
        ServiceRemoteProxy proxy = new ServiceRemoteProxy();
        String txt = "AEAEAE";
        String result = proxy.work(txt);
        Assert.assertNotNull(result);
        Assert.assertEquals("ServiceImpl - "+txt, result);

    }
}