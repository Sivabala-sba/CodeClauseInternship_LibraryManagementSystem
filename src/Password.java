import java.sql.*;

public class Password {

	private Connection connection = null;
	private Statement statement = null;
	private ResultSet resultSet = null;

	private String userName;
	private String passwd;
	
        private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/library";
        private static final String USER_NAME="root";
        private static final String PASSWORD="1234";
	public Password() {
	}
	/*public Members(int memberID, int ID, String password, String name, String email, String major, int numberOfBooks, int mony, Date expired) {
		this.memberID = memberID;
		this.ID = ID;
		this.password = password;
		this.name = name;
		this.email = email;
		this.major = major;
		this.numberOfBooks = numberOfBooks;
		this.mony = mony;
		this.expired = expired;
	}*/

	public String getUsername() {
		return userName;
	}

	public String getPassword() {
		return passwd;
	}

        public boolean connection(String Query) {
            int flag=0;
		try {
			//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Class.forName("com.mysql.jdbc.Driver");
		}
		catch (ClassNotFoundException cnfe) {
			System.out.println("Members.java\n" + cnfe.toString());
		}
		catch (Exception e) {
			System.out.println("Members.java\n" + e.toString());
		}
		try {
			connection = DriverManager.getConnection(DATABASE_URL,USER_NAME,PASSWORD);
                        statement = connection.createStatement();
			Statement stmt= connection.createStatement();
                        stmt.execute(Query);
                        ResultSet rs = stmt.getResultSet();
            boolean recordfound = rs.next();
            if (recordfound) {
                flag=1;
			resultSet = statement.executeQuery(Query);
			while (resultSet.next()) {
				userName = resultSet.getString(1);
				passwd = resultSet.getString(2);
				}
			resultSet.close();
			statement.close();
			connection.close();
            }
                }
		catch (SQLException SQLe) {
			System.out.println("Password.java inside result set\n" + SQLe.toString());
		}
                if (flag==0)
                    return false;
                else
                    return true;
	}

	public void update(String Query) {
		try {
			//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");p
             Class.forName("com.mysql.jdbc.Driver");
		}
		catch (ClassNotFoundException cnfe) {
			System.out.println("Password.java\n" + cnfe.toString());
		}
		catch (Exception e) {
			System.out.println("Password.java\n" + e.toString());
		}
		try {
			connection = DriverManager.getConnection(DATABASE_URL,USER_NAME,PASSWORD);
			statement = connection.createStatement();
			statement.executeUpdate(Query);
			statement.close();
			connection.close();
		}
		catch (SQLException SQLe) {
			System.out.println("Password.java\n" + SQLe.toString());
		}
	}
}