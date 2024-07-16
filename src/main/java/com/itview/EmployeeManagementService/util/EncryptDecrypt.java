package com.itview.EmployeeManagementService.util;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class EncryptDecrypt {

    public static String encrypt(String str1, String str2) {
        String encodedKey = Base64.getEncoder().encodeToString((str1
                + ":" + str2 + "This is my secrt key").getBytes());
        return encodedKey;
    }

    public String decrypt(String encryptedStr) {
        byte[] decoded = Base64.getDecoder().decode(encryptedStr);
        String decodedStr = new String(decoded, StandardCharsets.UTF_8);
        return decodedStr;
    }
}
