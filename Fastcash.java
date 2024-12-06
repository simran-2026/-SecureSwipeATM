import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.util.Date;



public class Fastcash extends JFrame implements ActionListener {
        JButton deposit,CW, FC,MS,PC,BE,exit;
     String pinnumber;

          Fastcash(String pinnumber){
        this.pinnumber =pinnumber;

        setLayout (null);
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,800);
        add(image);

        JLabel text = new JLabel ("Select Withdrawl amount ");
        text.setBounds(200,280,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,18));
        image.add(text);
      
         deposit = new JButton("RS 100");
      deposit.setBounds(160,370,150,30);
      deposit.addActionListener(this);
      image.add(deposit);


      CW= new JButton("Rs 500");
    CW.setBounds(360,370,150,30);
   CW.addActionListener(this);  
    image.add(CW);



     FC= new JButton("rs 1000");
      FC.setBounds(160,400,150,30);
      FC.addActionListener(this);
      image.add(FC);


    MS= new JButton("Rs 2000");
      MS.setBounds(360,400,150,30);
      MS.addActionListener(this);
       image.add(MS);


      PC= new JButton("Rs 5000");
      PC.setBounds(160,430,150,30);
      PC.addActionListener(this);
      image.add(PC);

       BE= new JButton("Rs 10000");
      BE.setBounds(360,430,150,30);
      BE.addActionListener(this);
      image.add(BE);

     exit= new JButton("Back");
      exit.setBounds(360,460,150,30);
      exit.addActionListener(this);
      image.add(exit);


        setSize(900,900);
        setLocation(300,0);
        
   setUndecorated(true);
   setVisible(true);


    }

   public void actionPerformed(ActionEvent ae ){
 if (ae.getSource()==exit){
    setVisible(false);
    new Transaction(pinnumber).setVisible(true );
 }else 
 {
  String amount = ((JButton) ae.getSource()).getText().substring (3); 
     Conn c = new Conn();
      try{

       ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
       int balance = 0;
       while (rs.next()) {
      if(rs.getString("type").equals("Deposit")){
        balance +=Integer.parseInt(rs.getString("amount"));

      }else{
        balance -=Integer.parseInt(rs.getString("amount"));

      }
      
    } if(ae.getSource() != exit&& balance < Integer.parseInt(amount)){
      JOptionPane.showMessageDialog(null, " Insufficient Balance");
      return;


    }

Date date = new Date();
String query = " insert into bank (pin, date, type, amount)"+
  " values ('"+pinnumber+"','"+date+"','Withdrawl','"+amount+"')";
       c.s.executeUpdate(query); 
       JOptionPane.showMessageDialog(null,"Rs "+amount+"Debit Successfully");
       setVisible(false);
       new Transaction(pinnumber).setVisible(true);


  }catch(Exception e){
    System.out.println(e);
    }

 }
 }

   
    public static void main(String args[]){
        new Fastcash(" ");

    }
}
