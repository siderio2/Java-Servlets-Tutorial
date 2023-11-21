package ejemplos.servlet.curso;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/myServlet3")
public class MyServlet3 extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {

        // leemos el valor del nombre enviado a través de la URL
        String nombre = request.getParameter("nombre");
        //lo colocamos como atributo del request
        request.setAttribute("nombre", nombre);
        //realizamos un forward a la página JSP donde mostraremos los resultados
        request.getRequestDispatcher("saludo.jsp").forward(request, response);


    }

}
