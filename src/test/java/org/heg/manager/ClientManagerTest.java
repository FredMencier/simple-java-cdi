package org.heg.manager;

import org.apache.log4j.Logger;
import org.heg.entity.ClientEntity;
import org.junit.Assert;
import org.junit.Test;

public class ClientManagerTest {

    private static final Logger LOG = Logger.getLogger(ClientManager.class);

    private ClientManager clientManager = new ClientManager();

    @Test
    public void createClient() {
        ClientEntity clientEntity = clientManager.createClient("Victor", "Hugo");
        Assert.assertNotNull(clientEntity.getFirstname());
        Assert.assertNotNull(clientEntity.getLastname());
        LOG.info(clientEntity.toString());
    }
}