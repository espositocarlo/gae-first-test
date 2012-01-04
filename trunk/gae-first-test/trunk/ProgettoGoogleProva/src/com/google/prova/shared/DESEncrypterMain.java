/**
 * 
 */
package com.google.prova.shared;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/**
 * @author Administrator
 *
 */
public class DESEncrypterMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
		    // Generate a temporary key. In practice, you would save this key.
		    // See also Encrypting with DES Using a Pass Phrase.
		    SecretKey key = KeyGenerator.getInstance("DES").generateKey();

		    // Create encrypter/decrypter class
		    DESEncrypter encrypter = new DESEncrypter(key);

		    // Encrypt
		    String encrypted = encrypter.encrypt("Don't tell anybody!");
		    System.out.println(encrypted);

		    // Decrypt
		    String decrypted = encrypter.decrypt(encrypted);
		    System.out.println(decrypted);
		} catch (Exception e) {
		}
	}

}
