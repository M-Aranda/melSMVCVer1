package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Artist;
import model.DAO_Artist;


@WebServlet(name = "RegistrarArtistServlet", urlPatterns = {"/registrar.do"})
public class RegistrarArtistServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setCharacterEncoding("UTF-8");

        try {

            Artist a = new Artist();
            a.setArtist_name(request.getParameter("artist_name"));
            a.setMost_popular_song(request.getParameter("most_popular_song"));
            a.setMost_popular_member(request.getParameter("most_popular_member"));

            new DAO_Artist().create(a);

            response.sendRedirect("index.jsp");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistrarArtistServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(RegistrarArtistServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
