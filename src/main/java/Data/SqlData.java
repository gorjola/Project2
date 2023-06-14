package Data;

import Page.SqlConnection;
import org.testng.annotations.DataProvider;
import java.sql.*;

public class SqlData {
    SqlConnection connection=new SqlConnection();
    @DataProvider(name = "user")
    public Object[][] userData() throws SQLException {

        try (Connection conn = DriverManager.getConnection(connection.url, connection.username, connection.password);
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             ResultSet rs = stmt.executeQuery(connection.sql)) {


            rs.last();
            int rowCount = rs.getRow();
            rs.beforeFirst();


            Object[][] data = new Object[rowCount][6];


            int i = 0;
            while (rs.next()) {
                data[i][0]  = rs.getString("firstName");
                data[i][1]  = rs.getString("lastName");
                data[i][2]  = rs.getString("phone");
                data[i][3] = rs.getString("email");
                data[i][4] = rs.getString("dateOfBirth");
                data[i][5] = rs.getString("password");

                i++;
            }

            return data;
        }
    }
}
