package com.cristobalbernal.basedatos.utils;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashGenerator {

    public static byte[] getSHA(String input) throws NoSuchAlgorithmException{
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        return md.digest(input.getBytes(StandardCharsets.UTF_8));
    }

    public static String getSHAString(String input) throws NoSuchAlgorithmException{
        return toHexString(getSHA(input));
    }

    public static String toHexString(byte[] hash){
        BigInteger numbre = new BigInteger(1,hash);

        StringBuilder hexString = new StringBuilder(numbre.toString(16));

        while (hexString.length() < 64){
            hexString.insert(0,"0");
        }
        return hexString.toString();
    }
}
