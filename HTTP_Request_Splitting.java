import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HTTP_Request_Splitting extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String p1 = request.getParameter("p1");
		String p2 = request.getParameter("p2");
		URLConnection conn = new URL("http://localhost:8080").openConnection();
		String prop = conn.getRequestProperty(p1);
		conn.setRequestProperty(p1, p2);
	}
}