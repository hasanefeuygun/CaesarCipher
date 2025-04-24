import java.util.Scanner;

public class CeaserCipher {

    public static String encrypt(String text,int shift){
        StringBuilder result = new StringBuilder();
        for(char c : text.toCharArray()){
            if(Character.isLetter(c)){
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                result.append((char) ((c - base + shift) % 26 + base));
            }else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static String decrypt(String text,int shift){
        return encrypt(text,26 - shift);
    }



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String original = scanner.nextLine();

        System.out.print("Shift value: ");
        int shift = scanner.nextInt();

        String encrypted = encrypt(original, shift);
        String decrypted = decrypt(encrypted, shift);

        System.out.println("Encrypted text: " + encrypted);
        System.out.println("Decrypted text: " + decrypted);

        scanner.close();
        }
}
