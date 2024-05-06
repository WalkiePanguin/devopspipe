import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class CodeQLDemo {
    // Hardcoded Secret Key Vulnerability
    private static final String SECRET_KEY = "superSecretKey123";

    public static void main(String[] args) {
        System.out.println("Hello");
    }

    // Cross-Site Scripting (XSS)
    public void displayUserInput(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String userInput = request.getParameter("input");
        response.getWriter().write("<html><body>User input: " + userInput + "</body></html>");
    }

    // Hardcoded Secret Key Vulnerability
    public static String encrypt(String data) throws Exception {
        SecretKeySpec secretKey = new SecretKeySpec(SECRET_KEY.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        return Base64.getEncoder().encodeToString(cipher.doFinal(data.getBytes("UTF-8")));
    }

    public static String decrypt(String encryptedData) throws Exception {
        SecretKeySpec secretKey = new SecretKeySpec(SECRET_KEY.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        return new String(cipher.doFinal(Base64.getDecoder().decode(encryptedData)));
    }

    // File Not Found Exception Example
    public void readFile(String filePath) {
        try {
            FileReader fileReader = new FileReader(new File(filePath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
