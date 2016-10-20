package servletHTML;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AreaRectangulo extends HttpServlet {

    int Altura,Base;
    float Resultado;

    public void doPost(HttpServletRequest peticion, HttpServletResponse respuesta) throws ServletException, IOException {
        Altura = Integer.parseInt(peticion.getParameter("Altura"));
        Base = Integer.parseInt(peticion.getParameter("Base"));
        
        Resultado = (float)Altura*Base;

        PrintWriter out = new PrintWriter(respuesta.getOutputStream());
        out.println("<html>");
        out.println("<head><title>RespuestaServlet</title>" + "</head>");
        out.println("<body>"+ "El area del Rectangulo es: "+ Resultado + "</body>");
        out.println("</html");
        out.close();
    }
}
