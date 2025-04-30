package org.heg.encoder;

public class CustomEncoder implements Encoder {

    public String encodeData(String data) {
        StringBuilder sb = new StringBuilder();
        for (char c : data.toCharArray()) {
            sb.append((int)c);
        }
        return sb.toString();
    }
}
