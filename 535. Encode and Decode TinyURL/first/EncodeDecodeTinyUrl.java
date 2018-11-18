package first;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class EncodeDecodeTinyUrl {
    Map<String, String> tinyToOrigin;
    Map<String, String> originToTiny;
    final String BASE_HOST = "http://tinyurl.com/";
    final String CHAR_SET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    public EncodeDecodeTinyUrl() {
        tinyToOrigin = new HashMap<>();
        originToTiny = new HashMap<>();
    }

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        if (originToTiny.containsKey(longUrl))
            return BASE_HOST + originToTiny.get(longUrl);
        String key = "";
        Random rand = new Random();
        do {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 6; i++) {
                sb.append(CHAR_SET.charAt(rand.nextInt(CHAR_SET.length())));
            }
            key = sb.toString();
        } while (tinyToOrigin.containsKey(key));
        originToTiny.put(longUrl, key);
        tinyToOrigin.put(key, longUrl);
        return BASE_HOST + key;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return tinyToOrigin.get(shortUrl.replace(BASE_HOST, ""));
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));