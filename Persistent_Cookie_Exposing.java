import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Persistent_Cookie_Exposing extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String p1 = request.getParameter("p1");
		Cookie cookie = new Cookie("myCookie", "cookie");
		cookie.setMaxAge(Integer.parseInt(p1));
	}
}