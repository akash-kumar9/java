import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
          Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/nicky","root","#mysqlroot712");
        if (connection.isClosed()){
            System.out.println("database is offline");
        }else {
            System.out.println("database is online");
        }
//        String insertQuery = "insert into student(name,city,age)value(?,?,?)";
//        PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
//        preparedStatement.setString(1,"Sadhana");
//        preparedStatement.setString(2,"Gkp");
//        preparedStatement.setInt(3,25);
//        int result =preparedStatement.executeUpdate();
//        if (result>0){
//            System.out.println("Data inserted Successfully");
//        }else {
//            System.out.println("something went wrong");
//        }
     //    for getting data from database

        String fetchData = "select * from student";
        PreparedStatement getData = connection.prepareStatement(fetchData);
        ResultSet resultSet= getData.executeQuery();

        while (resultSet.next()){
            String name = resultSet.getString("name");
            String city = resultSet.getString("city");
            int age = resultSet.getInt("age");
            System.out.println("Name : "+name+" City : "+city+"  Age :" +age);
        }
        // for deleting data in database
//        String deleteData= "delete from student where name='Akash' ";
//        PreparedStatement delete= connection.prepareStatement(deleteData);
//        int result =delete.executeUpdate();
//        if (result>0){
//            System.out.println("deleted successfully");
//        }


        connection.close();

    }
}