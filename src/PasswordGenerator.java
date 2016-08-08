import java.util.*;

public class PasswordGenerator {

	public static void main(String[] args) {
		String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*(),.";
		char[] alphabetArray = alphabet.toCharArray();
		String password = "";
		while (password.length() <= 6) {
			int tempIndex = new Random().nextInt(alphabetArray.length);
			char tempChar = alphabetArray[tempIndex];
			password = password + tempChar;
		}
		System.out.println(password);

	}

}
