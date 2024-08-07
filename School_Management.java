import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Teacher extends JFrame{
     JButton classScheduleButton, studentListButton, attendanceButton;
     JButton assignmentsButton, messageButton, reportsButton;
     JTextArea displayArea;
     JLabel lt;
     JFrame f;
     JPanel p, p1;

     public Teacher(){

        //Button initialisation
        classScheduleButton = new JButton("Class Schedule");
        studentListButton = new JButton("Student List");
        attendanceButton = new JButton("Attendance");
        assignmentsButton = new JButton("Assignment");
        messageButton = new JButton("Message");
        reportsButton = new JButton("Reports");
        
        //label initialisation
        lt = new JLabel("Teacher Page");

        //text Area initialisation
        displayArea = new JTextArea();
        displayArea.setEditable(false);

        //frame initialisation
        f = new JFrame("School Management");

        //panel initialisation
        p = new JPanel();
        p1 = new JPanel();

        //Adding components to panel
        p.add(classScheduleButton);
        p.add(studentListButton);
        p.add(attendanceButton);
        p.add(assignmentsButton);
        p.add(messageButton);
        p.add(reportsButton);

        p1.add(p);
        p1.add(displayArea);

        //Adding features to label
        lt.setForeground(Color.CYAN);

        //Adding features to panel
        p.setMaximumSize(new Dimension(450, 450));
        p.setLayout(new GridLayout(6, 1));
        p1.setLayout(new FlowLayout());
        p1.setBackground(Color.GRAY);
        p1.setMaximumSize(new Dimension(400, 250));

        //Adding features to display area
        displayArea.setFont(new Font("Times New Roman", Font.PLAIN, 20));

        //Adding components and features to frame
        f.setLayout(new BoxLayout(f.getContentPane(), BoxLayout.Y_AXIS));
        f.getContentPane().setBackground(Color.DARK_GRAY);
        f.add(lt);
        f.add(p1);
       
        f.setSize(500, 500);
        f.setVisible(true);

        //Setting up responses for each button
        classScheduleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayArea.setText("Class Schedule will be displayed here.");
            }
        });

        studentListButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                displayArea.setText("List of students will be displayed here.");
            }
        });

        attendanceButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                displayArea.setText("Attendance of students will be displayed here.");
            }
        });

        assignmentsButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                displayArea.setText("Assignments will be displayed here.");
            }
        });

        messageButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                displayArea.setText("Messages will be displayed here.");
            }
        });

        reportsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                displayArea.setText("Reports of students will be displayed here.");
            }
        });
        
     }
}

class Parent extends JFrame{
    JButton behaviourButton, gradesButton, attendanceButton;
     JButton feepaymentButton, messagingButton, reportsButton;
     JTextArea displayArea;
     JLabel lp;
     JFrame f;
     JPanel p, p1;

     public Parent(){

        //Button initialisation
        behaviourButton = new JButton("Student Behaviour");
        gradesButton = new JButton("Student Grades");
        attendanceButton = new JButton("Student Attendance");
        feepaymentButton = new JButton("Fee payment");
        messagingButton = new JButton("Message");
        reportsButton = new JButton("Student Reports");

        //label initialisation
        lp = new JLabel("Parent Page");

         //text Area initialisation
         displayArea = new JTextArea();
         displayArea.setEditable(false);

         //frame initialisation
        f = new JFrame("School Management");

        //panel initialisation
        p = new JPanel();
        p1 = new JPanel();

        //Adding components to panel
        p.add(behaviourButton);
        p.add(gradesButton);
        p.add(attendanceButton);
        p.add(feepaymentButton);
        p.add(messagingButton);
        p.add(reportsButton);

        p1.add(p);
        p1.add(displayArea);


        //Adding features to label
        lp.setForeground(Color.CYAN);

        //Adding features to panel
        p.setMaximumSize(new Dimension(450, 450));
        p.setLayout(new GridLayout(6, 1));
        p1.setLayout(new FlowLayout());
        p1.setBackground(Color.GRAY);
        p1.setMaximumSize(new Dimension(400, 250));

        //Adding features to display area
       // displayArea.setMaximumSize(new Dimension(400, 150));
        displayArea.setFont(new Font("Times New Roman", Font.PLAIN, 20));

        //Adding components and features to frame
        f.setLayout(new BoxLayout(f.getContentPane(), BoxLayout.Y_AXIS));
        f.getContentPane().setBackground(Color.DARK_GRAY);
        f.add(lp);
        f.add(p1);
       
        f.setSize(500, 500);
        f.setVisible(true);

        //Setting up responses for each button
        behaviourButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayArea.setText("Details of student behaviour will appear here.");
            }
        });

        gradesButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                displayArea.setText("Grades of Student will appear here.");
            }
        });

        attendanceButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                displayArea.setText("Attendance of student will be displayed here.");
            }
        });

        feepaymentButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                displayArea.setText("Fee payment portal will appear here.");
            }
        });

        messagingButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                displayArea.setText("Messages will display here.");
            }
        });

        reportsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                displayArea.setText("Reports of student will be displayed here.");
            }
        });



     }
}

