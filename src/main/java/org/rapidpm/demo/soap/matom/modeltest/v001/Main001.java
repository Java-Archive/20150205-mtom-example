package org.rapidpm.demo.soap.matom.modeltest.v001;

import soap.model.EnhancedFolderAttachmentProcessAsyncInSFX;
import soap.model.EnhancedFolderAttachmentProcessAsyncInSFXService;
import soap.model.EnhancedFolderAttachmentProcessMessage;

/**
 * Created by sven on 06.02.15.
 */
public class Main001 {

    public static void main(String[] args) {
        EnhancedFolderAttachmentProcessAsyncInSFXService service = new EnhancedFolderAttachmentProcessAsyncInSFXService();
        EnhancedFolderAttachmentProcessAsyncInSFX port = service.getEnhancedFolderAttachmentProcessAsyncInSFXPort();

        EnhancedFolderAttachmentProcessMessage message = new EnhancedFolderAttachmentProcessMessage();

        EnhancedFolderAttachmentProcessMessage.ServiceRequest request = message.getServiceRequest();


        port.enhancedFolderAttachmentProcessAsyncInSFX(message);


    }
}
