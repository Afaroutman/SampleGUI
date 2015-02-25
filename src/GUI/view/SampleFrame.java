package GUI.view;

import javax.swing.JFrame;
import GUI.controller.SampleController;

public class SampleFrame extends JFrame
{
	private SamplePanel basePanel;
	private SampleController baseController;
	
	public SampleFrame(SampleController baseController)
	{
		this.baseController = baseController;
		basePanel = new SamplePanel(baseController);
	
		
		setupFrame();
	}
	private void setupFrame()
	{
		this.setSize(700, 700);
		this.setContentPane(basePanel);
		this.setVisible(true);
	}
	
}
