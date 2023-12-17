package com.lucida.lucida;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;


public class Generator {
    private static final String AES = "AES";
    private static String generator_activation_code(String name,String surname,String weight,String height,String gender,String vki ,String history,String key) throws Exception {
        String data = name + "|" + surname + "|" + weight + "|" + height + "|" + gender + "|" + vki + "|" + history;
        String enc_msg=encrypt(data,key);
        return enc_msg+"//"+key;
    }

    public static String resolve_activation_code(String activation_code) {
        String pointer = "//";
        int index = activation_code.indexOf(pointer);
        String key_value = null;
        if (index != -1) {
            key_value = activation_code.substring(index + pointer.length());
            activation_code = activation_code.substring(0, index);
        } else {
            System.out.println("error");
        }
        return decryptData(activation_code, key_value);
    }
    private static String encrypt(String data, String key) throws Exception {
        SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(), AES);
        Cipher cipher = Cipher.getInstance(AES);
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] sifrelidataBytes = cipher.doFinal(data.getBytes());
        return Base64.getEncoder().encodeToString(sifrelidataBytes);
    }
    private static String decryptData(String encryptedData,String key) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(key.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
            byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedData));
            return new String(decryptedBytes);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }



}
