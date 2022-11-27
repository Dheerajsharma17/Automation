package genricLib;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFille {
	
	public String getdata(String key) throws IOException 
	{
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream(AutoConstant.propertyFile);
		p.load(fis);
		return p.getProperty(key);
		
			
		}

}
