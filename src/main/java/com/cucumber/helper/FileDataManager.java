package com.cucumber.helper;

public class FileDataManager {

	public static FileDataManager fdm = new FileDataManager();
	
	public ConfigReader cr;
	
	public ConfigReader getConfigReader() throws Throwable {
		if (cr==null) {
			
			cr = new ConfigReader();
			
		}
		
		return cr;


	}
	private FileDataManager() {
		
	}
}
