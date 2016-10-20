package servletHTML;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AreaTriangulo extends HttpServlet {

    int Altura,Base;
    float Resultado;
    

    public void doPost(HttpServletRequest peticion, HttpServletResponse respuesta) throws ServletException, IOException {
        Altura = Integer.parseInt(peticion.getParameter("Altura"));
        Base = Integer.parseInt(peticion.getParameter("Base"));
        
        Resultado = (float)(Altura*Base)/2;

        PrintWriter out = new PrintWriter(respuesta.getOutputStream());
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head><title>RespuestaServlet</title>" + "</head>");
        out.println("<body>" + "<h1>El resultado es:</h1>" + " <br>" + "Area del triangulo: " + Resultado +"<br><br>" + "</body>");
        out.println("</html>");
        out.close();
    }
}
