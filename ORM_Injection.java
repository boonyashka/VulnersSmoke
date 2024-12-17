import java.io.IOException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ORM_Injection extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jcg-JPA");
		EntityManager em = emf.createEntityManager();
		em.createQuery("UPDATE groups SET groupName=\"group1\" WHERE group_id=" + request.getParameter("id1"));
		em.close();
	}
}