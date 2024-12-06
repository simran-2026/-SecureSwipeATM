import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Transaction extends JFrame implements ActionListener {
        JButton deposit,CW, FC,MS,PC,BE,exit;
     String pinnumber;

    Transaction(String pinnumber){
        this.pinnumber =pinnumber;

        setLayout (null);
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,800);
        add(image);

        JLabel text = new JLabel ("please select your transcation");
        text.setBounds(200,280,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,18));
        image.add(text);
      
         deposit = new JButton("Deposit");
      deposit.setBounds(160,370,150,30);
      deposit.addActionListener(this);
      image.add(deposit);


      CW= new JButton("Cash Withdrawl");
    CW.setBounds(360,370,150,30);
   CW.addActionListener(this);  
    image.add(CW);



     FC= new JButton("Fast Cash");
      FC.setBounds(160,400,150,30);
      FC.addActionListener(this);
      image.add(FC);


    MS= new JButton("Mini Statement");
      MS.setBounds(360,400,150,30);
      MS.addActionListener(this);
       image.add(MS);


      PC= new JButton("Pin Change ");
      PC.setBounds(160,430,150,30);
      PC.addActionListener(this);
      image.add(PC);

       BE= new JButton("Balance Enquiry ");
      BE.setBounds(360,430,150,30);
      BE.addActionListener(this);
      image.add(BE);

     exit= new JButton("Exit  ");
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
    System.exit(0);
 }else if(ae.getSource() == deposit){
  setVisible(false);
  new Deposit(pinnumber).setVisible(true);
 }else if (ae.getSource()==CW){
  setVisible(false );
  new withdrawl(pinnumber).setVisible(true);

 }else if(ae.getSource()==FC){
  setVisible(false);
  new Fastcash(pinnumber).setVisible(true);


 }else if ( ae.getSource()==PC){
  setVisible(false);
  new Pinchange(pinnumber).setVisible(true);
 }else if (ae.getSource()==BE){
  setVisible(false);
  new BalanceEnquiry(pinnumber).setVisible(true);
 }else if (ae.getSource()==MS){
  
  new Ministatement(pinnumber).setVisible(true);
 }

   }
    public static void main(String args[]){
        new Transaction(" ");

    }
}
