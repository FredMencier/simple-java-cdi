package org.heg.manager;

import org.apache.log4j.Logger;
import org.heg.encoder.Encoder;
import org.heg.entity.ClientEntity;

public class ClientManager {

    private static final Logger LOG = Logger.getLogger(ClientManager.class);

    private final Encoder encoder;

    public ClientManager(Encoder encoder) {
        this.encoder = encoder;
    }

    public ClientEntity createClient(final String firstname, final String lastname) {
        ClientEntity clientEntity = new ClientEntity();
        clientEntity.setClientId(1L);
        clientEntity.setFirstname(encoder.encodeData(firstname));
        clientEntity.setLastname(encoder.encodeData(lastname));
        return clientEntity;
    }
}
