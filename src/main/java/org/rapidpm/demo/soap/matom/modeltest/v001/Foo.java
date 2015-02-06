package org.rapidpm.demo.soap.matom.modeltest.v001;

import javax.xml.bind.annotation.XmlRootElement;
import java.awt.*;

/**
 * Created by sven on 06.02.15.
 */
@XmlRootElement
public class Foo {

    private Image image;

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}
