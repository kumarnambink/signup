
package project;
import java .sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author ELCOT
 */
public class InsertUpdateDelete {
     public static void setData(String Query,String msg){
                   Connection con = null;
                   Statement st = null;
     
     try{
           con= ConnectionProvider.getCon();
           st=con.createStatement();
          st.executeUpdate(Query);
          if (!msg.equals(""))
              JOptionPane.showMessageDialog(null, msg);
    }
     catch( Exception e){
         System.out.println("This line problem kumar");
       JOptionPane.showMessageDialog(null,e);
     
     }
     finally{
      }  
     try
         
     {}
     catch(Exception e)
     {}
     
     
     }
     
       // String query ="insert into car( name,Email,mobileNumber, password,confirmpassword)values('"+car.getName()+"','"+car.getmobileNumber()+"','"+car.getEmail()+"','"+car.getPassword()+"','" +car.getConfirmpassword()+"','false')";
          //DbOperations.setDataOrDelete(query,"register successfully ! wait for Admin Apporvall");
    
}
