package ejemplos.servlet.curso;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/myServlet")
public class MyServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// send HTML page to client
		out.println("<html>");
		out.println("<head><title>Ejemplo HTML desde Servlet</title><link rel=\"stylesheet\" href=\"css/estilos.css\"></head>");
		out.println("<body>");
		out.println("<h1 class=\"greetings\">Java Servlets Tutorial</h1>");
		// out.println("<p>Este es un ejemplo en el curso de Java para generar HTML desde un Servlet.</p>");
		// out.println("<p><a href=\"/myServlet2\">Vamos al otro Servlet</a></p>");
		out.println("<div class=\"form-container\">");
		out.println("<form action=\"/myServlet2\">");
		out.println("<label for=\"nombre\">Nombre:</label><br>");
		out.println("<input type=\"text\" id=\"nombre\" name=\"nombre\" placeholder=\"María\" autofocus><br>");
		out.println("<input type=\"submit\" class=\"btn-submit\" value=\"Entrar\">");
		out.println("</form>");
		out.println("</div");

		out.println("</body></html>");
	}

}