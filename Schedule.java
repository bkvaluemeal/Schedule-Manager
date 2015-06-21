import java.util.ArrayList;

/**
 * Schedule is a class that holds between 4 and 6 Classes. Checks to make sure
 * you are taking between 12-19 credits. Uses an ArrayList to hold classes.
 * 
 * @author Josh Cohen
 * @version 1.00
 */
public class Schedule
{
	ArrayList<Class> schedule;

	/**
	 * Initializes Schedule with an empty ArrayList of type Class
	 */
	public Schedule()
	{
		schedule = new ArrayList<Class>();
	}

	/**
	 * Adds a class to the current schedule
	 * 
	 * @param scheduledClass - the class to add
	 * @throws Exception
	 */
	public void addClass(Class scheduledClass) throws Exception
	{
		for(int i = 0; i < schedule.size(); i++)
		{
			if(schedule.get(i).getBeginningTime() == scheduledClass
					.getBeginningTime()
					&& schedule.get(i).getDay().equals(scheduledClass.getDay()))
			{
				throw new Exception();
			}
			else if(schedule.get(i).getEndingTime() == scheduledClass
					.getEndingTime()
					&& schedule.get(i).getDay().equals(scheduledClass.getDay()))
			{
				throw new Exception();
			}
			else
				schedule.add(scheduledClass);
		}
	}

	/**
	 * Removes a class from the current schedule
	 * 
	 * @param scheduledClass - the class to remove
	 */
	public void removeClass(Class scheduledClass)
	{
		schedule.remove(scheduledClass);
	}

	/**
	 * Checks if the classes provide a valid number of credits
	 * 
	 * @return true if 12 < total credits < 19
	 */
	public boolean checkValidNumberOfCredits()
	{
		int totalCredits = 0;

		for(int i = 0; i < schedule.size(); i++)
		{
			totalCredits += schedule.get(i).getCredits();
		}

		if(totalCredits < 12 || totalCredits > 19)
			return false;
		else
			return true;
	}

}
