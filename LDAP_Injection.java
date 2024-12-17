import java.io.IOException;
import java.util.Hashtable;
import javax.naming.Context;
import javax.naming.Name;
import javax.naming.NamingEnumeration;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;
import javax.naming.ldap.InitialLdapContext;
import javax.naming.ldap.LdapName;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LDAP_Injection extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		String vuln = request.getParameter("name");

		try {
			Hashtable<String, String> env = new Hashtable<String, String>();
			env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
			env.put(Context.PROVIDER_URL, "ldap://localhost:10389/");
			env.put(Context.SECURITY_AUTHENTICATION, "none");

			InitialLdapContext ctx = new InitialLdapContext(env, null);
			ctx.setRequestControls(null);
			String filter = "(givenName=" + vuln + ")";
			Name name = new LdapName("name");
			NamingEnumeration<SearchResult> namingEnum = ctx.search(name, filter, null, new SearchControls());
			namingEnum.close();
		} catch (Exception e) {
		}
	}
}