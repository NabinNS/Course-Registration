public class Course{   //Class definition
    
    private String courseID;       // private variable declared for encapsulation concept 
    private String courseName;
    private String courseLeader;
    private int duration;       
    
        public Course(String courseID, String courseName, int duration){ //constructor created to initialize the object of a class
        this.courseID = courseID;      //keyword this is use refer the instance variable
        this.courseName = courseName;
        this.duration = duration;
        courseLeader = "";
    } 
    
    /* the get and set method are created as the instance variable are set as private 
     * for security and
     * cannot accessed outside of the class*/
    // the get method return the variable value
        public String getCourseID(){
            return courseID;
    }
        public String getCourseName(){
             return courseName;   
    }
        public String getCourseLeader(){
             return courseLeader;   
    }
        public int getDuration(){
            return duration;
    }
    //the set method sets the variable value
        public void setCourseLeader(String courseLeader){
            this.courseLeader= courseLeader;
    }
    //display method is created to give output
    public void display(){
        System.out.println("ID of the course is: "+courseID);
        System.out.println("Name of the course is: "+courseName);
            if(courseLeader!=""){  //checks whether courseLeader is empty or not
        System.out.println("Leader of the course  is: "+courseLeader);
    }
        System.out.println("Duration of the course is: "+duration);
    }
}
