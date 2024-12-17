import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

public class Unrestricted_File_Upload extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        final Part filePart = request.getPart("file");
        final PrintWriter writer = response.getWriter();

        try {
            InputStream filecontent = filePart.getInputStream();
            writer.println("New file created");
        } catch (FileNotFoundException fne) {
        }
    }
}
