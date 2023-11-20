package ejemplos.servlet.curso;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/myServlet2")
public class MyServlet2 extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// leemos el valor del nombre enviado a través de la URL
		String nombre = request.getParameter("nombre");

		// send HTML page to client
		out.println("<html>");
		out.println("<head><title>Ejemplo HTML desde Servlet</title><link rel=\"stylesheet\" href=\"css/estilos.css\"></head>");
		out.println("<body>");
		out.println("<div class=\"main-container\">");
		// Modificamos la salida para añadir el saludo personalizado
		out.println("<h1>Bienvenid@, " + nombre + "!!</h1>");
		out.println("</div");

		out.println("<p><a class=\"backlink\" href=\"/myServlet\">Volver</a></p>");

		out.println("</body></html>");
	}

}