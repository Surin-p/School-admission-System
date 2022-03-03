
/**
 * class NonAcademicCourse is one of child class of course class which is parent class
 *
 * @author (Prakriti Poudel)
 * @version (2021/05/10)
 */
public class NonAcademicCourse extends Course
{   
    //declaring instance variables
    private String instructor_name;
    private int duration;
    private String startDate;
    private String completionDate;
    private String examDate;
    private String prerequisite;
    private boolean isRegistered;
    private boolean isRemoved;
    /**
     * the constructor accepts four parameters and value are
     * assigning respectively,
     */
    public NonAcademicCourse(String courseID, String courseName, int duration, String prerequisite)
    {  
        //calling of constructor from parent class
        super(courseID,courseName,duration);
        this.prerequisite = prerequisite;
        //assigning constructor with respective values
        this.startDate = "";
        this.completionDate = "";
        this.examDate = "";
        this.isRegistered = false;
        this.isRemoved = false;
        
    }
    //accessor method
    public String getinstructor_name()
    {
        return instructor_name;
    }
    
    public int getduration()
    {
        return duration;
    }
    
    public String getstartDate()
    {
        return startDate;
    }
    
      public String getcompletionDate()
    {
        return completionDate;
    }
    
      public String getexamDate()
    {
        return examDate;
    }
    
      public String getprerequisite()
    {
        return prerequisite;
    }
    
    public boolean getisRegistered()
    {
        return isRegistered;
    }
    
    public boolean getisRemoved()
    {
        return isRemoved;
    }
    
    //setter method
    public void setinstructor_name(String instructor_name)
    { if (this.isRegistered == false) {
        
            this.instructor_name = instructor_name;
            System.out.println("Instructor name is changed");
      }
      else {
        
            System.out.println("Instructor name can not be changed as it is already registered");
      }
        
    }
    
    public void register(String courseLeader, String instructor_name, String startDate, String completionDate, String examDate)
    {
        if (this.isRegistered == false){
        
            setinstructor_name(instructor_name);
            this.isRegistered = true;
        }
        else{
        
           System.out.println("Thank you but this course is already registered");
        }
    }
    
    public void remove()
    {
        if(this.isRemoved == true) {
        
            System.out.println("Sorry! this course has been already removed");
        }
        else {
        
            super.setcourseleader("");
            this.instructor_name = "";
            this.startDate = "";
            this.completionDate = "";
            this.examDate = "";
            this.isRegistered = false;
            this.isRemoved = true;
            
        }
        
        
    }
    
    public void display()
    {
        //calling method for signature as display in parent class
        super.display();
        if(this.isRegistered == true) {
        
            System.out.println("Instructor name is " + instructor_name);
            System.out.println("Starting date is " + startDate);
            System.out.println("Completion date is " + completionDate);
            System.out.println("Exam date is " + examDate);
        }

    }
}
