package controller;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import model.*;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet
{
	private static final long serialVersionUID=1L;
	public LoginServlet()
	{
		super();
	}
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		res.getWriter().append("Served at: ").append(req.getContextPath());
	}
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
	   PrintWriter pw=res.getWriter();
	   String username=req.getParameter("username");
	   String password=req.getParameter("password");
	   Login l=new Login(username,password);
	   LoginUtility loh=new LoginUtility();
	   if(loh.validate(l))
	   {
		   pw.println("Welcome "+username);
	   }
	   else
	   {
		   pw.println("OOPS! Something went wrong.");
	   }
	}

}
