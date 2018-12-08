package RSAAlgorithm;


import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;

import javax.crypto.Cipher;

public class RSAAlgorithm {
    
    public static void main(String[] args) {
       try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(2048);;
            
            KeyPair keyPair = keyPairGenerator.genKeyPair();
            Key publicKey = keyPair.getPublic();
            Key privateKey = keyPair.getPrivate();
            
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            RSAPublicKeySpec publicKeySpec = keyFactory.getKeySpec(publicKey, RSAPublicKeySpec.class);
            RSAPrivateKeySpec privateKeySpec = keyFactory.getKeySpec(privateKey, RSAPrivateKeySpec.class);
            
            //암호화 예제
            String inputStr = "세이프123";
            Cipher cipher = Cipher.getInstance("RSA");
            cipher.init(Cipher.DECRYPT_MODE, privateKey);
            byte[] arrCipherData = cipher.doFinal(inputStr.getBytes());   //암호화된 데이터 (byte 배열)
            String strCipher = new String(arrCipherData);
            
            //System.out.println(strCipher);
            
            //복호화 예제
            cipher.init(Cipher.DECRYPT_MODE, privateKey);
            byte[] arrData = cipher.doFinal(arrCipherData);
            String strResult = new String(arrData);
            
            System.out.println(strResult);
       }catch (Exception e) {
           e.printStackTrace();
       }
    }
}
