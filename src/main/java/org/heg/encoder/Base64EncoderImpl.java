package org.heg.encoder;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Base64;

@Component
@Qualifier("Base64EncoderImpl")
public class Base64EncoderImpl implements Encoder {
    public String encodeData(String data) {
        return new String(Base64.getEncoder().encode(data.getBytes()));
    }
}
