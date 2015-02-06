package org.rapidpm.demo.soap.matom.version06;

import javax.imageio.ImageIO;
import javax.jws.WebService;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.soap.MTOM;
import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * Created by sven on 06.02.15.
 */
//Service Implementation Bean
@MTOM
@WebService(endpointInterface = "org.rapidpm.demo.soap.matom.version06.ImageServer")
public class ImageServerImpl implements ImageServer {

    @Override
    public Image downloadImage(String name) {

        try {

            File image = new File("./data/" + name);
            return ImageIO.read(image);

        } catch (IOException e) {

            e.printStackTrace();
            return null;

        }
    }

    @Override
    public String uploadImage(Image data) {

        if(data!=null){
            //store somewhere
            return "Upload Successful";
        }

        throw new WebServiceException("Upload Failed!");

    }

}