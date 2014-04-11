

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.Cipher;
import sun.misc.BASE64Encoder;
public class Encryption
{
public static void main(String args[])
{
    new Encryption().encrypt();
}
void encrypt()
{
    try
    {
    String plainData="hello",cipherText,decryptedText;
    KeyGenerator keyGen = KeyGenerator.getInstance("AES");
    keyGen.init(128);
    SecretKey secretKey = keyGen.generateKey();
    Cipher aesCipher = Cipher.getInstance("AES");
    aesCipher.init(Cipher.ENCRYPT_MODE,secretKey);
    byte[] byteDataToEncrypt = plainData.getBytes();
    byte[] byteCipherText = aesCipher.doFinal(byteDataToEncrypt);
    cipherText = new BASE64Encoder().encode(byteCipherText);
    System.out.println("\n Plain Data : "+plainData+" \n Cipher Data : "+cipherText);
    }
    catch(Exception e)
    {
         
    }
}
}





