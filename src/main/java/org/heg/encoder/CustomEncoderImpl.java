package org.heg.encoder;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("CustomEncoderImpl")
public class CustomEncoderImpl implements Encoder {

    public String encodeData(String data) {
        StringBuilder sb = new StringBuilder();
        for (char c : data.toCharArray()) {
            sb.append((int) c);
        }
        return sb.toString();
    }
}
