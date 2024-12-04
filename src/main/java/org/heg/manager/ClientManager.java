package org.heg.manager;

import org.apache.log4j.Logger;
import org.heg.entity.ClientEntity;
import org.heg.encoder.Base64Encoder;

public class ClientManager {

    private static final Logger LOG = Logger.getLogger(ClientManager.class);

    private final Base64Encoder base64Encoder = new Base64Encoder();

    public ClientEntity createClient(final String firstname, final String lastname) {
        ClientEntity clientEntity = new ClientEntity();
        clientEntity.setClientId(1L);
        clientEntity.setFirstname(base64Encoder.encodeData(firstname));
        clientEntity.setLastname(base64Encoder.encodeData(lastname));
        return clientEntity;
    }
}
