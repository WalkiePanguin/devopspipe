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
    //private static final String SECRET_KEY = "superSecretKey123";

    public static void main(String[] args) {
        System.out.println("Hello");
    }

   ////  Cross-Site Scripting (XSS)
   // public void displayUserInput(HttpServletRequest request, HttpServletResponse response) throws IOException {
   //     String userInput = request.getParameter("input");
   //     response.getWriter().write("<html><body>User input: " + userInput + "</body></html>");
   // }
}
