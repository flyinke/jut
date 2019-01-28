package cn.flyinke.jut;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.server.undertow.UndertowServer;
import com.jfinal.template.Engine;

public class Config extends JFinalConfig{
	
	public static void main(String[] args) {
		UndertowServer.start(Config.class,8080,true);
	}

	@Override
	public void configConstant(Constants me) {
		me.setDevMode(true);
		
	}

	@Override
	public void configRoute(Routes me) {
		
		me.add("/", IndexController.class);
	}

	@Override
	public void configEngine(Engine me) {
		
		
	}

	@Override
	public void configPlugin(Plugins me) {
		
		
	}

	@Override
	public void configInterceptor(Interceptors me) {
		
		
	}

	@Override
	public void configHandler(Handlers me) {
		
		
	}
	

}
