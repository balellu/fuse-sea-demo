package org.test;

import java.io.BufferedReader;
import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;

@WebServlet(name = "HttpServiceServlet", urlPatterns = { "/*" }, loadOnStartup = 1)
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Resource(name = "java:jboss/camel/context/spring-context")
	private CamelContext camelContext;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String name = req.getParameter("name");
		ServletOutputStream out = res.getOutputStream();
		ProducerTemplate producer = camelContext.createProducerTemplate();
		String result = producer.requestBody("direct:getstart", name, String.class);
		out.print(result);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		String input = readFormData(req);

		ServletOutputStream out = res.getOutputStream();
		ProducerTemplate producer = camelContext.createProducerTemplate();
		String result = producer.requestBody("direct:start", input, String.class);
		out.print(result);
	}

	private String readFormData(HttpServletRequest req) throws IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader reader = req.getReader();
		try {
			String line;
			while ((line = reader.readLine()) != null) {
				sb.append(line).append('\n');
			}
		} finally {
			reader.close();
		}
		
		String input = sb.toString();
		return input;
	}
}
