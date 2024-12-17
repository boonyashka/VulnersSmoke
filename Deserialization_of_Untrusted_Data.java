import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.ObjectInputStream;
import java.io.FileInputStream;

public class Deserialization_of_Untrusted_Data extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        String filename = "/home/user/jail/" + request.getParameter("file");
        FileInputStream fis = new FileInputStream(filename);
        ObjectInputStream in = new ObjectInputStream(fis);

    }
}