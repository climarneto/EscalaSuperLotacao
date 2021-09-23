/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

/**
 *
 * @author Neto
 */
public class Cripitografia {

    public String criptografar(String texto) throws NoSuchAlgorithmException, NoSuchProviderException, UnsupportedEncodingException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] aMessageDigest = md.digest(texto.getBytes("UTF-8"));

        StringBuilder hexString = new StringBuilder();
        for (byte b : aMessageDigest) {
            hexString.append(String.format("%02X", 0xFF & b));
        }
        String senha = hexString.toString();

        return senha;
    }
}