class Student extends JFrame{
    JButton scheduleButton, gradesButton, attendanceButton;
    JButton assignmentButton, messagingButton, reportsButton;
    JTextArea displayArea;
    JLabel ls;
    JFrame f;
    JPanel p, p1;

    public Student(){

       //Button initialisation
       scheduleButton = new JButton("Class Schedule");
       gradesButton = new JButton("Student Grades");
       attendanceButton = new JButton("Student Attendance");
       assignmentButton = new JButton("Assignment");
       messagingButton = new JButton("Message");
       reportsButton = new JButton("Student Reports");

       //label initialisation
       ls = new JLabel("StudentPage");

        //text Area initialisation
        displayArea = new JTextArea();
        displayArea.setEditable(false);

        //frame initialisation
       f = new JFrame("School Management");

       //panel initialisation
       p = new JPanel();
       p1 = new JPanel();

       //Adding components to panel
       p.add(scheduleButton);
       p.add(gradesButton);
       p.add(attendanceButton);
       p.add(assignmentButton);
       p.add(messagingButton);
       p.add(reportsButton);

       p1.add(p);
       p1.add(displayArea);


       //Adding features to label
       ls.setForeground(Color.CYAN);

       //Adding features to panel
       p.setMaximumSize(new Dimension(450, 450));
       p.setLayout(new GridLayout(6, 1));
       p1.setLayout(new FlowLayout());
       p1.setBackground(Color.GRAY);
       p1.setMaximumSize(new Dimension(400, 250));

       //Adding features to display area
      // displayArea.setMaximumSize(new Dimension(400, 150));
       displayArea.setFont(new Font("Times New Roman", Font.PLAIN, 20));

       //Adding components and features to frame
       f.setLayout(new BoxLayout(f.getContentPane(), BoxLayout.Y_AXIS));
       f.getContentPane().setBackground(Color.DARK_GRAY);
       f.add(ls);
       f.add(p1);
      
       f.setSize(500, 500);
       f.setVisible(true);

       //Setting up responses for each button
       scheduleButton.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               displayArea.setText("Schedule of classes will display here.");
           }
       });

       gradesButton.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               displayArea.setText("Grades of Student will appear here.");
           }
       });

       attendanceButton.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               displayArea.setText("Attendance of student will be displayed here.");
           }
       });

       assignmentButton.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               displayArea.setText("Assignments for students will be display here.");
           }
       });

       messagingButton.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e){
               displayArea.setText("Messages will display here.");
           }
       });

       reportsButton.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e){
               displayArea.setText("Reports of student will be displayed here.");
           }
       });
}
}

class Admin extends JFrame{
    JButton studentmButton, teachermButton, classmButton, eventButton;
     JTextArea displayArea;
     JLabel lt;
     JFrame f;
     JPanel p, p1;

     public Admin(){

        
        //Button initialisation
        studentmButton = new JButton("Student management");
        teachermButton = new JButton("Teacher management");
        classmButton = new JButton("Class management");
        eventButton = new JButton("Events");
       
        

        //label initialisation
        lt = new JLabel("Admin Page");

        //text Area initialisation
        displayArea = new JTextArea();
        displayArea.setEditable(false);

        //frame initialisation
        f = new JFrame("School Management");

        //panel initialisation
        p = new JPanel();
        p1 = new JPanel();

        //Adding components to panel
        p.add(studentmButton);
        p.add(teachermButton);
        p.add(classmButton);
        p.add(eventButton);

        p1.add(p);
        p1.add(displayArea);


        //Adding features to label
        lt.setForeground(Color.CYAN);

        //Adding features to panel
        p.setMaximumSize(new Dimension(450, 450));
        p.setLayout(new GridLayout(6, 1));
        p1.setLayout(new FlowLayout());
        p1.setBackground(Color.GRAY);
        p1.setMaximumSize(new Dimension(400, 250));

        //Adding features to display area
       // displayArea.setMaximumSize(new Dimension(400, 150));
        displayArea.setFont(new Font("Times New Roman", Font.PLAIN, 20));

        //Adding components and features to frame
        f.setLayout(new BoxLayout(f.getContentPane(), BoxLayout.Y_AXIS));
        f.getContentPane().setBackground(Color.DARK_GRAY);
        f.add(lt);
        f.add(p1);
       
        f.setSize(500, 500);
        f.setVisible(true);

        //Setting up responses for each button
        studentmButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayArea.setText("Student Management Portal will display here.");
            }
        });

        teachermButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                displayArea.setText("Teacher Management Portal will display here.");
            }
        });

        classmButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                displayArea.setText("Class Management Portal will display here.");
            }
        });

        eventButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                displayArea.setText("Information of all events will display here.");
            }
        });

    }
}

