package servlets.EditServlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlets.AbstractAppServlet;
import tools.repository.UserRepository;

@WebServlet(name= "EditClubInDb", urlPatterns = {"/EditClubInDb"})
public class EditClubInDb extends AbstractAppServlet {
    /**
     * Tar imot http requesten og kaller på writeResponse()
     * @param request objektet sender data til servletet
     * @param response objektet sender data fra servleten.
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        writeResponse(request, response, "Hello!");
    }

    /**
     * skriver ut body på servlet som html.
     * @param req http request objektet med data.
     * @param out http respons objektet som sender data.
     *  Writebody må oppdateres. Er generisk fra start. Har bare ikke endra enda.
     */
    @Override
    protected void writeBody(HttpServletRequest req, PrintWriter out) {
        String username = req.getParameter("uname");
        String lname = req.getParameter("lname");
        String age = req.getParameter("age");
        String study_code = req.getParameter("study_code");


        /*out.println(username + lname + age + study_code);
        UserRepository.editUser(username, lname, age, study_code, out);
        String nameFromDb = UserRepository.getUserName(username,out);

        out.format("<h1> Here is your request: %s</h1", nameFromDb);*/


    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */

    /**
     * Alle get forespørsler til denne servleten blir håndert av doGEt.
     * får servleten en Get request vil den svare med doGet som kaller på metoden process Request.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}

