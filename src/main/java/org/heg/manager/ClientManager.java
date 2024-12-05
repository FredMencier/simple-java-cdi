package org.heg.manager;

import lombok.extern.slf4j.Slf4j;
import org.heg.encoder.Base64Encoder;
import org.heg.encoder.NotBeanService;
import org.heg.entity.ClientEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ClientManager {

//    @Autowired
//    NotBeanService notBeanService;

    @Autowired
    private Base64Encoder encoder;

//    private final Base64Encoder encoder;
//
//    public ClientManager(Base64Encoder encoder) {
//        this.encoder = encoder;
//    }

    public ClientEntity createClient(final String firstname, final String lastname) {
        ClientEntity clientEntity = new ClientEntity();
        clientEntity.setFirstname(encoder.encodeData(firstname));
        clientEntity.setLastname(encoder.encodeData(lastname));
        return clientEntity;
    }
}
