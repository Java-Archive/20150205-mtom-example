package org.rapidpm.demo.soap.matom.version06;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.awt.*;

/**
 * Created by sven on 06.02.15.
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface ImageServer{

    //download a image from server
    @WebMethod Image downloadImage(String name);

    //update image to server
    @WebMethod
    String uploadImage(Image data);

}