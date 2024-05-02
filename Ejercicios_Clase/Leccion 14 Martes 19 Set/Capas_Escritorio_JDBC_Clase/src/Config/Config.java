package Config;

/**
 *
 * @author Mariel Rojas
 */
public final class Config {
    public static String getConnectionString()throws ClassNotFoundException{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return "jdbc:sqlserver://localhost;databasename=CAPAS_JAVA_WEB_2023;user=sa;password=sa";
    }
}
