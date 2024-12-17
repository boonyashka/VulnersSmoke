import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Hardcoded_Password extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request,HttpServletResponse response)
            throws IOException, ServletException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/students";
            Connection con = DriverManager.getConnection(url, "root", "root");
        } catch (Exception e) {
//            e.printStackTrace();
        } 
    }
}