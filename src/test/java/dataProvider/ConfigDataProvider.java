package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
	Properties pro;
	public ConfigDataProvider()
	{
		File src=new File("./Configuaration/config.properties");
		try {
			
			FileInputStream fis = new FileInputStream(src);
			pro= new Properties();
			pro.load(fis); 
			
		} catch (Exception e) //Exception is Base Exception
		{  
		System.out.println("Exception is "+e.getMessage());
		}
	}
	public String getIEPath()
	{
		String iepath=pro.getProperty("IEPath");
		return iepath;
	}
	public String getChromePath()
	{
		String cpath=pro.getProperty("chromePath");
		return cpath;
	}
	public String getFFPath()
	{
		String gpath=pro.getProperty("Geckopath");
		return gpath;
	}
	public String getApplicationUrl()
	{
		String url=pro.getProperty("url");
		return url;
	}
	
}
