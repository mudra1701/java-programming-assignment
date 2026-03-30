import java.util.Scanner;
abstract class Cipher {
 String text;
 Cipher(String text) {
 this.text = text;
 }
 abstract String encrypt();
 abstract String decrypt();
}
class CaesarCipher extends Cipher {
 int shift;
 CaesarCipher(String text, int shift) {
 super(text);
 this.shift = shift;
 }
 
 String encrypt() {
 String result = "";
 for (int i = 0; i < text.length(); i++) {
 char ch = text.charAt(i);
 if (Character.isLetter(ch)) {
 char base = Character.isUpperCase(ch) ? 'A' : 'a';
 ch = (char) ((ch - base + shift) % 26 + base);
 }
 result += ch;
 }
 return result;
 }
 
 String decrypt() {
 String result = "";
 for (int i = 0; i < text.length(); i++) {
	 char ch = text.charAt(i);
 if (Character.isLetter(ch)) {
 char base = Character.isUpperCase(ch) ? 'A' : 'a';
 ch = (char) ((ch - base - shift + 26) % 26 + base);
 }

 result += ch;
 }
 return result;
 }
}
class Program6 {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter text: ");
 String text = sc.nextLine();
 System.out.print("Enter shift value: ");
 int shift = sc.nextInt();
 CaesarCipher c = new CaesarCipher(text, shift);
 String enc = c.encrypt();
 System.out.println("Encrypted: " + enc);
 
 CaesarCipher d = new CaesarCipher(enc, shift);
 System.out.println("Decrypted: " + d.decrypt());
 }
}

