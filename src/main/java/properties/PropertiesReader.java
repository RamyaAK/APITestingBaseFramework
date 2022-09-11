package properties;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesReader {
    public Properties properties;

    public PropertiesReader() {

        properties = new Properties();

        String env = BaseProperties.qa_env;

        System.out.println("ENV: "+ BaseProperties.qa_env);

        String propertiesFilePath = env + ".properties";
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(propertiesFilePath);

        try {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


        public String getUrl() {

            return properties.getProperty("url");
        }

    }
