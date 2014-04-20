package com.decker.DemoPlugin;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.xml.internal.bind.v2.runtime.output.Encoded;


public class Demo implements org.sipc.se.plugin.Plugin {

	public Demo() {
		super();
		// TODO Auto-generated constructor stub
		
	}

	public void getResponse(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
	    try {
	    	
	    	String output="Sb zhangyinan~~";
			OutputStream stream=response.getOutputStream();
			stream.write(output.getBytes());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getUrl() {
		// TODO Auto-generated method stub
		return "/Demo/*";
	}

	public boolean onEnable() {
		// TODO Auto-generated method stub
		return true;
	}
	

}
