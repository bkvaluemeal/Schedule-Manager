import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class addClassGUI extends JDialog
{
	/**
	 * The unique identifier for this class
	 */
	private static final long serialVersionUID = 4628661968970659169L;
	JButton addClass = new JButton("Add Class");
	JLabel className = new JLabel("Class Name: ");
	JTextField classNameField = new JTextField(10);
	JLabel professor = new JLabel("Professor: ");
	JTextField professorField = new JTextField(10);
	JLabel startTime = new JLabel("Start Time: ");
	JTextField startTimeField = new JTextField(5);
	JLabel endTime = new JLabel("End Time: ");
	JTextField endTimeField = new JTextField(5);
	JLabel credits = new JLabel("# of Credits: ");
	JTextField creditsField = new JTextField(2);
	JLabel day = new JLabel("Day of Class: ");
	JTextField dayField = new JTextField(5);

	public String name, teacher, beginningTime, endingTime, creds, days;
	public int creditVal;
	public Class newClass;

	public addClassGUI()
	{
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();

		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 1;
		add(className, c);

		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 0;
		c.gridwidth = 3;
		add(classNameField, c);

		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 1;
		add(professor, c);

		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 1;
		c.gridwidth = 3;
		add(professorField, c);

		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 2;
		c.gridwidth = 1;
		add(startTime, c);

		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 2;
		c.gridwidth = 3;
		add(startTimeField, c);

		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 3;
		c.gridwidth = 1;
		add(endTime, c);

		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 3;
		c.gridwidth = 3;
		add(endTimeField, c);

		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 4;
		c.gridwidth = 1;
		add(credits, c);

		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 4;
		c.gridwidth = 3;
		add(creditsField, c);

		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 5;
		c.gridwidth = 1;
		add(day, c);

		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 5;
		c.gridwidth = 3;
		add(dayField, c);

		c.fill = GridBagConstraints.SOUTH;
		c.gridx = 1;
		c.gridy = 6;
		c.gridwidth = 1;
		add(addClass, c);

		event a = new event();
		addClass.addActionListener(a);
	}

	public class event implements ActionListener
	{
		public void actionPerformed(ActionEvent a)
		{

			name = classNameField.getText();
			teacher = professorField.getText();
			beginningTime = startTimeField.getText();
			endingTime = endTimeField.getText();
			creds = creditsField.getText();
			days = dayField.getText();
			creditVal = Integer.parseInt(creds);

			newClass = new Class(name, teacher, beginningTime, endingTime,
					creditVal, days);

			if(newClass.getBeginningTime().equals("8:00")
					|| newClass.getBeginningTime().equals("8"))
			{
				ScheduleManager.classOne.setText(newClass.toString());
			}
			else if(newClass.getBeginningTime().equals("7:00")
					|| newClass.getBeginningTime().equals("7"))
			{
				ScheduleManager.classSeven.setText(newClass.toString());
			}
			else
				ScheduleManager.classTwo.setText(newClass.toString());
			dispose();
		}
	}

	public static void main(String[] args)
	{
		addClassGUI gui = new addClassGUI();
		gui.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		gui.setVisible(true);
		gui.setTitle("Add");
		gui.pack();
	}
}
