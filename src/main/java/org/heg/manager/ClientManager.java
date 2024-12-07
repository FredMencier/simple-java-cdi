package org.heg.manager;

import lombok.extern.slf4j.Slf4j;
import org.heg.encoder.Basic64Encoder;
import org.heg.encoder.Encoder;
import org.heg.entity.ClientEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ClientManager {

    @Autowired
    @Basic64Encoder
    private Encoder encoder;

//    private final Encoder encoder;
//
//    @Autowired
//    public ClientManager(@Basic64Encoder Encoder encoder) {
//        this.encoder = encoder;
//    }

    public ClientEntity createClient(final String firstname, final String lastname) {
        long timestart = System.currentTimeMillis();

        ClientEntity clientEntity = new ClientEntity();
        clientEntity.setFirstname(encoder.encodeData(firstname));
        clientEntity.setLastname(encoder.encodeData(lastname));

        log.info("Method {} called successfully in {} ms ", "createClient", (System.currentTimeMillis() - timestart));
        return clientEntity;
    }

    public ClientEntity updateClient(final String firstname, final ClientEntity clientEntity) {
        //Si je veux egalement logger le temps passé dans cette méthode,
        // je dois copier coller le code de la méthode createClient

        long timestart = System.currentTimeMillis();

        clientEntity.setFirstname(encoder.encodeData(firstname));

        log.info("Method {} called successfully in {} ms ", "updateClient", (System.currentTimeMillis() - timestart));
        return clientEntity;
    }
}
