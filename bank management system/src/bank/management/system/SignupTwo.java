package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignupTwo extends JFrame implements ActionListener{
    
    
    JTextField panTextField,aadharTextField;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    JComboBox religionBox,categoryBox,occupationBox,incomeBox,educationBox;
    String formno;
    
    SignupTwo(String formno)
    {
        this.formno=formno;
        setTitle("New Account Application Form Page:2");
        
        JLabel additionallDetails=new JLabel("Additional Details");
        additionallDetails.setFont(new Font("Raleway",Font.BOLD,20));
        additionallDetails.setBounds(290,80,400,30);
        add(additionallDetails);
        
        JLabel religion=new JLabel("Religion:");
        religion.setFont(new Font("Raleway",Font.BOLD,20));
        religion.setBounds(100,140,200,30);
        add(religion);
        
        String valReligion[]={"Hindu","Muslim","Sikh","Christain","Others"};
        religionBox=new JComboBox(valReligion);
        religionBox.setBounds(300,140,400,30);
        religionBox.setBackground(Color.WHITE);
        add(religionBox);
        
        
        JLabel category=new JLabel("Category");
        category.setFont(new Font("Raleway",Font.BOLD,20));
        category.setBounds(100,190,200,30);
        add(category);
        
        String valCategory[]={"General","OBC","SC","ST","Others"};
        categoryBox=new JComboBox(valCategory);
        categoryBox.setBounds(300,190,400,30);
        categoryBox.setBackground(Color.WHITE);
        add(categoryBox);
        
        JLabel income=new JLabel("Income");
        income.setFont(new Font("Raleway",Font.BOLD,20));
        income.setBounds(100,240,200,30);
        add(income);
        
        String valIncome[]={"Null","<1,50,000","<2,50,000","<5,00,000","upto 10,00,000"};
        incomeBox=new JComboBox(valIncome);
        incomeBox.setBounds(300,240,400,30);
        incomeBox.setBackground(Color.WHITE);
        add(incomeBox);
        
        
        JLabel education=new JLabel("Educational");
        education.setFont(new Font("Raleway",Font.BOLD,20));
        education.setBounds(100,290,200,30);
        add(education);
        JLabel qualification=new JLabel("Qualifications:");
        qualification.setFont(new Font("Raleway",Font.BOLD,20));
        qualification.setBounds(100,315,200,30);
        add(qualification);
        
        String valEducation[]={"Under Graduate","Graduate","Post Graduate","Doctorate","Others"};
        educationBox=new JComboBox(valEducation);
        educationBox.setBounds(300,300,400,30);
        educationBox.setBackground(Color.WHITE);
        add(educationBox);
        
        JLabel occupation=new JLabel("Occupation:");
        occupation.setFont(new Font("Raleway",Font.BOLD,20));
        occupation.setBounds(100,370,200,30);
        add(occupation);
        
        String valOccupation[]={"Self Empolyed","Business","Salaried","Student","Retired","Others"};
        occupationBox=new JComboBox(valOccupation);
        occupationBox.setBounds(300,370,400,30);
        occupationBox.setBackground(Color.WHITE);
        add(occupationBox);
      
        JLabel pan=new JLabel("PAN:");
        pan.setFont(new Font("Raleway",Font.BOLD,20));
        pan.setBounds(100,420,200,30);
        add(pan);
        
        panTextField=new JTextField();
        panTextField.setFont(new Font("Raleway",Font.BOLD,14));
        panTextField.setBounds(300,420,400,30);
        add(panTextField);
        
        JLabel aadhar=new JLabel("AADHAR:");
        aadhar.setFont(new Font("Raleway",Font.BOLD,20));
        aadhar.setBounds(100,470,200,30);
        add(aadhar);
        
        aadharTextField=new JTextField();
        aadharTextField.setFont(new Font("Raleway",Font.BOLD,14));
        aadharTextField.setBounds(300,470,400,30);
        add(aadharTextField);
        
        JLabel senior=new JLabel("Senior Citizen:");
        senior.setFont(new Font("Raleway",Font.BOLD,20));
        senior.setBounds(100,520,200,30);
        add(senior);
        
        syes=new JRadioButton("YES");
        syes.setBounds(300,520,100,30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno=new JRadioButton("NO");
        sno.setBounds(400,520,150,30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        ButtonGroup seniorGroup=new ButtonGroup();
        seniorGroup.add(syes);
        seniorGroup.add(sno);
        
        JLabel account=new JLabel("Existing Account:");
        account.setFont(new Font("Raleway",Font.BOLD,20));
        account.setBounds(100,570,200,30);
        add(account);
        
        eyes=new JRadioButton("YES");
        eyes.setBounds(300,570,100,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno=new JRadioButton("NO");
        eno.setBounds(400,570,150,30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        ButtonGroup accountGroup=new ButtonGroup();
        accountGroup.add(eyes);
        accountGroup.add(eno);
        
        next=new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
                
                
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setSize(850,800);
        setLocation(300,10);
        setVisible(true);
    } 
    @Override
    public void actionPerformed(ActionEvent ae)
    {
       
       String religion=(String)religionBox.getSelectedItem();
       String category=(String)categoryBox.getSelectedItem();
       String income=(String)incomeBox.getSelectedItem();
       String education=(String) educationBox.getSelectedItem();
       String occupation=(String)occupationBox.getSelectedItem();
       String pan=(String)panTextField.getText();
       String aadhar=(String)aadharTextField.getText();
       String senior=null;
       if(syes.isSelected())
       {
           senior="YES";
       }
       if(sno.isSelected())
       {
           senior="NO";
       }
       
       String account=null;
       
       if(eyes.isSelected())
       {
           account="YES";
       }
       if(eno.isSelected())
       {
           account="NO";
       }
       
       
        try {    
         
                Conn c=new Conn();
                String query="insert into Signuptwo values('"+formno+"','"+religion+"','"+category+"','"+income+"','"+education+"','"+occupation+"','"+pan+"','"+aadhar+"','"+senior+"','"+account+"')";
                c.s.executeUpdate(query);
                
                setVisible(false);
                new SignupThree(formno).setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
        }
       
       
    }
    
    public static void main(String[] args) {
        new SignupTwo("");
    }

  
}
