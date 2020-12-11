package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.MemberDao;
import Model.Member;
@WebServlet("/AddMemberController")
public class AddMemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	public AddMemberController() {
		super();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		if(new MemberDao().queryUser(username)) {
			response.sendRedirect("addMemberError.jsp");
		}else {
			String password=request.getParameter("password");
			String name=request.getParameter("name");
			String address=request.getParameter("address");
			String phone=request.getParameter("phone");
			String mobile=request.getParameter("mobile");
			
			Member m=new Member(username, password, name, address, phone, mobile);
			
			new MemberDao().add(m);
			
			response.sendRedirect("addMemberSuccess.jsp");
			
			
		}
	
	}

}
