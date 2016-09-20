package me.odirus.practise.webapp;

import me.odirus.practise.webservice.SimpleService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * User: huangjing
 * Email: huangjing@tinman.cn
 * Date: 2016/9/20
 * Time: 9:58
 */
public class SimpleServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.write(SimpleService.getServiceDescription());
		out.flush();
		out.close();
	}
}
