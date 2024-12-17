import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Insufficient_Session_Expiration extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String p1 = request.getParameter("p1");
		int interval = Integer.parseInt(p1);
		HttpSession session = request.getSession(true);
		session.setMaxInactiveInterval(interval);
	}
}