import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class ScheduleManager extends JFrame
{
	/**
	 * The unique identifier for this class
	 */
	private static final long serialVersionUID = 2843240896822711069L;
	private JButton addClass;
	static JLabel classOne = new JLabel();
	static JLabel classTwo = new JLabel();
	static JLabel classThree = new JLabel();
	static JLabel classFour = new JLabel();
	static JLabel classFive = new JLabel();
	static JLabel classSix = new JLabel();
	static JLabel classSeven = new JLabel();

	private addClassGUI add;

	public ScheduleManager()
	{
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();

		addClass = new JButton("Add Class");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		add(addClass, c);

		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 1;
		c.weighty = .3;
		classOne.setText("Class One: ");
		add(classOne, c);

		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 2;
		c.weighty = .3;
		classTwo.setText("Class Two: ");
		add(classTwo, c);

		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 3;
		c.weighty = .3;
		classThree.setText("Class Three: ");
		add(classThree, c);

		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 4;
		c.weighty = .3;
		classFour.setText("Class Four: ");
		add(classFour, c);

		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 5;
		c.weighty = .3;
		classFive.setText("Class Five: ");
		add(classFive, c);

		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 6;
		c.weighty = .3;
		classSix.setText("Class Six: ");
		add(classSix, c);

		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 7;
		c.weighty = .3;
		classSeven.setText("Class Seven: ");
		add(classSeven, c);

		event a = new event();
		addClass.addActionListener(a);
	}

	public class event implements ActionListener
	{
		public void actionPerformed(ActionEvent a)
		{
			add = new addClassGUI();
			add.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			add.setVisible(true);
			add.setTitle("Add");
			add.setLocationRelativeTo(null);
			add.pack();
		}
	}

	public static void main(String args[])
	{
		ScheduleManager gui = new ScheduleManager();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setVisible(true);
		gui.setTitle("Schedule Manager");
		gui.setSize(400, 400);

	}
}
