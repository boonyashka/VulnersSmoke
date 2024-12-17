import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cross_site_Scripting extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String a = request.getParameter("a");
		response.setContentType("text/html");
		response.sendError(HttpServletResponse.SC_CONTINUE, a);
	}
}