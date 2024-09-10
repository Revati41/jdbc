package javajdbc;


	import java.sql.Connection;
		import java.sql.DriverManager;
		import java.sql.SQLException;
		import java.sql.Statement;

		public class student{

			public static void main(String[] args) throws ClassNotFoundException, SQLException {
		 
				
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=	DriverManager.getConnection("jdbc:mysql://localhost:3306/testcon", "root", "root");
		String query="insert into  student values(101,'Pravin','pune')";
			Statement smt =con.createStatement();
			smt.execute(query);
			
			con.close();
			smt.close();
			System.out.println("successfull");
			}

		

	}


