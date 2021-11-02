package com.corejava;

public class Test {
	
	private static Test test;
	private Test(){
		
	}
	
	public static Test getiInstace() {
		if(null==test) {
			test=new Test();
		}
		return test;
	}

}
