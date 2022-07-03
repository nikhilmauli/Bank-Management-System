package bank.management.system;
import javax.swing.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignupOne extends JFrame implements ActionListener{
    
    long random;
    JTextField nameTextField,fatherTextField,dobJTextField,emailTextField,cityTextField,stateTextField,addTextField,pincodeTextField;
    JButton next;
    JRadioButton male,female,ot,married,unmarried,oth;
    JDateChooser dateChooser;
    
    SignupOne()
    {
        setTitle("New Account Details Page:1");
        Random ran=new Random();
        random=Math.abs((ran.nextLong()%9000L)+1000L);
        
        JLabel formno=new JLabel("Application Form No:- "+random);
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);
        
        JLabel personalDetails=new JLabel("Personal Details");
        personalDetails.setFont(new Font("Raleway",Font.BOLD,20));
        personalDetails.setBounds(290,80,400,30);
        add(personalDetails);
        
        JLabel name=new JLabel("Name:");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,200,30);
        add(name);
        
       nameTextField=new JTextField();
       nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
       nameTextField.setBounds(300,140,400,30);
        add(nameTextField);
        
        
        JLabel father=new JLabel("Father's Name:");
        father.setFont(new Font("Raleway",Font.BOLD,20));
        father.setBounds(100,190,200,30);
        add(father);
        
        fatherTextField=new JTextField();
        fatherTextField.setFont(new Font("Raleway",Font.BOLD,14));
        fatherTextField.setBounds(300,190,400,30);
        add(fatherTextField);
        
        JLabel dob=new JLabel("DOB:");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);
        
        dateChooser=new JDateChooser();
        dateChooser.setBounds(300,240,400,30);
        dateChooser.setForeground(new Color(105,105,105));
        add(dateChooser);
        
        JLabel gender=new JLabel("Gender:");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);
        
        male=new JRadioButton("Male");
        male.setBounds(300,290,100,30);
        male.setBackground(Color.WHITE);
        add(male);
        
        female=new JRadioButton("Female");
        female.setBounds(400,290,100,30);
        female.setBackground(Color.WHITE);
        add(female);
        
        ot=new JRadioButton("Others");
        ot.setBounds(500,290,100,30);
        ot.setBackground(Color.WHITE);
        add(ot);
        
        ButtonGroup genderGroup=new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        genderGroup.add(ot);
        
        
        JLabel email=new JLabel("Email:");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,340,200,30);
        add(email);
        
        emailTextField=new JTextField();
        emailTextField.setFont(new Font("Raleway",Font.BOLD,14));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);
        
        JLabel maritalStatus=new JLabel("Marital Status:");
        maritalStatus.setFont(new Font("Raleway",Font.BOLD,20));
        maritalStatus.setBounds(100,390,200,30);
        add(maritalStatus);
        
        married=new JRadioButton("Married");
        married.setBounds(300,390,100,30);
        married.setBackground(Color.WHITE);
        add(married);
        
        unmarried=new JRadioButton("Unmarried");
        unmarried.setBounds(400,390,150,30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
        oth=new JRadioButton("Others");
        oth.setBounds(550,390,150,30);
        oth.setBackground(Color.WHITE);
        add(oth);
        
        ButtonGroup maritalgroup=new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        maritalgroup.add(oth);
        
        
        JLabel address=new JLabel("Address:");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);
        
        addTextField=new JTextField();
        addTextField.setFont(new Font("Raleway",Font.BOLD,14));
        addTextField.setBounds(300,440,400,30);
        add(addTextField);
        
        JLabel city=new JLabel("City:");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);
        
        cityTextField=new JTextField();
        cityTextField.setFont(new Font("Raleway",Font.BOLD,14));
        cityTextField.setBounds(300,490,400,30);
        add(cityTextField);
        
        JLabel state=new JLabel("State:");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);
        
        stateTextField=new JTextField();
        stateTextField.setFont(new Font("Raleway",Font.BOLD,14));
        stateTextField.setBounds(300,540,400,30);
        add(stateTextField);
        
        JLabel pincode=new JLabel("Pin Code:");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
        pincodeTextField=new JTextField();
        pincodeTextField.setFont(new Font("Raleway",Font.BOLD,14));
        pincodeTextField.setBounds(300,590,400,30);
        add(pincodeTextField);
        
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
       String formno=" "+random;
       String name=nameTextField.getText();
       String fathername=fatherTextField.getText();
       String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
       String gender=null;
       if(male.isSelected())
       {
           gender="Male";
       }
       if(female.isSelected())
       {
           gender="Female";
       }
       if(ot.isSelected())
       {
           gender="Others";
       }
       
       String email=emailTextField.getText();
       String marital=null;
       
       if(married.isSelected())
       {
           marital="Married";
       }
       if(unmarried.isSelected())
       {
           marital="Unmarried";
       }
       if(oth.isSelected())
       {
           marital="Others";
       }
       String add=addTextField.getText();
       String city=cityTextField.getText();
       String state=stateTextField.getText();
       String pincode=pincodeTextField.getText();
       
       
        try {
            if(name.equals(" "))
             JOptionPane.showMessageDialog(null, "Name is Required");
            
            else
            {
                Conn c=new Conn();
                String query="insert into Signup values('"+formno+"','"+name+"','"+fathername+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+add+"','"+city+"','"+pincode+"','"+state+"')";
                c.s.executeUpdate(query);
                
                setVisible(false);
                new SignupTwo(formno).setVisible(true);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
       
       
    }
    
    public static void main(String[] args) {
        new SignupOne();
    }

  
}
