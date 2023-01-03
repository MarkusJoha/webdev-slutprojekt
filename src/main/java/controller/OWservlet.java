package controller; 

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.GettheWeather;
import model.weatherBean;

@WebServlet("/OWservlet")
public class OWservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String cityStr = request.getParameter("city");
		String countryStr = request.getParameter("country");
		
		
		Cookie ck1 = new Cookie("cityCookie", cityStr);
		ck1.setMaxAge(100);
		response.addCookie(ck1);
		 
		Cookie ck2 = new Cookie("countryCookie", countryStr);
		ck2.setMaxAge(100);
		response.addCookie(ck2);
		
		weatherBean wBean = new weatherBean(cityStr, countryStr);
		

		GettheWeather.getWeather(wBean);

		request.setAttribute("wBean", wBean);

		RequestDispatcher rd = request.getRequestDispatcher("showWeather.jsp");
		rd.forward(request, response);
	}

}
