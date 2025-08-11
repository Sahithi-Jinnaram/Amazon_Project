package utilitiyfiles;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigFileReader {
	Properties pro;
	public ConfigFileReader() {
				File fs=new File("C:\\Users\\Dell\\eclipse-workspace\\Amazon1\\ config\\config.properties");
				try {
					FileInputStream f=new FileInputStream(fs);
					pro=new Properties();
					pro.load(f);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
	public String getbrowser() {
		return pro.getProperty("browser");
	}

	public String getURL() {
		return pro.getProperty("URL");
	}
}
