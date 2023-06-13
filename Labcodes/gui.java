import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class StudentResult {
// Function to write a student information in JFrame and storing it in a file
public static void StudentInfo()
{// Creating a new frame using JFrame
JFrame f = new JFrame("Student Result Form"); 
// Creating the labels
JLabel l1, l2, l3, l4, l5,l6,l7,l8,l9;
// Creating three text fields for student name, college mail ID and for Mobile No
JTextField t1, t2, t3,t4,t5,t6,t7;
// Creating two JComboboxes for Branch and for Section
JComboBox j1, j2;
// Creating two buttons
JButton b1, b2;
// Naming the labels and setting
// the bounds for the labels
l1 = new JLabel("Student Name:");
l1.setBounds(50, 50, 100, 30);
l2 = new JLabel("Branch:");
l2.setBounds(50, 100, 120, 30);
l3 = new JLabel("Div :");
l3.setBounds(400, 50, 50, 30);
l4 = new JLabel("Roll no:");
l4.setBounds(400, 100, 70, 30);
l5 = new JLabel(" MC:");
l5.setBounds(400, 150, 70, 30);
l6 = new JLabel("EMF:");
l6.setBounds(50, 150, 70, 30);
l7 = new JLabel("FJP:");
l7.setBounds(400, 200, 70, 30);
l8 = new JLabel("DC:");
l8.setBounds(50, 200, 70, 30);
l9 = new JLabel("DBMS:");
l9.setBounds(400, 250, 70, 30);
// Creating the textfields and
// setting the bounds for textfields
t1 = new JTextField();
t1.setBounds(150, 50, 130, 30);
t2 = new JTextField();
t2.setBounds(450, 100, 130, 30);
t3 = new JTextField();
t3.setBounds(450, 150, 130, 30);
t4 = new JTextField();
t4.setBounds(100, 150, 130, 30);
t5 = new JTextField();
t5.setBounds(450, 200, 130, 30);
t6 = new JTextField();
t6.setBounds(100, 200, 130, 30);
t7 = new JTextField();
t7.setBounds(450, 250, 130, 30);
// Creating two string arrays one for
// braches and other for sections
String s1[ ]
= { " ", "CSE", "ECE", "EEE",
"CIVIL", "MECH", "Others" };
String s2[ ]
= { " ", "Div-A", "Div-B", "Div-C"};
// Creating two JComboBoxes for selecting branch and other for selecting the section
// and setting the bounds
j1 = new JComboBox(s1);
j1.setBounds(100, 100, 100, 30);
j2 = new JComboBox(s2);
j2.setBounds(470, 50, 140, 30);
// Creating one button for Saving and other button to close
// and setting the bounds
b1 = new JButton("Save");
b1.setBounds(150, 300, 70, 30);
b2 = new JButton("Close");
b2.setBounds(420, 300, 70, 30);
// Adding action listener
b1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e)
{
// Getting the text from text fields
// and JComboboxes
// and copying it to a strings
String s1 = t1.getText();
String s2 = t2.getText();
String s3 = j1.getSelectedItem() + "";
String s4 = j2.getSelectedItem() + "";
String s5 = t3.getText();
String s6 = t4.getText();
String s7 = t5.getText();
String s8 = t6.getText();
String s9 = t7.getText();
String res="";
if (e.getSource() == b1) {
res=res+"Name is: "+ s1 + " | ";
res=res+ "Roll no is:"+s2 + " | ";
res=res+"Branch is:"+ s3 + " | ";
res=res+"Division is:"+ s4 + " | ";
res=res+"Marks of MC is:"+s5 + " | ";
res=res+"Marks of EMF is:"+s6 + " | ";
res=res+"Marks of DC is:"+s7 + " | ";
res=res+"Marks of FJP is:"+s8 + " | ";
res=res+"Marks of DBMS is:"+s9 + " | ";
// Shows a Pop up Message when save button is clicked
JOptionPane.showMessageDialog(f,"Successfully Saved,:)");
f.dispose();
new ResultForm(res);
}
}
});
// Action listener to close the form
b2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e)
{
f.dispose();
}
});
// Default method for closing the frame
f.addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent e)
{
System.exit(0);
}
});
// Adding the created objects
// to the frame
f.add(l1);
f.add(t1);
f.add(l2);
f.add(t2);
f.add(l3);
f.add(j1);
f.add(l4);
f.add(j2);
f.add(l5);
f.add(t3);
f.add(l6);
f.add(t4);
f.add(l7);
f.add(t5);
f.add(l8);
f.add(t6);
f.add(l9);
f.add(t7);
f.add(b1);
f.add(b2);
f.setLayout(null);
f.setSize(3000, 3000);
f.setVisible(true);
}
// Driver code
public static void main(String args[])
{
StudentInfo();
}
}
class ResultForm extends JFrame {
public ResultForm(String res){
super("Result Form");
Label l1=new Label(res);
add(l1);
setSize(3000,3000);
setVisible(true);
}
}