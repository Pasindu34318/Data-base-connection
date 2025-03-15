
package controller;

import dao.UserDao;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet({"/insertUser", "/deleteUser"})
public class UserServlet extends HttpServlet {
    
    private final UserDao userDAO = new UserDao(); //Create UserDao object

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        String username = request.getParameter("username");
//        String email = request.getParameter("email");
        
        
        String action = request.getServletPath();
        
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println(" <h1>" +action +"</h1><br>");
        out.println("</body></html>");
        
    
        
        if("/insertUser".equals(action)) {
            insertUser(request, response);
        } else if ("/deleteUser".equals(action)) {
            deleteUser(request, response);
        }
    }
    
    private void insertUser(HttpServletRequest request, HttpServletResponse response) throws IOException{
          String username = request.getParameter("username");
          String email = request.getParameter("email");
          
         
          if(userDAO.insertUser(username, email)) {
              System.out.println("User insertion successfully!");
          } else {
              System.out.println("User insertion faild");
          }
          response.sendRedirect("index.jsp");
    }




 private void deleteUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));

        if (userDAO.deleteUser(id)) {
            System.out.println("User deleted successfully!");
        } else {
            System.out.println("User deletion failed!");
        }
        response.sendRedirect("index.jsp");
    }

}
