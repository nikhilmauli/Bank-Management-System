package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PinChange extends JFrame implements ActionListener{
    
    JPasswordField pin,repin;
    JButton change,back;
    String pinnumber;

    public PinChange(String pinnumber) {
        setLayout(null);
        this.pinnumber=pinnumber;
       
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text=new JLabel("Change Your Pin");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        text.setBounds(250,300,400,35);
        image.add(text);
        
        JLabel pintext=new JLabel("New Pin");
        pintext.setForeground(Color.WHITE);
        pintext.setFont(new Font("Raleway",Font.BOLD,16));
        pintext.setBounds(165,370,180,25);
        image.add(pintext);
        
        pin=new JPasswordField();
        pin.setFont(new Font("Raleway",Font.BOLD,25));
        pin.setBounds(330,370,180,25);
        image.add(pin);
        
        JLabel repintext=new JLabel("Re-Enter new Pin");
        repintext.setForeground(Color.WHITE);
        repintext.setFont(new Font("Raleway",Font.BOLD,16));
        repintext.setBounds(165,420,180,25);
        image.add(repintext);
        
        repin=new JPasswordField();
        repin.setFont(new Font("Raleway",Font.BOLD,25));
        repin.setBounds(330,420,180,25);
        image.add(repin);
        
        change=new JButton("Change");
        change.setBounds(365,470,150,30);
        change.addActionListener(this);
        image.add(change);
        
        back=new JButton("Back");
        back.setBounds(365,520,150,30);
        back.addActionListener(this);
        image.add(back);
        
       
        setSize(900,900);
        setLocation(300,0);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==change){
            
             try {
            String npin=pin.getText();
            String rpin=repin.getText();
            
            if(!npin.equals(rpin))
            {
                JOptionPane.showMessageDialog(null, "Entered Pin does not match");
                return;
            }
            if(npin.equals("")){
                JOptionPane.showMessageDialog(null, "Please Enter pin");
                return;
            }
            if(rpin.equals("")){
                JOptionPane.showMessageDialog(null, "Please Re-Enter New Pin");
                return;
            }
            
                 Conn con =new Conn();
                 String qry1="Update bank set pin='"+rpin+"',where pin='"+pinnumber+"'";
                  String qry2="Update login set pin='"+rpin+"',where pin='"+pinnumber+"'";
                   String qry3="Update signupthree set pin='"+rpin+"',where pin='"+pinnumber+"'";
                   
                   con.s.executeUpdate(qry1);
                   con.s.executeUpdate(qry2);
                   con.s.executeUpdate(qry3);
                   
                   JOptionPane.showMessageDialog(null, "Pin Changed Successfully");
                   setVisible(false);
                   new Transactions(rpin).setVisible(true);
                   
            } catch (Exception e) {   
            System.out.println(e);
            }
                    
        }else{
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
      
    
    }
    public static void main(String[] args) {
        new PinChange("");
}
}
