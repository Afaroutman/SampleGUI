package GUI.view;

import javax.swing.*;

import GUI.controller.SampleController;


public class SamplePanel extends JPanel
{
	private SampleController baseController;
	private JButton scambleButton;
	private JButton sortButton;
	private JButton searchButton;
	private JTextField userField;
	private JTextArea displayArea;
	private JScrollPane displayPane;
	private SpringLayout baseLayout;
	
	public SamplePanel(SampleController baseController)
	{
		this.baseController = baseController;
	}
	
}
