package org.rapidpm.demo.soap.matom.modeltest.v001;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.xml.bind.attachment.AttachmentUnmarshaller;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by sven on 06.02.15.
 */
public class MyAttachmentUnmarshaller extends AttachmentUnmarshaller {

    private Map<String, byte[]> attachments = new HashMap<>();

    public Map<String, byte[]> getAttachments() {
        return attachments;
    }

    @Override
    public DataHandler getAttachmentAsDataHandler(String cid) {
        byte[] bytes = attachments.get(cid);
        return new DataHandler(new ByteArrayDataSource(bytes));
    }

    @Override
    public byte[] getAttachmentAsByteArray(String cid) {
        return attachments.get(cid);
    }

    @Override
    public boolean isXOPPackage() {
        return true;
    }

    private static class ByteArrayDataSource implements DataSource {

        private byte[] bytes;

        public ByteArrayDataSource(byte[] bytes) {
            this.bytes = bytes;
        }

        public String getContentType() {
            return  "application/octet-stream";
        }

        public InputStream getInputStream() throws IOException {
            return new ByteArrayInputStream(bytes);
        }

        public String getName() {
            return null;
        }

        public OutputStream getOutputStream() throws IOException {
            return null;
        }

    }

}