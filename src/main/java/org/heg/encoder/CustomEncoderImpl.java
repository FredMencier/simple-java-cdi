package org.heg.encoder;

import org.springframework.stereotype.Component;

@Component
@CustomEncoder
public class CustomEncoderImpl implements Encoder {

    public String encodeData(String data) {
        StringBuilder sb = new StringBuilder();
        for (char c : data.toCharArray()) {
            sb.append((int) c);
        }
        return sb.toString();
    }
}
