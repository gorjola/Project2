package Page;

public class SqlConnection {
    public String url = "jdbc:sqlserver://localhost:1433;encrypt=true;trustServerCertificate=true;";
    public String username = "testAutomation";

    public String password = "Testautomation123";
    public String sql = "SELECT * FROM [students].[dbo].[users]";
}
