
    import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Signuptwo extends JFrame implements ActionListener  {

   JTextField  pan, Adhaar;
   JButton next ;
   

   JRadioButton syes,sno,eyes,eno;
   JComboBox religion, category, occupatn,education,income; 
   String formno ;


    Signuptwo(String formno){
        this.formno =  formno;

        setLayout(null);
         setTitle("NEW ACCOUNT APPLICATION FORM: PAGE-2");
        
        
        

         JLabel additionalDetails = new JLabel("Page 2:Additional Details ");
         additionalDetails.setFont(new Font("raleway", Font.BOLD,20));
         additionalDetails.setBounds(290,70,400,30);
         add(additionalDetails);


         JLabel Religion   = new JLabel("Religion :");
         Religion.setFont(new Font("Raleway",Font.BOLD,20));
         Religion.setBounds(100,140,100,30);
         add(Religion);


         String rel[] = {"Hindu","Muslim","Sikh","Christian","Others "};
          religion  = new JComboBox(rel);
         religion .setBounds(300,140,200,30);

         add(religion);
        
         JLabel Category  = new JLabel("Category :");
         Category .setFont(new Font("raleway", Font.BOLD,20));
        Category .setBounds(100,190,200,30);
         add(Category);

         String valcategory[]= {"General","OBC","ST","SC","Others"};
         category = new JComboBox(valcategory);
        
         category.setFont(new Font("Raleway", Font.BOLD,14));
         category .setBounds(300,190,400,30);
         add(category );

         JLabel dob = new JLabel(" Income :");
         dob.setFont(new Font("raleway", Font.BOLD,20));
          dob.setBounds(95,240,400,30);
         add(dob);

        String incomecat[]={"Null","<1,50,000","<2,50,000","<5,00,00","Upto 10,00,000"};
          income = new JComboBox(incomecat);
         income.setBounds(300,240,400,30);
         income.setForeground(new Color(105,105,105));
         income.setFont(new Font("raleway", Font.BOLD,14));
         add(income);
 
         JLabel Gender= new JLabel("Education");
         Gender.setFont(new Font("raleway", Font.BOLD,20));
          Gender.setBounds(95,290,400,30);
         add(Gender);

        


         JLabel Email = new JLabel(" Qualification :");
         Email.setFont(new Font("raleway", Font.BOLD,20));
          Email.setBounds(95,315,400,30);
         add(Email);
         
         String ed_level[]={"Non-Graduate","Graduate", " Post Graduate" , "Doctrate"," Others"};
         education = new JComboBox(ed_level);
        education.setFont(new Font("Raleway", Font.BOLD,14));
        education .setBounds(300,315,400,30);
         add(education );

         
         JLabel occp = new JLabel("Occupation :");
         occp.setFont(new Font("raleway", Font.BOLD,20));
         occp.setBounds(95,390,400,30);
         add(occp);

         String occupation_values[]={"Salaried ","Self-employed", " Retired" , "Student"," Others"};
         occupatn = new JComboBox(occupation_values);
        occupatn.setFont(new Font("Raleway", Font.BOLD,14));
       occupatn .setBounds(300,390,400,30);
         add(occupatn);

         

         
         JLabel Address = new JLabel(" Pan no.:");
         Address.setFont(new Font("raleway", Font.BOLD,20));
         Address.setBounds(95,440,400,30);
         add(Address);


         pan = new JTextField();
         pan.setFont(new Font("Raleway", Font.BOLD,14));
         pan.setBounds(300,440,400,30);
         add(pan );

         JLabel City  = new JLabel(" Adhaar no. :");
         City .setFont(new Font("raleway", Font.BOLD,20));
         City .setBounds(95,490,400,30);
         add(City );



         Adhaar = new JTextField();
         Adhaar .setFont(new Font("Raleway", Font.BOLD,14));
         Adhaar  .setBounds(300,490,400,30);
         add(Adhaar );

         JLabel senior  = new JLabel(" Senior Citizen: ");
         senior .setFont(new Font("raleway", Font.BOLD,20));
         senior.setBounds(95,540,400,30);
         add(senior );
        
         syes = new JRadioButton("YES ");
         syes .setFont(new Font("Raleway", Font.BOLD,14));
        syes.setBackground(Color.GRAY);
         syes .setBounds(300,540,90,30);
         add(syes );


         sno= new JRadioButton("NO");
         sno .setFont(new Font("Raleway", Font.BOLD,14));
        sno.setBackground(Color.GRAY);
         sno.setBounds(410,540,400,30);
         add(sno );


         ButtonGroup seniorcit = new ButtonGroup();
         seniorcit.add(syes);
         seniorcit.add(sno);
        
         JLabel existingacc   = new JLabel("Existing Account  : ");
         existingacc .setFont(new Font("raleway", Font.BOLD,20));
         existingacc.setBounds(95,590,400,30);
         add(existingacc);
         

         eyes = new JRadioButton("YES ");
         eyes .setFont(new Font("Raleway", Font.BOLD,14));
         eyes.setBackground(Color.GRAY);
         eyes .setBounds(300,590,90,30);
         add(eyes );


         eno= new JRadioButton("NO");
         eno .setFont(new Font("Raleway", Font.BOLD,14));
         eno.setBackground(Color.GRAY);
         eno.setBounds(410,590,400,30);
         add(eno );
  
         ButtonGroup extacc = new ButtonGroup();
         extacc.add(eyes);
         extacc.add(eno);
        


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
    @Override
    public void actionPerformed(ActionEvent e){
        String formno =" ";
        String sreligion = (String)religion.getSelectedItem();
        String scategory = (String)category.getSelectedItem();
        String sincome  = (String) income .getSelectedItem();
       String seducation =(String) education.getSelectedItem();
       String occupation =(String) occupatn.getSelectedItem();

        String seniorcitizen = null;
        if(syes.isSelected()){
             seniorcitizen= "Yes";

        }else if(sno.isSelected()){
            seniorcitizen = "No";
        }
        // String Email = education.getText();
        String Existing_account = null;
        if(eyes .isSelected()){
            Existing_account ="Yes";
        }else if(eno.isSelected()){
            Existing_account = "No";
        }
         String span= pan.getText();
         String saadhar  = Adhaar.getText();
        


         try{
         
            Conn c = new Conn();
            String query = "INSERT INTO signuptwo (formno, Religion, Category, Income, Education_Qualification,Occupation,Pan_no, Aadhar_no, Senior_citizen,exisiting_account) " +
            "VALUES ('" + formno + "', '" + sreligion + "', '" + scategory + "', '" +sincome + "', '" + seducation + "', '" +occupation + "', '"+ span+ 
            "', '" + saadhar + "', '" + seniorcitizen + "', '" + Existing_account+ "')";
        c.s.executeUpdate(query); 
        //signup 3 object 
           setVisible(false );
           new signupthree(formno).setVisible(true);
         }catch(Exception ex){
            System.out.println(ex);
         }
        }

     
 public static void main(String[] args) {
    new Signuptwo("");
 }   
}


