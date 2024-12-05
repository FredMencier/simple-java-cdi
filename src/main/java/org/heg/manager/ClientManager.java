package org.heg.manager;

import lombok.extern.slf4j.Slf4j;
import org.heg.encoder.Encoder;
import org.heg.entity.ClientEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ClientManager {

    @Autowired
    @Qualifier("Base64EncoderImpl")
    private Encoder encoder;

//    private final Encoder encoder;
//
//    @Autowired
//    public ClientManager(@Qualifier("Base64EncoderImpl") Encoder encoder) {
//        this.encoder = encoder;
//    }


    public ClientEntity createClient(final String firstname, final String lastname) {
        ClientEntity clientEntity = new ClientEntity();
        clientEntity.setFirstname(encoder.encodeData(firstname));
        clientEntity.setLastname(encoder.encodeData(lastname));
        return clientEntity;
    }
}
