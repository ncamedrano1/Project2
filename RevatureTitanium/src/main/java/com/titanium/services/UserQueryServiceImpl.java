package com.titanium.services;

import com.titanium.models.UserData;
import com.titanium.repository.UserDataRepository;
import com.titanium.repository.UserDataRepositoryImpl;

public class UserQueryServiceImpl implements UserQueryService {

	private UserDataRepository udr = null;

	@Override
	public Boolean checkUsernameExists(String username) {
		udr = new UserDataRepositoryImpl();
		UserData user = null;
		if ((user = udr.findUser(username.toLowerCase())) != null) {
			return true;
		}
		return false;
	}

	@Override
	public Boolean confirmCredentials(String username, String password) {
		udr = new UserDataRepositoryImpl();
		UserData user = null;
		if ((user = udr.findUser(username.toLowerCase())) != null) {
			Integer passHash = password.hashCode();
			if (passHash.equals(user.getPassword().hashCode())) {
				return true;
			}
		}
		return false;
	}

//	public Boolean loginUser(HttpServletRequest request, HttpServletResponse response)
//			throws IOException, ServletException {
//		String username = request.getParameter("username");
//		String password = request.getParameter("password");
//
//		log.info("Login instantiated with username: " + username);
//		if (new LoginService().confirmLogin(username, password)) {
//			HttpSession session = request.getSession(); // gets the session
//			// This will create a session if one does not exist
//			session.setAttribute("username", username);
//
//			// sets the session to have a user Id based on the username used to login...
//			session.setAttribute("userId", new UserQueryService().getUserByUsername(username).getUserId());
//			RequestDispatcher rq = request.getRequestDispatcher("/user/home.html"); // setting the dispatcher to go to
//																					// the next page, which is the
//																					// user/home.html - user home
//																					// page/welcome
//			rq.forward(request, response);
//			log.info(username + ": logged in successfully!");
//			return true;
//		} else {
//			PrintWriter out = HtmlTemplate.getHtmlOut(response);
//			log.warn(username + ": suffered a failed login attempt!");
//			out.println("<h3 style:'color:red'>Denied!</h3>");
//			return false;
//		}
//	}

}
