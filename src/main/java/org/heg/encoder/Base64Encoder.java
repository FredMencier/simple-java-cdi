package org.heg.encoder;

import org.springframework.stereotype.Component;

import java.util.Base64;

@Component
public class Base64Encoder {
    public String encodeData(String data) {
        return new String(Base64.getEncoder().encode(data.getBytes()));
    }
}
