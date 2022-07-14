/*extends keyword indicates that new class is derived from the superclass using inheritance 
 * inherits every attributes and methods of superclass*/
 
public class AcademicCourse extends Course{ 
    private String lecturerName;
    private String level;
    private String credit;
    private String startingDate;
    private String completionDate;
    private int number_of_Assessments;
    private boolean isRegistered;
    
    public AcademicCourse(String courseID, String courseName, int duration, String level, String credit,int number_of_Assessments){
        super(courseID, courseName, duration);  //calls parent class constructor
        this.level= level;
        this.credit= credit;
        this.number_of_Assessments= number_of_Assessments;
        lecturerName="";
        startingDate= "";
        completionDate="";
        isRegistered=false;
    }
    
    //the get method return the variable value
    public String getLecturerName(){
     return lecturerName;   
    }
    public String getLevel(){
     return level;   
    }
    public String getCredit(){
     return credit;   
    }
    public String getStartingDate(){
        return startingDate;
    }
    public String getCompletionDate(){
        return completionDate;
    }
    public int getNumber_of_Assessments(){
        return number_of_Assessments;
    }
    public boolean getIsRegistered(){
     return isRegistered;   
    }
    
    //the set method sets the variable value
    public void setLecturerName(String lecturerName){
        this.lecturerName=lecturerName;
    }
    public void setNumber_of_Assessments(int number_of_Assessments){
         this.number_of_Assessments=number_of_Assessments;   
    }
    
    public void register(String courseLeader, String lecturerName, String startingDate, String completionDate){
          if(isRegistered==true){//checks if is registered have true or false value
            System.out.println("The academic course is registered ");
            System.out.println("Instructor Name= "+lecturerName);
            System.out.println("Starting Date= " +startingDate);
            System.out.println("Completion Date= "+completionDate);
            }
          else{   //prints below values if isregistered is false
              super.setCourseLeader(courseLeader);
              this.lecturerName=lecturerName;
              this.startingDate=startingDate;
              this.completionDate=completionDate;
              isRegistered=true;
            }
    }
    public void display(){ 
        
        super.display(); //a method is called from parent class
        
        if(isRegistered==true){  //checks if isregistered value and prints if it is true or else ignore this  lines
            System.out.println("lecturer name is "+lecturerName);
            System.out.println("level is "+level);
            System.out.println("credit is "+credit);
            System.out.println("starting date is "+startingDate);
            System.out.println("completion date is "+completionDate);
            System.out.println("number of assessments is "+number_of_Assessments);
        }   
    }
}
    
    