package org.heg.encoder;

import java.util.Base64;

public class Base64EncoderImpl implements Encoder {
    public String encodeData(String data) {
        return new String(Base64.getEncoder().encode(data.getBytes()));
    }
}
