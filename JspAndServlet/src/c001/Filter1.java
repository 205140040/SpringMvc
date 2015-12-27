package c001;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Filter1 implements Filter{

	@Override
	public void destroy() {
		System.out.println("filter destroy");
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("filter do filter");
		res.setContentType("text/html");
		res.setCharacterEncoding("UTF-8");
		PrintWriter out=res.getWriter();
		out.println("过滤器运行:filter do filter<br>");
		out.close();
		chain.doFilter(req, res);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("filter init");
		
	}

}
