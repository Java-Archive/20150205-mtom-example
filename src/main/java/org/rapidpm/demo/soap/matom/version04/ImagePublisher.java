package org.rapidpm.demo.soap.matom.version04;

import javax.xml.ws.Endpoint;

/**
 * Created by sven on 06.02.15.
 */
public class ImagePublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9999/ws/image", new ImageServerImpl());
        System.out.println("Server is published!");
    }
}
