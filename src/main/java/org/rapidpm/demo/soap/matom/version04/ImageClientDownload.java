package org.rapidpm.demo.soap.matom.version04;

import javax.swing.*;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.awt.*;
import java.net.URL;

/**
 * Created by sven on 06.02.15.
 */
public class ImageClientDownload {
    public static void main(String[] args) throws Exception {

        URL url = new URL("http://localhost:9999/ws/image?wsdl");
        QName qname = new QName("http://version04.matom.soap.demo.rapidpm.org/", "ImageServerImplService");

        Service service = Service.create(url, qname);
        ImageServer imageServer = service.getPort(ImageServer.class);

        /************  test download  ***************/
        Image image = imageServer.downloadImage("runn.jpg");

        //display it in frame
        JFrame frame = new JFrame();
        frame.setSize(640, 426);
        JLabel label = new JLabel(new ImageIcon(image));
        frame.add(label);
        frame.setVisible(true);

        System.out.println("imageServer.downloadImage() : Download Successful!");

    }
}
