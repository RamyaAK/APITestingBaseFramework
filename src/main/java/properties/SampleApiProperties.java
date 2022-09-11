package properties;

public class SampleApiProperties {
    public static final PropertiesReader propertiesReader = new PropertiesReader();
    public static final String baseUrl = propertiesReader.getUrl();
}
