import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspTagException;
import org.apache.taglibs.standard.tag.rt.core.ImportTag;

public class Remote_File_Inclusion extends HttpServlet {

	@SuppressWarnings({ "resource", "deprecation" })
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		String url = request.getParameter("url");
		ImportTag it = new ImportTag();
		try {
			it.setUrl(url);
		} catch (JspTagException e) {
		}
	}
}