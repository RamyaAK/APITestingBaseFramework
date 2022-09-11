package properties;

public class BaseProperties {
    public static final String qa_env = System.getProperty("env", "qa");
    public static final String prod_env = System.getProperty("env", "prod");
    public static final String uat_env = System.getProperty("env", "uat");
    public static final String TAGS = System.getProperty("tags", "smoke");
}
