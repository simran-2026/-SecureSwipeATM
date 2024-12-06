import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class Signupone extends JFrame implements ActionListener  {
   long random;
   JTextField  nTextField,fTextField,emTextField,adTextField, CityTextField,StateTextField,  pinTextField;
   JButton next ;
   
   JDateChooser date; 
   JRadioButton male ,female,Others, Married,Unmarried,Singleparent;

   
    Signupone(){
          
        setLayout(null);

        Random ran = new Random ();
        random = Math.abs((ran.nextLong() % 100L)+100L);
        JLabel formno = new JLabel("APPLICATION FORM NO." + random );
         formno.setFont(new Font("raleway", Font.BOLD,30));
         formno.setBounds(180,20,600,40);
         add(formno);
        

         JLabel PersonalDetails = new JLabel("Page 1: Personal Details ");
         PersonalDetails.setFont(new Font("raleway", Font.BOLD,20));
        PersonalDetails.setBounds(290,70,400,30);
         add(PersonalDetails);


         JLabel name  = new JLabel("Name : ");
         name .setFont(new Font("raleway", Font.BOLD,20));
        name .setBounds(100,150,400,30);
         add(name);


         nTextField = new JTextField();
         nTextField .setFont(new Font("Raleway", Font.BOLD,14));
         nTextField .setBounds(300,140,200,30);
         add(nTextField );

         JLabel fname  = new JLabel("Father's Name :");
         fname.setFont(new Font("raleway", Font.BOLD,20));
        fname.setBounds(100,190,200,30);
         add(fname );


         fTextField = new JTextField();
         fTextField.setFont(new Font("Raleway", Font.BOLD,14));
         fTextField .setBounds(300,190,400,30);
         add(fTextField );

         JLabel dob = new JLabel(" Date of Birth :");
         dob.setFont(new Font("raleway", Font.BOLD,20));
          dob.setBounds(95,240,400,30);
         add(dob);


         date = new JDateChooser();
         date.setBounds(300,240,400,30);
         date.setForeground(new Color(105,105,105));
         date.setFont(new Font("raleway", Font.ITALIC,20));
         add(date);
 
         JLabel Gender= new JLabel(" Gender :");
         Gender.setFont(new Font("raleway", Font.BOLD,20));
          Gender.setBounds(95,290,400,30);
         add(Gender);

        male = new JRadioButton("Male");
         male.setBounds(300,290,60,30);
         male.setBackground(Color.GRAY);
         add(male);

         female = new JRadioButton("Female");
         female.setBounds(390,290,100,30);
         female.setBackground(Color.GRAY);
         add(female);


         

         Others = new JRadioButton("Others");
        Others .setBounds(520,290,150,30);
        Others.setBackground(Color.GRAY);
        add(Others);

        ButtonGroup gendeGroup = new ButtonGroup();
        gendeGroup.add(male);
        gendeGroup.add(female);
        gendeGroup.add(Others);
        


         JLabel Email = new JLabel(" Email Address :");
         Email.setFont(new Font("raleway", Font.BOLD,20));
          Email.setBounds(95,340,400,30);
         add(Email);


         emTextField = new JTextField();
         emTextField.setFont(new Font("Raleway", Font.BOLD,14));
        emTextField .setBounds(300,340,400,30);
         add(emTextField );

         
         JLabel Marital = new JLabel(" Marital Status :");
         Marital.setFont(new Font("raleway", Font.BOLD,20));
          Marital.setBounds(95,390,400,30);
         add(Marital);

 

         Married  = new JRadioButton("Married ");
         Married .setBounds(300,390,90,30);
         Married .setBackground(Color.GRAY);
         add( Married );

        Unmarried = new JRadioButton("Unmarried");
         Unmarried .setBounds(420,390,100,30);
         Unmarried .setBackground(Color.GRAY);
         add(Unmarried );


         

         Singleparent = new JRadioButton(" Single Parent");
         Singleparent .setBounds(550,390,150,30);
         Singleparent.setBackground(Color.GRAY);
        add( Singleparent);

        ButtonGroup martialButtonGroup = new ButtonGroup();
        martialButtonGroup.add(Married);
        martialButtonGroup.add(Unmarried);
        martialButtonGroup.add(Singleparent);
        

         JLabel Address = new JLabel(" Address :");
         Address.setFont(new Font("raleway", Font.BOLD,20));
         Address.setBounds(95,440,400,30);
         add(Address);


         adTextField = new JTextField();
         adTextField.setFont(new Font("Raleway", Font.BOLD,14));
         adTextField.setBounds(300,440,400,30);
         add(adTextField );

         JLabel City  = new JLabel(" City :");
         City .setFont(new Font("raleway", Font.BOLD,20));
         City .setBounds(95,490,400,30);
         add(City );



         CityTextField = new JTextField();
         CityTextField .setFont(new Font("Raleway", Font.BOLD,14));
         CityTextField  .setBounds(300,490,400,30);
         add(CityTextField );

         JLabel State  = new JLabel("State : ");
         State .setFont(new Font("raleway", Font.BOLD,20));
         State.setBounds(95,540,400,30);
         add(State );

          StateTextField = new JTextField();
         StateTextField .setFont(new Font("Raleway", Font.BOLD,14));
         StateTextField .setBounds(300,540,400,30);
         add(StateTextField );

        
         JLabel Pincode   = new JLabel("Pin Code : ");
         Pincode .setFont(new Font("raleway", Font.BOLD,20));
         Pincode.setBounds(95,590,400,30);
         add(Pincode);
         
  
         pinTextField= new JTextField();
         pinTextField .setFont(new Font("Raleway", Font.BOLD,14));
         pinTextField .setBounds(300,590,400,30);
         add(pinTextField);


         next = new JButton("Next");
         next.setBackground(new Color(44,45,45));
         next.setForeground(Color.WHITE);
         next.setFont(new Font("Raleway", Font.BOLD,14));
        next.addActionListener(this);
         next.setBounds(620,660,80,30);
         add(next);




        getContentPane().setBackground(Color.GRAY);
        setSize(850,800);
        setLocation(500,10);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        String formno =" "+random;
        String name = nTextField.getText();
        String fname = fTextField.getText();
        String dob = ((JTextField) date .getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()){
            gender = "Male";

        }else if(female.isSelected()){
            gender = "Female";
        }else if(Others.isSelected()){
            gender = "Others";

        }
        String Email = emTextField.getText();
        String marital= null;
        if(Married.isSelected()){
            marital ="Married";
        }else if(Unmarried.isSelected()){
            marital = "Unmarried";
        }else if(Singleparent.isSelected()){
            marital = "Single parent";
        }
         String Address= adTextField.getText();
         String City = CityTextField.getText();
         String State = StateTextField.getText();
         String Pincode = pinTextField.getText();



         try{
          if(name.equals("")){
            JOptionPane.showMessageDialog(null,"Name is Required");
          }else{
            Conn c = new Conn();
            String query = "INSERT INTO signup (formno, name, father_name, dob, gender, email_address, martial_status, address, city, state, pincode) " +
            "VALUES ('" + formno + "', '" + name + "', '" + fname + "', '" + dob + "', '" + gender + "', '" + Email+ 
            "', '" + marital + "', '" + Address + "', '" + City + "', '" + State + "', '" + Pincode + "')";
        c.s.executeUpdate(query); 
        
        setVisible(false);
        new Signuptwo(formno).setVisible(true);
        }
         }catch(Exception s){
            System.out.println(s);
         }
        }

     
 public static void main(String[] args) {
    new Signupone();
 }   
}
