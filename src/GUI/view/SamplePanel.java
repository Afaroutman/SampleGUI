package GUI.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

import GUI.controller.SampleController;


public class SamplePanel extends JPanel
{
	private SampleController baseController;
	private JButton scrambleButton;
	private JButton sortButton;
	private JButton searchButton;
	private JTextField userField;
	private JTextArea displayArea;
	private JScrollPane displayPane;
	private SpringLayout baseLayout;
	private JTextArea SampleArea;
	private JScrollPane SamplePane;
	
	
	public SamplePanel(SampleController baseController)
	{
		setBackground(Color.GREEN);
		this.baseController = baseController;
		scrambleButton =new JButton("Scramble arrays");
		sortButton = new JButton("Sort");
		searchButton = new JButton("Seacrh");
		userField = new JTextField(25);
		displayArea = new JTextArea(10,25);
		displayPane = new JScrollPane(displayArea);
		baseLayout = new SpringLayout();
		SampleArea = new JTextArea(5, 20);
		SampleArea.setEditable(false);
		SampleArea.setFont(new Font("Miramonte", Font.PLAIN, 13));
		SampleArea.setBackground(Color.LIGHT_GRAY);
		SampleArea.setForeground(new Color(0, 128, 0));
		SamplePane = new JScrollPane(SampleArea);
		setupPane();
		setupPanel();
		setupLayout();
		setupListeners();
		
	}

	private void setupLayout()
	{
		
		
	}

	private void setupListeners()
	{
	
		
	}

	private void setupPanel()
	{
		this.add(SamplePane);
		
		SampleArea.setText(baseController.displayTheArray(baseController.getIntegers()));
		SampleArea.setText(baseController.displayTheArray(baseController.getReals()));
		SampleArea.setText(baseController.displayTheArray(baseController.getMyMonster()));
		SampleArea.setText(baseController.displayTheArray(baseController.getWords()));	}

	private void setupPane()
	{
		SampleArea.setLineWrap(true);
		SampleArea.setWrapStyleWord(true);
		SampleArea.setEditable(false);
	}
	
}
