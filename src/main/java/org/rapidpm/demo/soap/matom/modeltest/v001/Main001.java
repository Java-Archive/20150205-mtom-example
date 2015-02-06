package org.rapidpm.demo.soap.matom.modeltest.v001;


import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import javax.swing.*;
import javax.xml.bind.DatatypeConverter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.awt.*;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.util.Base64;

/**
 * Created by sven on 06.02.15.
 */
public class Main001 {

//    private static String base64 = "/9j/4AAQSkZJRgABAgAAAQABAAD/2wBDAAgGBgcGBQgHBwcJCQgKDBQNDAsLDBkSEw8UHRofHh0aHBwgJC4nICIsIxwcKDcpLDAxNDQ0Hyc5PTgyPC4zNDL/2wBDAQkJCQwLDBgNDRgyIRwhMjIyMjIyMjIyMjIyMjIyMjIyMjIyMjIyMjIyMjIyMjIyMjIyMjIyMjIyMjIyMjIyMjL/wAARCAABAAEDASIAAhEBAxEB/8QAHwAAAQUBAQEBAQEAAAAAAAAAAAECAwQFBgcICQoL/8QAtRAAAgEDAwIEAwUFBAQAAAF9AQIDAAQRBRIhMUEGE1FhByJxFDKBkaEII0KxwRVS0fAkM2JyggkKFhcYGRolJicoKSo0NTY3ODk6Q0RFRkdISUpTVFVWV1hZWmNkZWZnaGlqc3R1dnd4eXqDhIWGh4iJipKTlJWWl5iZmqKjpKWmp6ipqrKztLW2t7i5usLDxMXGx8jJytLT1NXW19jZ2uHi4+Tl5ufo6erx8vP09fb3+Pn6/8QAHwEAAwEBAQEBAQEBAQAAAAAAAAECAwQFBgcICQoL/8QAtREAAgECBAQDBAcFBAQAAQJ3AAECAxEEBSExBhJBUQdhcRMiMoEIFEKRobHBCSMzUvAVYnLRChYkNOEl8RcYGRomJygpKjU2Nzg5OkNERUZHSElKU1RVVldYWVpjZGVmZ2hpanN0dXZ3eHl6goOEhYaHiImKkpOUlZaXmJmaoqOkpaanqKmqsrO0tba3uLm6wsPExcbHyMnK0tPU1dbX2Nna4uPk5ebn6Onq8vP09fb3+Pn6/9oADAMBAAIRAxEAPwD5/ooooA//2Q==";

    public static void main(String[] args) throws Exception {


        File data = new File("data", "runn.jpg");
        byte[] bytes = Files.readAllBytes(data.toPath());
        String base64 = Base64.getEncoder().encodeToString(bytes);


        // Create the JAXBContext & Unmarshaller
        JAXBContext jc = JAXBContext.newInstance(Foo.class);
        Unmarshaller unmarshaller = jc.createUnmarshaller();

        // Create a custom AttachementUnmarshaller.  Populate the Map
        // AttachmentUnmarshaller with the attachments keyed on the cid.
        MyAttachmentUnmarshaller attachmentUnmarshaller = new MyAttachmentUnmarshaller();
        byte[] base64Binary = DatatypeConverter.parseBase64Binary(base64);
        attachmentUnmarshaller.getAttachments().put("cid:http://example.org/me.jpeg", base64Binary);

        // Set the AttachmentUnmarshaller on the Unmarshaller
        unmarshaller.setAttachmentUnmarshaller(attachmentUnmarshaller);

        // Unmarshal the XML piece
        File xml = new File("data/input.xml");
        Foo foo = (Foo) unmarshaller.unmarshal(xml);

        //display it in frame
        JFrame frame = new JFrame();
        frame.setSize(640, 426);
        Image image = foo.getImage();
        JLabel label = new JLabel(new ImageIcon(image));
        frame.add(label);
        frame.setVisible(true);

    }

}
