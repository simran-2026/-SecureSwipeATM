import java.sql.*;

import javax.swing.*;

public class Ministatement extends JFrame{
    Ministatement(String pinnumber){
        setTitle("Mini Statement");

         setLayout(null);

         JLabel mini = new JLabel();
         add(mini);

         JLabel bank  = new JLabel("Indian Bank");
         bank.setBounds(150,20,100,30);
         add(bank);

         JLabel card= new JLabel();
        card.setBounds(20,80,300,20);
         add(card);


         JLabel balance = new JLabel();
         balance.setBounds(20,400,300,20);
         add(balance);


         try {
            Conn c = new Conn();
          

            ResultSet rs =c.s.executeQuery("select*from login where pinnumber='2486'" );
            while(rs.next()){
                card.setText("Card Number:"+ rs.getString("cardnumber").substring(0,4)+"xxxxxx");
            }

            
         } catch (Exception e) {
           
            System.out.println(e);
         }
         try {
            Conn c= new Conn();
            int bal = 0;
            ResultSet rs = c.s.executeQuery("Select * from bank where pin='"+pinnumber+"'");
            while (rs.next()) {
                mini.setText(mini.getText() + "<html>" + rs.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("type") +"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("amount")+"<br><br></html>");
                if(rs.getString("type").equals("Deposit")){
                    bal +=Integer.parseInt(rs.getString("amount"));
            
                  }else{
                    bal -=Integer.parseInt(rs.getString("amount"));
            
                  }
            }
            balance.setText("YOUR CURRENT ACCOUNT BALANCE IS Rs " +bal);
            
         } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
         }
         
         mini.setBounds(20,140,400,200);
         setSize(400,600);
         setLocation(20,20);
         setVisible(true);
    }
    public static void main(String[]args){
        new Ministatement("");
    }
}
