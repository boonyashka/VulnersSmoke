import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.xml.sax.InputSource;
import org.xml.sax.Parser;
import org.xml.sax.helpers.ParserFactory;

@SuppressWarnings("deprecation")
public class XML_External_Entity extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		InputSource is = new InputSource(request.getParameter("p1"));
		try {
			Parser p = ParserFactory.makeParser();
			p.parse(is);
		} catch (Exception e) {
		}
	}
}