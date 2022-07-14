public class NonAcademicCourse extends Course{  // course class is inherited by NonAcademicCourse
    private String instructorName;    //private variable declared for encapsulation concept 
    private int duration;
    private String startDate;
    private String completionDate;
    private String examDate;
    private String prerequisite;
    private boolean isRegistered;
    private boolean isRemoved;
    
    public NonAcademicCourse(String courseID, String courseName, int duration, String prerequisite){
        super(courseID,courseName,duration);   //calls constructor from parent class
        this.prerequisite=prerequisite;
        startDate="";
        completionDate="";
        examDate="";
        isRegistered=false;
        isRemoved=false;
    }
    
    //the get method return the variable value
    public String getInstructorName(){
        return instructorName;
    }
    public int getDuration(){
        return duration;
    }
    public String getStartDate(){
        return startDate;
    }
    public String getCompletionDate(){
        return completionDate;
    }
    public String getExamDate(){
        return examDate;
    }
    public String getPrerequisite(){
        return prerequisite;
    }
    public boolean getIsRegistered(){
        return isRegistered;
    }
    public boolean getIsRemoved(){
        return isRemoved;
    }
    
    //the set method sets the variable value
    public void setTheinstructorName(String instructorName){
       if(isRegistered == false){
         this.instructorName=instructorName; 
        }
        else{
        System.out.println("It is not possible to change the instructor name");
        }
    }
    
    public void register(String courseLeader, String instructorName, String startDate, String completionDate, String examDate){
        if(isRegistered == false){
        setTheinstructorName(instructorName);
        super.setCourseLeader(courseLeader);
        this.startDate= startDate;
        this.completionDate= completionDate;
        this.examDate= examDate;
        isRegistered=true;
    }
        else{
             System.out.println("course is already registered");   
            }
        }
        
    public void remove(){
        if(isRemoved == true){
        System.out.println("the course is already removed");    
        }
        else{
        super.setCourseLeader("");
        instructorName="";
        startDate="";
        completionDate="";
        examDate="";
        isRegistered=false;
        isRemoved=true;
        }
        }
        
    public void display(){
    super.display();     //a call to parent class method is call here
    if(isRegistered == true){
     System.out.println("Name of instructor is "+instructorName);
     System.out.println("Starting date of the course is "+startDate);
     System.out.println("Completion date of the course is "+completionDate);
     System.out.println("Exam date of the course is "+examDate);
    }
    }
    }
