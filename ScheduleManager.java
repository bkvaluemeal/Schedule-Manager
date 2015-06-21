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

	private static ScheduleManager gui;
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
			add.pack();
			center(add, gui);
		}
	}

	/**
	 * Centers a frame on the screen
	 * 
	 * @param frame - the frame to be centered
	 */
	public static void center(Window frame)
	{
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
		int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
		frame.setLocation(x, y);
	}

	/**
	 * Centers a frame relative to another
	 * 
	 * @param frame - the frame to be centered
	 * @param relative - the relative frame
	 */
	public static void center(Window frame, Window relative)
	{
		int x = relative.getX() + (relative.getWidth() / 2)
				- (frame.getWidth() / 2);
		int y = relative.getY() + (relative.getHeight() / 2)
				- (frame.getHeight() / 2);
		frame.setLocation(x, y);
	}

	public static void main(String args[])
	{
		gui = new ScheduleManager();
		gui.setDefaultCloseOperation(EXIT_ON_CLOSE);
		gui.setVisible(true);
		gui.setTitle("Schedule Manager");
		gui.setSize(400, 400);
		center(gui);
	}
}
