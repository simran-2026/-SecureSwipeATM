import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class signupthree extends JFrame  implements ActionListener
 {
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
     String formno;
    JButton submit,cancel; 
    signupthree( String formno){
        this.formno = formno;

        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM: PAGE-3");
        
        JLabel l1 = new JLabel (" Page:3 Account Details ");
        l1.setFont(new Font("raleway",Font.BOLD,22));
        l1.setBounds(300,40,400,40);
        add(l1);

        JLabel Type = new JLabel ("1. Account Type");
        Type.setFont(new Font("raleway",Font.BOLD,22));
        Type.setBounds(100,140,400,30);
        add(Type);

       r1 = new JRadioButton("Saving Account");
       r1.setFont(new Font("raleway",Font.BOLD,16));
       r1.setBounds(100,180,150,20);
       
       add(r1);


       r2= new JRadioButton("Fixed Deposit Account");
       r2.setFont(new Font("raleway",Font.BOLD,16));
       r2.setBounds(390,180,250,20);
    //    r2.setBackground(Color.white);
       add(r2);
       r3 = new JRadioButton("Current  Account");
       r3.setFont(new Font("raleway",Font.BOLD,16));
       r3.setBounds(100,210,250,20);
    //    r3.setBackground(Color.WHITE);
       add(r3);
 
       r4 = new JRadioButton("Recurring Deposite Account");
       r4.setFont(new Font("raleway",Font.BOLD,16));
       r4.setBounds(390,210,300,20);
       
       add(r4);

       ButtonGroup groupaccount = new ButtonGroup();
       groupaccount.add(r1);
       groupaccount.add(r2);
       groupaccount.add(r3);
       groupaccount.add(r4);



       JLabel Cardno = new JLabel ("2. Card number  ");
        Cardno.setFont(new Font("raleway",Font.BOLD,22));
        Cardno.setBounds(100,300,400,30);
        add(Cardno);




        JLabel number  = new JLabel (" XXXX-XXXX-XXXX-4104 ");
        number .setFont(new Font("raleway",Font.BOLD,22));
        number .setBounds(330,300,350,30);
        add(number);


        JLabel cardtail= new JLabel ("Your 16 Digit Card Number");
        cardtail.setFont(new Font("raleway",Font.BOLD,12));
        cardtail.setBounds(100,330,300,20);
        add(cardtail);


        
        JLabel pin= new JLabel ("3. PIN :");
        pin.setFont(new Font("raleway",Font.BOLD,22));
        pin.setBounds(100,370,400,30);
        add(pin);



        JLabel pnumber = new JLabel (" XXXX");
        pnumber .setFont(new Font("raleway",Font.BOLD,22));
        pnumber .setBounds(330,370,400,30);
        add(pnumber);


        JLabel pindetail= new JLabel ("Your 4 Digit password");
        pindetail.setFont(new Font("raleway",Font.BOLD,12));
        pindetail.setBounds(100,400,300,20);
        add( pindetail);

        JLabel services  = new JLabel ("4. Service Required ");
        services.setFont(new Font("raleway",Font.BOLD,22));
        services.setBounds(100,420,350,30);
        add( services);


        c1 = new JCheckBox("ATM CARD");
        c1.setFont(new Font("raleway",Font.BOLD,22));
        c1.setBounds(100,480,200,20);
        add(c1);
              
        c2 = new JCheckBox("Internet Banking ");
        c2.setFont(new Font("raleway",Font.BOLD,22));
        c2.setBounds(100,520,300,30);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setFont(new Font("raleway",Font.BOLD,22));
        c3.setBounds(400,480,200,30);
        add(c3);

        c4= new JCheckBox("Email & SMS alerts ");
        c4.setFont(new Font("raleway",Font.BOLD,22));
        c4.setBounds(400,520,300,20);
        add(c4);

        c5= new JCheckBox(" Cheque Book");
        c5.setFont(new Font("raleway",Font.BOLD,22));
        c5.setBounds(100,560,200,30);
        add(c5);


        c6= new JCheckBox("E-Statement");
        c6.setFont(new Font("raleway",Font.BOLD,22));
        c6.setBounds(400,560,200,20);
        add(c6);
    

        c7 = new JCheckBox("I here by declare that the above entered details are correct to the best of my knowledge  ");
        c7.setFont(new Font("raleway",Font.BOLD,10));
        c7.setBounds(100,650,600,20);
        add(c7);
          

      submit =  new JButton("Submit");
      submit.setFont(new Font("raleway",Font.BOLD,14));
      submit.setBounds(250,720,100,30);
      submit.setBackground(Color.black);
      submit.addActionListener(this);
       add(submit);


       cancel=  new JButton("Cancel");
       cancel.setFont(new Font("raleway",Font.BOLD,14));
       cancel.setBounds(400,720,100,30);
       cancel.setBackground(Color.black);
       cancel.addActionListener(this);
       add(cancel);



       setSize(850,820);
        setLocation(350,0);
        //  getContentPane().setBackground(Color.white);
   
        
        setVisible(true );
    }

    public  void actionPerformed(ActionEvent ae){
        if( ae.getSource() == submit){
          String accType = null;
          if(r1.isSelected()){
            accType = "Saving Account ";


          }else if(r2.isSelected()){
            accType = " Fixed Deposit Account";

          }else if(r3.isSelected()){
            accType= "Current Account";
          }else if(r4.isSelected()){
            accType = "Recurring deposit Account";
          }

          Random  random = new Random();
          String  cardnumber  = "" + Math.abs((random.nextLong()%90000000L)) + 5040936000000000L;
 
          String pinnumber = " "+ Math.abs((random.nextLong() % 9000L) +1000L);

          String facility = "";
          if(c1.isSelected()){
            facility = facility +"ATM Card";
          }else if(c2.isSelected()){
            facility = facility +" Internet Banking";
          }else if(c3.isSelected()){
            facility = facility + "Mobile Banking";

          }else if(c4.isSelected()){
            facility = facility +" Email  & Sms Alert";
          }else if(c5.isSelected()){
            facility = facility +"Cheque Book ";
         }else if(c6.isSelected()){
            facility = facility +" E-Statement";
          } 
           
          try {
             
            if(pinnumber.equals(" ")){
                JOptionPane.showMessageDialog(null,"Pin number  is Required");

            }

            else if(cardnumber.equals(" ")){
                JOptionPane.showMessageDialog(null,"Card number is Required");

            }

           else  if(accType.equals(" ")){
                JOptionPane.showMessageDialog(null,"Account Type is Required");

            } else {
               Conn conn = new Conn();
                String query1 =" Insert into signupthree (formno, Account_Type , card_number, Pin_number, facility   )"+ 
                 "VALUES ('" +formno+ "','" +accType+ "','" +cardnumber+ "','" +pinnumber+ "','" +facility+ "')'";
                 
                 String query2 =" Insert into login (formno,  cardnumber, pinnumber )"+ 
                 "VALUES ('" +formno+ "','" +cardnumber+ "','" +pinnumber+  "')'";
                
                 conn.s.executeUpdate(query1);
                 conn.s.executeUpdate(query2);

                 JOptionPane.showMessageDialog(null,"Card Number " + cardnumber+ "Pin:" +pinnumber);
            }
            setVisible(false);
            new Deposit(pinnumber).setVisible(false  );


          }catch(Exception e){
            System.out.println(e);
          }


        }else if(ae.getSource() == cancel){
              setVisible(false );
              new Login().setVisible(true);
        }
    }
    public static void main(String[] args) {
        new signupthree("");
    }
}
