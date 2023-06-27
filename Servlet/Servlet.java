import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Servlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		String s1=request.getParameter("t1");
		String s2=request.getParameter("t2");
		String s3=request.getParameter("t3");
		pw.println("<h1>Hello "+s1+"<br>");
		pw.println("<h2>Name: "+s1+"<br><h2>Email Id: "+s2+"<br><h2>Phone Number: "+s3);
		pw.println("<h2>You have Successfully Registered for this Course.");
		pw.close();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
