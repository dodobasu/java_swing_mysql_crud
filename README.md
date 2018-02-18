# JAVA DESKTOP MYSQL CRUD

Create Java Swing Project to CREATE UPDATE DELETE EDIT AND JTABLE

## Getting Started

Download and open in Netbean 8.xx IDE
### Prerequisites
* Java SDK 8.xx
* NetBean IDE
* Connector/J  https://dev.mysql.com/downloads/connector/j/
* JDBC CONNECTOR
* MYSQL Database Server https://dev.mysql.com/downloads/mysql/
* XAMPP Server https://www.apachefriends.org/index.html

```

//////////CREATE DATABASE AND TABLE ////////////
CREATE DATABASE `wbeducar_java`;--

CREATE TABLE IF NOT EXISTS `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(25) COLLATE utf8_unicode_ci DEFAULT NULL,
  `password` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL,
  `user_status` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `entry` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=12 ;

INSERT INTO `user` (`id`, `username`, `password`, `user_status`, `entry`) VALUES
(1, 'admin', 'admin', 'Active', '2018-02-14 22:22:29');

//////////  IMPORT /////////////////////

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//////Others in JFrame //////
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/////////// Database Connection in DBConnection.Java/////////

private Connection DBConnection;
    public Connection connect(){
    
try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Success");            
        }
 catch(ClassNotFoundException cnfe){
            System.out.println("Driver not found" + cnfe);
        }  
        
        String url="jdbc:mysql://localhost:3306/wbeducar_java";        
try{
          DBConnection=DriverManager.getConnection(url,"root","YOUR PASSWORD");
          System.out.println("Database Connected");
        }
catch(SQLException se){
          System.out.println("Database Not Found");  
        }
        return DBConnection;       
 }     
    
////// CALL CONNECTION IN OTHER FORM////////////
 Connection conn=new DBConnection().connect();
 
 //////////////// CHECK SELECT QUERY ON BUTTON CLICK EVENT  ///////////////// 
  String sql="Select * FROM user where username=? AND password=?";
      try{
          PreparedStatement ps=conn.prepareStatement(sql);
          ps.setString(1,txtUser.getText());
          ps.setString(2,txtPass.getText());
          
          ResultSet rs=ps.executeQuery();
          
         if(rs.next()){
             this.dispose();
              MainMenu mm = new MainMenu();
             mm.show();
         }
         else {
             JOptionPane.showMessageDialog(null,"User Credential invalid");
         }
          
      }
      catch(HeadlessException | SQLException e){
       JOptionPane.showMessageDialog(null,"User Credential invalid" + e);   
      }
    
 /////////////////// EXIT FROM APPLICATION ///////////
 System.exit(0);
 
```

### Installing

Clone git and open dist folder and run javaapp.jar in windows environment


## Built With

* [Netbeans](https://netbeans.org/downloads/) - Netbeans IDE
* [Java SDK ](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) - as per your OS

## Contributing & Issue

Please read [CONTRIBUTING.md](https://github.com/dodobasu/java_swing_mysql_crud/issues) for details on our code of conduct, and the process for submitting pull requests to us.


## Authors

* **Prativas Basu** 


## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Bartosz Firyn
