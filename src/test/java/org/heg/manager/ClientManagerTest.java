package org.heg.manager;

import org.heg.entity.ClientEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.logging.Logger;

@SpringBootTest
public class ClientManagerTest {

    private static final Logger LOG = Logger.getLogger(ClientManagerTest.class.getName());

    @Autowired
    private ClientManager clientManager;

    @Test
    public void createClient() {
        ClientEntity clientEntity = clientManager.createClient("Victor", "Hugo");
        Assertions.assertNotNull(clientEntity.getFirstname());
        Assertions.assertNotNull(clientEntity.getLastname());
        LOG.info(clientEntity.toString());
    }
}