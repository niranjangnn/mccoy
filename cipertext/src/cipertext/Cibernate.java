package cipertext;
import javax.crypto.*;
public class Cibernate {
	public static void main(String args[])
	{
	  try {
//	Cipher cipher = Cipher.getInstance("AES");
	byte[] plainText  = "abcdefghijklmnopqrstuvwxyz".getBytes("UTF-8");
	System.out.println(plainText);
	byte[] plainNUm  = "12456789".getBytes("UTF-8");
//	byte[] cipherText = cipher.doFinal(plainText);
	System.out.println("Cibernate.main()");
	System.out.println(plainText);
	System.out.println(plainNUm);
//	System.out.println(cipherText);
	  }
	  catch (Exception ex) {
	    ex.printStackTrace();
	  }

}
}