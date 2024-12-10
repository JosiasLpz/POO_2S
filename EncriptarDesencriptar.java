import java.security.*;
import javax.crypto.*;
public class EncriptarDesencriptar 
{
    public static void main(String[] args) throws Exception
    {
        KeyPairGenerator a = KeyPairGenerator.getInstance("RSA");
        a.initialize(50);
        KeyPair b = a.generateKeyPair();
        
        Cipher c =  Cipher.getInstance("RSA");
        c.init( Cipher.ENCRYPT_MODE, b.getPublic());
        
        byte [] plaintext = "Mensaje secreto ".getBytes();
        
        byte [] ciphertext = c.doFinal(plaintext);
        System.out.println("Mensaje enciptado: "+ new String (ciphertext));
        
        c.init(Cipher.DECRYPT_MODE, b.getPrivate());
        
        byte [] descryptedText = c.doFinal(ciphertext);
        System.out.println("Mensaje desencriptado: "+ new String(descryptedText));                
    }    
}