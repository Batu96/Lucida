package com.lucida.lucida;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;
import java.util.HashMap;

public class Generator {
    private static final String AES = "AES";
    private static String encrypt(String data, String key) throws Exception {
        SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(), AES);
        Cipher cipher = Cipher.getInstance(AES);
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] sifrelidataBytes = cipher.doFinal(data.getBytes());
        return Base64.getEncoder().encodeToString(sifrelidataBytes);
    }
    private static void generator_key(String name,String surname,String weight,String height,String gender,String vki ,String history,String key) throws Exception {
        HashMap<String, String> datastack = new HashMap<>();
        String data = name + "," + surname + "," + weight + "," + height + "," + gender + "," + vki + "," + history;
        encrypt(data,key);
    }
}
