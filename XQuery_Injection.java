import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.xquery.XQConnection;
import javax.xml.xquery.XQDataSource;
import javax.xml.xquery.XQException;
import javax.xml.xquery.XQPreparedExpression;
import net.sf.saxon.xqj.SaxonXQDataSource;

public class XQuery_Injection extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String name = request.getParameter("name");
		XQDataSource ds = new SaxonXQDataSource();
		try {
			XQConnection conn = ds.getConnection();
			XQPreparedExpression prexp = conn.prepareExpression(name);
			prexp.executeQuery();
		} catch (XQException e) {
		}
	}
}