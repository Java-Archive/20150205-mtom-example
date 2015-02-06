package org.rapidpm.demo.soap.matom.version04;

import javax.imageio.ImageIO;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;
import javax.xml.ws.soap.SOAPBinding;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * Created by sven on 06.02.15.
 */
public class ImageClientUpload {


    public static void main(String[] args) throws IOException {

        URL url = new URL("http://localhost:9999/ws/image?wsdl");
        QName qname = new QName("http://version04.matom.soap.demo.rapidpm.org/", "ImageServerImplService");

        Service service = Service.create(url, qname);
        ImageServer imageServer = service.getPort(ImageServer.class);

        /************  test upload ****************/
        Image imgUpload = ImageIO.read(new File("./data/" + "runn.jpg"));

        //enable MTOM in client
        BindingProvider bp = (BindingProvider) imageServer;
        SOAPBinding binding = (SOAPBinding) bp.getBinding();
        binding.setMTOMEnabled(true);

        String status = imageServer.uploadImage(imgUpload);
        System.out.println("imageServer.uploadImage() : " + status);
    }
}
