import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Arbitrary_File_Modification extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		File f1 = new File(request.getParameter("p1"));
		File f2 = new File(request.getParameter("p2"));
		Files.move(f1.toPath(), f2.toPath());
	}
}