class Sign_Up extends JFrame{
    JFrame f;
    JTextField tf_schoolName, tf_Address, tf_urName, tf_email, tf_phone, tf_userName;
    JPasswordField pf, cf;
    JLabel lb, ln, la, lpf, lcf, lun, le, lp, lusern, lr;
    JPanel p1, p2, p3, p4,pmain, p5, p6, p7, p8, p9;
    JButton b;
    JComboBox<String> roleComboBox, classGradeComboBox;
    JCheckBox termsCheckBox;


    public Sign_Up(){
       f = new JFrame("School Management");
       //text fields initialisation
       tf_schoolName = new JTextField(30);
       tf_Address = new JTextField(30);
       tf_urName = new JTextField(30);
       tf_email = new JTextField(30);
       tf_phone = new JTextField(30);
       tf_userName = new JTextField(30);


       //Password Field initialisation
       pf = new JPasswordField(30);
       cf = new JPasswordField(30);


       //Labels initialisation
       lb = new JLabel("SIGN-UP PAGE");
       ln = new JLabel("School name");
       la = new JLabel("Address");
       lpf = new JLabel("Password");
       lcf = new JLabel("Confirm Password");
       lun = new JLabel("Your name");
       le = new JLabel("Email");
       lp = new JLabel("Phone");
       lusern = new JLabel("User Name");
       lr = new JLabel("Select Role");


       //Panel initialisation
       p1 = new JPanel();
       p2 = new JPanel();
       p3 = new JPanel();
       p4 = new JPanel();
       p5 = new JPanel();
       p6 = new JPanel();
       p7 = new JPanel();
       p8 = new JPanel();
       p9 = new JPanel();
       pmain = new JPanel();


       //Button initialisation
       b = new JButton("Submit");


       //Combobox initialisation
       String[] roles = {"Student", "Teacher", "Parent", "Administrator"};
       roleComboBox = new JComboBox<>(roles);


       //Checkbox initialisation
       termsCheckBox = new JCheckBox("I agree to all terms and conditions");
       
       //addition of components into panel
       p1.add(lun);
       p1.add(tf_urName);
       p2.add(le);
       p2.add(tf_email);
       p3.add(lp);
       p3.add(tf_phone);
       p4.add(lusern);
       p4.add(tf_userName);
       p5.add(lpf);
       p5.add(pf);
       p6.add(lcf);
       p6.add(cf);
       p7.add(ln);
       p7.add(tf_schoolName);
       p8.add(lr);
       p8.add(roleComboBox);
       p9.add(termsCheckBox);


       //Addition of panels into main panel
       pmain.add(p1);
       pmain.add(p2);
       pmain.add(p3);
       pmain.add(p4);
       pmain.add(p5);
       pmain.add(p6);
       pmain.add(p7);
       pmain.add(p8);
       pmain.add(p9);

       //Setting size of main panel  
       pmain.setMaximumSize(new Dimension(500,300));

       //Adding features to label sign-up
       lb.setForeground(Color.CYAN);

       //Adding features and components to frame
       f.add(lb);
       f.add(pmain, BorderLayout.CENTER);
       f.getContentPane().setBackground(Color.DARK_GRAY);
       f.setLayout(new BoxLayout(f.getContentPane(), BoxLayout.Y_AXIS));
       
       f.add(b);
       f.setSize(600, 500);
       f.setVisible(true);

       b.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            if(termsCheckBox.isSelected()){
                String rol = (String) roleComboBox.getSelectedItem();
                String password = new String(pf.getPassword());
                String confirmPassword = new String(cf.getPassword());

                if (!password.equals(confirmPassword)) {
                    JOptionPane.showMessageDialog(null, "Passwords do not match!");
                    return;
                }

                if(rol.equals("Teacher")){
                    Teacher t = new Teacher();
                    t.setVisible(true);
                }

                if(rol.equals("Parent")){
                    Parent p = new Parent();
                    p.setVisible(true);
                }

                if(rol.equals("Student")){
                    Student s = new Student();
                    s.setVisible(true);
                }

                if(rol.equals("Administrator")){
                    Admin s = new Admin();
                    s.setVisible(true);
                }

                JOptionPane.showMessageDialog(null, "Sign Up Successful!");
                    dispose(); 
                } else {
                    JOptionPane.showMessageDialog(null, "You must agree to the terms and conditions!");
                }
            }
        });
       };
       
    }

public class School_Management {
    public static void main(String[] args){

        Sign_Up sign = new Sign_Up();
        sign.setVisible(true);

    }
}
