package cn.flyinke.jut;

import com.jfinal.core.Controller;

public class IndexController extends Controller{
	
	public void index() {
		
		renderText("jfinal undertow test");
	}
	
	public void test() {
		setAttr("name", "test name !");
		render("index.html");
	}
}
