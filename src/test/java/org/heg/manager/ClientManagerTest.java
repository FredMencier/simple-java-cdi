package org.heg.manager;

import org.apache.log4j.Logger;
import org.heg.encoder.Base64Encoder;
import org.heg.encoder.CustomEncoder;
import org.heg.entity.ClientEntity;
import org.junit.Assert;
import org.junit.Test;

public class ClientManagerTest {

    private static final Logger LOG = Logger.getLogger(ClientManager.class);

    @Test
    public void createClientCustomEncoder() {
        ClientManager clientManager = new ClientManager(new CustomEncoder());

        ClientEntity clientEntity = clientManager.createClient("Victor", "Hugo");
        Assert.assertNotNull(clientEntity.getFirstname());
        Assert.assertNotNull(clientEntity.getLastname());
        LOG.info(clientEntity.toString());
    }

    @Test
    public void createClientBase64Encoder() {
        ClientManager clientManager = new ClientManager(new Base64Encoder());

        ClientEntity clientEntity = clientManager.createClient("Victor", "Hugo");
        Assert.assertNotNull(clientEntity.getFirstname());
        Assert.assertNotNull(clientEntity.getLastname());
        LOG.info(clientEntity.toString());
    }
}