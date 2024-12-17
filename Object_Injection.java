import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.URL;
import java.net.URLClassLoader;

public class Object_Injection extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String classURL = request.getParameter("classURL");
		URL[] classURLs = new URL[] { new URL(classURL) };
		URLClassLoader urlClassLoader = new URLClassLoader(classURLs);
	}
}