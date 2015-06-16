/**
 * Class is a class to store values of Classes in
 * your schedule such as:
 * -Start Time
 * -End Time
 * -Name
 * -Professor
 * -Credits
 * @author Josh Cohen
 * @version 1.01
 */
public class Class 
{
    public String name;
    public String professor;
    public String beginningTime;
    public String endingTime;
    public int credits;
    public String day;
    
    /**
     * Initializes new Class with a given name, professor, beginning Time
     * and ending Time.
     * 
     * @param name name of Class
     * @param professor professor of Class
     * @param beginningTime start time of class
     * @param endingTime end time of class
     */
    public Class(String name, String professor, String beginningTime, 
            String endingTime, int credits, String day)
    {
        this.name = name;
        this.professor = professor;
        this.beginningTime = beginningTime;
        this.endingTime = endingTime;
        this.credits = credits;
        this.day = day;
    }
    
    /**
     * gets the day of the Class
     * @return day of the Class
     */
    public String getDay() 
    {
        return day;
    }

    /**
     * sets the day of the Class
     * @param day day to be set of the Class
     */
    public void setDay(String day) 
    {
        this.day = day;
    }

    /**
     * gets name of Class
     * @return name of the class
     */
    public String getName() 
    {
        return name;
    }

    /**
     * sets the name of the Class
     * @param name name of the Class
     */
    public void setName(String name) 
    {
        this.name = name;
    }

    /**
     * gets the professor of the Class
     * @return the professor of the Class
     */
    public String getProfessor() 
    {
        return professor;
    }

    /**
     * sets the Professor of the Class
     * @param professor professor of the Class
     */
    public void setProfessor(String professor) 
    {
        this.professor = professor;
    }

    /**
     * gets the start time of the Class
     * @return start time of the Class
     */
    public String getBeginningTime() 
    {
        return beginningTime;
    }

    /**
     * sets the start time of the Class
     * @param beginningTime start time of the Class
     */
    public void setBeginningTime(String beginningTime) 
    {
        this.beginningTime = beginningTime;
    }

    /**
     * gets the end time of the Class
     * @return the end time of the Class
     */
    public String getEndingTime() 
    {
        return endingTime;
    }

    /**
     * sets the end time of the Class
     * @param endingTime end time of the class
     */
    public void setEndingTime(String endingTime) 
    {
        this.endingTime = endingTime;
    }
    
    /**
     * get the number of credits in the Class
     * @return the number of credits
     */
    public int getCredits()
    {
        return credits;
    }
    
    /**
     * sets the number of credits for the Class
     * @param credits number of credits in the Class
     */
    public void setCredits(int credits)
    {
        this.credits = credits;
    }
    
}
