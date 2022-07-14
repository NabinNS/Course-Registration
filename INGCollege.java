import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class INGCollege implements ActionListener
{
    private JFrame j;   //instance Jframe
    private JPanel p,p1;    //instance JPanel
    private JLabel title1,courseID1,duration1,assessment1,coursename1,instructorname1,level1,courseleader1,credit1,startdate1,completiondate1,title2,courseID2,duration2,examdate2,coursename2,instructorname2,
    startdate2,courseleader2,completiondate2,pre2;      //instance JLabels
    
    private JButton btnadd1,btnregister1,btndisplay1,btnclear1,btn1,btnadd2,btnregister2,btndisplay2,btnclear2,btnremove2,btn2; //instance JButton
    
    private JTextField courseID1TF,duration1TF,assessment1TF,coursename1TF,instructorname1TF,level1TF,courseleader1TF,credit1TF,startdate1TF,completiondate1TF,courseID2TF,duration2TF,examdate2TF,coursename2TF,
    instructorname2TF,startdate2TF,courseleader2TF,completiondate2TF,pre2TF;    //instance JTextField
    
    private String CourseID,CourseName,duration,level,credit,assessment,prerequisite,courseLeader,instructorname,startDate,completionDate,examDate,instructorName;
    private int Duration, Credit,Assessment;
    
    AcademicCourse obj_academic;    //obj for AcademicCourse
    NonAcademicCourse obj_nonacademic;  //obj for NonAcademicCourse
    
    ArrayList <Course> al = new ArrayList<>(); //creating arraylist with course generics
    
    INGCollege(){
        j = new JFrame("Course Registration");
        p = new JPanel();   //panel for Academic Course
        p1 = new JPanel();  //panel for NonAcademicCourse
        // Labels For Academic Course
        title1 = new JLabel("Academic Course", JLabel.CENTER);
        title1.setFont(new Font("Arial",Font.BOLD,20));
        title1.setBounds(270,20,250,50);
        title1.setForeground(Color.blue);
        
        courseID1 = new JLabel("CourseID: ");   //sets JLabel
        courseID1.setBounds(30,90,80,50);       //positioning JLabel
        courseID1TF= new JTextField();          //adding TextField
        courseID1TF.setBounds(150,100,170,30);  //positing JTextField
        
        duration1 = new JLabel("Duration: ");
        duration1.setBounds(30,150,80,50);
        duration1TF = new JTextField();
        duration1TF.setBounds(150,160,170,30);
        
        assessment1 = new JLabel("No of Assessment:");
        assessment1.setBounds(420,150,120,50);
        assessment1TF = new JTextField();
        assessment1TF.setBounds(560,160,170,30);
        
        coursename1 = new JLabel("Course Name: ");
        coursename1.setBounds(420,90,100,50);
        coursename1TF = new JTextField();
        coursename1TF.setBounds(560,100,170,30);
 
        instructorname1 = new JLabel("lecturer Name: ");
        instructorname1.setBounds(30,210,100,50);
        instructorname1TF = new JTextField();
        instructorname1TF.setBounds(150,220,170,30);
        
        level1 = new JLabel("Level:");
        level1.setBounds(30,270,100,50);
        level1TF = new JTextField();
        level1TF.setBounds(150,280,170,30);
        
        courseleader1 = new JLabel("Course Leader:");
        courseleader1.setBounds(420,210,100,50);
        courseleader1TF = new JTextField();
        courseleader1TF.setBounds(560,220,170,30);
        
        credit1 = new JLabel("Credit:");
        credit1.setBounds(420,270,100,50);
        credit1TF = new JTextField();
        credit1TF.setBounds(560,280,170,30);
        
        startdate1 = new JLabel("Start Date:");
        startdate1.setBounds(30,330,100,50);
        startdate1TF = new JTextField();
        startdate1TF.setBounds(150,340,170,30);
        
        completiondate1 = new JLabel("Completion Date:");
        completiondate1.setBounds(420,330,100,50);
        completiondate1TF = new JTextField();
        completiondate1TF.setBounds(560,340,170,30);
            
        btnadd1 = new JButton("Add");
        btnadd1.setBounds(230,420,170,30);
        
        btnregister1 = new JButton("Register");
        btnregister1.setBounds(430,420,170,30);
        
        btndisplay1 = new JButton("Display");
        btndisplay1.setBounds(230,470,170,30);
        
        btnclear1 = new JButton("Clear");
        btnclear1.setBounds(430,470,170,30);
        
        btn1 = new JButton("GO TO NON ACADEMIC COURSE");
        btn1.setBounds(270,520,280,30);
        
        //Labels for Non Academic Course
        title2 = new JLabel("Non Academic Course", JLabel.CENTER);
        title2.setFont(new Font("Arial",Font.BOLD,20));
        title2.setBounds(270,20,250,50);
        title2.setForeground(Color.red);
        
        courseID2 = new JLabel("CourseID: ");
        courseID2.setBounds(30,90,80,50);
        courseID2TF = new JTextField();
        courseID2TF.setBounds(150,100,170,30);
        
        duration2 = new JLabel("Duration: ");
        duration2.setBounds(30,150,80,50);
        duration2TF = new JTextField();
        duration2TF.setBounds(150,160,170,30);
        
        examdate2 = new JLabel("Exam Date:");
        examdate2.setBounds(420,150,120,50);
        examdate2TF = new JTextField();
        examdate2TF.setBounds(560,160,170,30);
        
        coursename2 = new JLabel("Course Name: ");
        coursename2.setBounds(420,90,100,50);
        coursename2TF = new JTextField();
        coursename2TF.setBounds(560,100,170,30);
 
        instructorname2 = new JLabel("Instructor Name: ");
        instructorname2.setBounds(30,210,100,50);
        instructorname2TF = new JTextField();
        instructorname2TF.setBounds(150,220,170,30);
        
        startdate2 = new JLabel("Start Date:");
        startdate2.setBounds(30,270,100,50);
        startdate2TF = new JTextField();
        startdate2TF.setBounds(150,280,170,30);
        
        courseleader2 = new JLabel("Course Leader:");
        courseleader2.setBounds(420,210,100,50);
        courseleader2TF = new JTextField();
        courseleader2TF.setBounds(560,220,170,30);
        
        completiondate2 = new JLabel("Completion Date:");
        completiondate2.setBounds(420,270,100,50);
        completiondate2TF = new JTextField();
        completiondate2TF.setBounds(560,280,170,30);
        
        pre2 = new JLabel("Pre-requisite:");
        pre2.setBounds(30,330,100,50);
        pre2TF = new JTextField();
        pre2TF.setBounds(150,340,170,30);
         
        btnadd2 = new JButton("Add");
        btnadd2.setBounds(140,400,170,30);
        
        btnregister2 = new JButton("Register");
        btnregister2.setBounds(330,400,170,30);
        
        btndisplay2 = new JButton("Display");
        btndisplay2.setBounds(520,400,170,30);
        
        btnclear2 = new JButton("Clear");
        btnclear2.setBounds(430,450,170,30);
        
        btnremove2 = new JButton("Remove");
        btnremove2.setBounds(230,450,170,30);
        
        btn2 = new JButton("GO TO ACADEMIC COURSE");
        btn2.setBounds(280,500,280,30);
        
        //setting up JFrame and JPanel
        j.add(p);   //adding panel to frame
        j.add(p1);  //adding panel to frame
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setBounds(0,0,800,600);
        j.setLayout(null);  //relative positioning
        j.setVisible(true);
        j.setResizable(false);
        p.setBounds(0,0,800,600);
        p.setLayout(null);
        p.setVisible(true);
        p1.setVisible(false);
        p1.setLayout(null);
        p1.setBounds(0,0,800,600);
        
        // Adding JLabel, JTextField and JButton to panel1
        p.add(title1);
        p.add(courseID1);
        p.add(courseID1TF);
        p.add(duration1);
        p.add(duration1TF);
        p.add(assessment1);
        p.add(assessment1TF);
        p.add(coursename1);
        p.add(coursename1TF);
        p.add(instructorname1);
        p.add(instructorname1TF);
        p.add(level1);
        p.add(level1TF);
        p.add(courseleader1);
        p.add(courseleader1TF);
        p.add(credit1);
        p.add(credit1TF);
        p.add(startdate1);
        p.add(startdate1TF);
        p.add(completiondate1);
        p.add(completiondate1TF);
        p.add(btnadd1);
        p.add(btnregister1);
        p.add(btndisplay1);
        p.add(btnclear1);
        p.add(btn1);
        //Adding JLabel, JTextField and JButton to panel2
        p1.add(title2);
        p1.add(courseID2);   
        p1.add(courseID2TF);  
        p1.add(duration2);  
        p1.add(duration2TF);  
        p1.add(examdate2);  
        p1.add(examdate2TF);  
        p1.add(coursename2);  
        p1.add(coursename2TF);  
        p1.add(instructorname2);  
        p1.add(instructorname2TF);  
        p1.add(startdate2);  
        p1.add(startdate2TF);  
        p1.add(courseleader2);  
        p1.add(courseleader2TF);  
        p1.add(completiondate2);  
        p1.add(completiondate2TF);  
        p1.add(pre2);  
        p1.add(pre2TF);   
        p1.add(btnadd2);
        p1.add(btnregister2);
        p1.add(btndisplay2);
        p1.add(btnclear2);
        p1.add(btnremove2);
        p1.add(btn2);
        
        //adding actionListener to the buttons
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btnadd1.addActionListener(this);
        btnadd2.addActionListener(this);
        btnregister1.addActionListener(this);
        btnregister2.addActionListener(this);
        btndisplay1.addActionListener(this);
        btndisplay2.addActionListener(this);
        btnremove2.addActionListener(this);
        btnclear1.addActionListener(this);
        btnclear2.addActionListener(this);
       
    }
    public void actionPerformed(ActionEvent e)  //creating obj of ActionEvent inside parameter
    {
        if(e.getSource()==btn1){    //swapping between AcademicCourse and NonAcademicCourse
            p.setVisible(false);
            p1.setVisible(true);
        }
        else if(e.getSource()==btn2){
            p1.setVisible(false);
            p.setVisible(true);
        } 
    
        else if(e.getSource()==btnadd1){
                try     // exception handling
                {   //storing value in variables insert into JTextField with the help from getText method
                 CourseID = courseID1TF.getText();  
                 CourseName = coursename1TF.getText();
                 duration = duration1TF.getText();
                 Duration = Integer.parseInt(duration);
                 level = level1TF.getText();
                 credit = credit1TF.getText();
                 Credit= Integer.parseInt(credit);
                 assessment = assessment1TF.getText();
                 Assessment = Integer.parseInt(assessment);
                 boolean CS = false;
                 
                for(Course c:al)    //iterating through arraylist
                {
                    if (c.getCourseID().equals(CourseID))
                    {
                        CS = true;
                        JOptionPane.showMessageDialog(j,"This courseid "+ CourseID + " exists \n Please check it","Error",JOptionPane.ERROR_MESSAGE);   //a dialog box appears
                        break;
                    }
                }
                if(CS == false)
                {
                    if(CourseID.equals("") || CourseName.equals("")){   //checks if the textfield is empty or not
                            JOptionPane.showMessageDialog(j," Please fill all the data","Error",JOptionPane.ERROR_MESSAGE);
                        }
                    else{
                    obj_academic = new AcademicCourse(CourseID,CourseName,Duration,level,credit,Assessment);
                    al.add(obj_academic);
                    JOptionPane.showMessageDialog(j,"The Academic Course has been sucessfully added"+"\n courseID is:"+ CourseID +"\n CourseName is: "+CourseName);
                    }
                }
            }
            catch(NumberFormatException A)  //handles number format exception
            {
                 JOptionPane.showMessageDialog(j," Please fill the form properly!!","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        else if(e.getSource()==btnadd2){
             
                try
                {
                CourseID = courseID2TF.getText();
                CourseName= coursename2TF.getText();
                Duration = Integer.parseInt(duration2TF.getText());
                prerequisite = pre2TF.getText();
                boolean CS = false;
                for (Course C:al)
                {
                    if(C.getCourseID().equals(CourseID))
                    {
                        CS = true;
                        JOptionPane.showMessageDialog(j,"This courseid "+ CourseID + " exists \n Please check it","Error",JOptionPane.ERROR_MESSAGE);
                        break;
                    }
                }
                if(CS==false)
                {
                    if(CourseID.equals("") || CourseName.equals("")){
                            JOptionPane.showMessageDialog(j," Please fill all the data","Error",JOptionPane.ERROR_MESSAGE);
                        }
                        else{
                    obj_nonacademic = new NonAcademicCourse(CourseID,CourseName,Duration,prerequisite);
                    al.add(obj_nonacademic);
                    JOptionPane.showMessageDialog(j,"The Non Academic Course has been sucessfully added"+"\n courseID is:"+ CourseID +"\n CourseName is: "+CourseName);
                }
                }  
            }
            catch(NumberFormatException A)
            {
               JOptionPane.showMessageDialog(j," Please fill the form properly!!","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        else if(e.getSource()==btnregister1)
        {
            try{
              CourseID = courseID1TF.getText();
              courseLeader = courseleader1TF.getText();
              instructorName = instructorname1TF.getText();
              startDate = startdate1TF.getText();
              completionDate = completiondate1TF.getText();
              boolean CS =false;
              
              for(Course C:al)
              {
                  if(C.getCourseID().equals(CourseID)){
                      CS = true;
                      //downcasting
                      if(C instanceof AcademicCourse)   //gives result in boolean value
                      {
                         AcademicCourse obj_academic = (AcademicCourse)C;
                         if(obj_academic.getIsRegistered()== true)
                         {
                         JOptionPane.showMessageDialog(j,"The course "+ CourseID + " is already registered \n Please check it","Error",JOptionPane.ERROR_MESSAGE);
                         }
                         else
                         {
                             obj_academic.register(courseLeader,instructorName,startDate,completionDate);
                             JOptionPane.showMessageDialog(j,"The Academic Course has been sucessfully registered"+"\n courseID is:"+ CourseID +"\n Course Leader is: "+courseLeader+ 
                             "\n instructor name is: "+instructorName + "\n Start Date is: "+startDate+ "\n Completion Date is:" +completionDate);
                         }
                    } 
                  }
              }
              if(CS == false){
                  JOptionPane.showMessageDialog(j,"couldn't find the course "+ CourseID +"\n please check id","Error",JOptionPane.ERROR_MESSAGE);
              }
            }
            catch(NumberFormatException A)
            {
                JOptionPane.showMessageDialog(j,"Please,Enter data correctly","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        else if(e.getSource()==btnregister2)
        {
            try
            {
                String CourseID = courseID2TF.getText();
                String courseLeader= courseleader2TF.getText();
                String instructorName = instructorname2TF.getText();
                String startDate = startdate2TF.getText();
                String completionDate = completiondate2TF.getText();
                String examDate = examdate2TF.getText();
                boolean CS = false;
                for (Course C:al)
                {
                    if(C.getCourseID().equals(CourseID))
                    {
                        CS = true;
                        if(C instanceof NonAcademicCourse)
                        {
                            obj_nonacademic =(NonAcademicCourse)C;
                            if(obj_nonacademic.getIsRegistered()==true){
                                JOptionPane.showMessageDialog(j,"The course "+ CourseID + " is already registered \n Please check it","Error",JOptionPane.ERROR_MESSAGE);
                            }
                            else{
                                obj_nonacademic.register(courseLeader,instructorName,startDate,completionDate,examDate);
                                JOptionPane.showMessageDialog(j,"The Non Academic Course has been sucessfully registered"+"\n courseID is:"+ CourseID +"\n Course Leader is: "+courseLeader+ 
                                 "\n instructor name is: "+instructorName + "\n Start Date is: "+startDate+ "\n Completion Date is:" +completionDate+ "\n Exam Date is: "+examDate);
                            }
                        }
                    }
                }
                if(CS ==false){
                    JOptionPane.showMessageDialog(j,"couldn't find the course "+ CourseID +"\n please check id","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
            catch(NumberFormatException A)
            {
                  JOptionPane.showMessageDialog(j,"Please,Enter data correctly","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        else if(e.getSource()==btnremove2)
        {
            try{
                CourseID = courseID2TF.getText();
                boolean exist = false;
                for (Course C :al)
                {
                    if(C.getCourseID().equals(CourseID))
                    {
                        exist=true;
                        if (C instanceof NonAcademicCourse){
                            obj_nonacademic =(NonAcademicCourse)C;
                            if(obj_nonacademic.getIsRemoved()==false){
                                obj_nonacademic.remove();
                                JOptionPane.showMessageDialog(j,"The course "+ CourseID + " is sucessfully removed");
                            }
                            else if(obj_nonacademic.getIsRemoved()==true){
                                JOptionPane.showMessageDialog(j,"The course "+ CourseID + " is already removed");
                            }
                        }
                    }
                    else{
                        exist = false;
                    }
                }
                if(exist == false){
                    JOptionPane.showMessageDialog(j,"couldn't find the course "+ CourseID + "\n please check id","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
            catch(Exception A){
                 JOptionPane.showMessageDialog(j,"Please,Enter data correctly","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        else if(e.getSource()==btndisplay1)
        {
            for(Course C :al){
                if(C instanceof AcademicCourse)
                {
                    System.out.println("*********************Academic Course**************************");
                    obj_academic =(AcademicCourse)C;
                    obj_academic.display();
                }
            }
        }
        else if(e.getSource()==btndisplay2)
        {
            for (Course C:al)
            {
                if (C instanceof NonAcademicCourse)
                {
                    System.out.println("*********************Non Academic Course**************************");
                    obj_nonacademic = (NonAcademicCourse)C;
                    obj_nonacademic.display();
                }
            }
        }
        else if(e.getSource()==btnclear1)   //clears textfield in GUI when button is clicked
        {
            courseID1TF.setText("");
            coursename1TF.setText("");
            duration1TF.setText("");
            assessment1TF.setText("");
            instructorname1TF.setText("");
            courseleader1TF.setText("");
            level1TF.setText("");
            credit1TF.setText("");
            startdate1TF.setText("");
            completiondate1TF.setText("");
        }
        else if(e.getSource()==btnclear2)
        {
            courseID2TF.setText("");
            coursename2TF.setText("");
            duration2TF.setText("");
            examdate2TF.setText("");
            instructorname2TF.setText("");
            courseleader2TF.setText("");
            startdate2TF.setText("");
            completiondate2TF.setText("");
            pre2TF.setText("");
        }
    }
    public static void  main(String []args) //main method
    {
      new INGCollege();     //calling obj of INGCollege
    }
}