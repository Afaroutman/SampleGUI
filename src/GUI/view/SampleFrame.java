package GUI.view;

import javax.swing.JFrame;
import GUI.controller.SampleController;
import java.awt.Color;

public class SampleFrame extends JFrame
{
	private SamplePanel basePanel;
	private SampleController baseController;
	
	public SampleFrame(SampleController baseController)
	{
		setBackground(Color.DARK_GRAY);
		this.baseController = baseController;
		basePanel = new SamplePanel(baseController);
		basePanel.setBackground(Color.GREEN);
	
		
		setupFrame();
	}
	private void setupFrame()
	{
		this.setSize(700, 700);
		this.setContentPane(basePanel);
		this.setVisible(true);
	}
	
}
