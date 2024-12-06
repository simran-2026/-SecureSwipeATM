import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.ExecutionException;

public class Pinchange extends JFrame implements ActionListener{
   JPasswordField pin,repin;
   JButton change,Back;
   String pinnumber;
   
    Pinchange(String pinnumber ){
         this.pinnumber =pinnumber;
        setLayout(null);

        
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
    Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel image = new JLabel(i3);
    image.setBounds(0, 0, 900, 900);
    add(image);


    JLabel text = new JLabel("CHANGE YOUR PIN ");
    text.setForeground(Color.white);
    text.setFont(new Font("System",Font.BOLD,16));
    text.setBounds(250,300,500,35);
   image .add(text);


   JLabel pintext = new JLabel("NEW PIN:");
   pintext.setForeground(Color.white);
   pintext.setFont(new Font("System",Font.BOLD,16));
   pintext.setBounds(165,340,180,25);
  image .add(pintext);


   pin = new JPasswordField();
  pin.setForeground(Color.white);
   pin.setFont(new Font("System",Font.BOLD,16));
   pin.setBounds(330,340,180,25);
  image .add(pin);
  




  JLabel repintext = new JLabel("Re-Enter PIN:");
   repintext.setForeground(Color.white);
   repintext.setFont(new Font("System",Font.BOLD,16));
   repintext.setBounds(165,380,180,35);
  image .add(repintext);

   repin = new JPasswordField();
   repin.setForeground(Color.white);
   repin.setFont(new Font("System",Font.BOLD,16));
   repin.setBounds(330,380,180,25);
   image.add(repin);
     

    change = new JButton("CHANGE");
   change.setBounds(355,485,150,30);
   change.addActionListener(this);
   image.add(change);

    Back = new JButton("BACK");
   Back.setBounds(355,520,150,30);
   Back.addActionListener(this);
   image.add(Back);

   


    setSize(900,900);
    setLocation(900,0);
    setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== change){

             try{

            String npin= pin.getText();
            String rpin = repin.getText();
              
             if(!npin.equals(rpin)){
                JOptionPane.showMessageDialog(null, " re enter the pin , it doesn't match");
                return;

             }
             if(npin.equals("")){
                JOptionPane.showMessageDialog(null, "please enter the pin");
                return;
             }
             if(rpin.equals("")){
                JOptionPane.showMessageDialog(null, "please re-enter new pin");
                return;

             }
             Conn conn = new Conn();
             String query1 = " update bank set pin ='"+rpin+ "'where pin'"+pinnumber+"'";
             String query2 = " update login set pinnumber ='"+rpin+ "'where pinnumber'"+pinnumber+"'";
            String query3 = " update signupthree set pin_number='"+rpin+ "'where pin_number'"+pinnumber+"'";
             conn.s.executeUpdate(query1);
             conn.s.executeUpdate(query2);
             conn.s.executeUpdate(query3);

             JOptionPane.showMessageDialog(null, "PIn Changed successfully");
              setVisible(false);
              new Transaction(pinnumber).setVisible(true);

            
            } catch (Exception e){
            System.out.println(e);
        }
        } 
        else {
            setVisible(false);
            new Transaction(pinnumber).setVisible(true);
        }
        
       
    }
    public static void main(String[] args) {
        new Pinchange(" ").setVisible(true);;
    }
}
