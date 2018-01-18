package calculator.view;

import calculator.controller.CalculatorController;
import javax.swing.JFrame;

public class CalculatorFrame extends JFrame
{
	private CalculatorController appController;
	private CalculatorPanel appPanel;
	
	public CalculatorFrame(CalculatorController appController)
	{
		super();
		this.appController = appController;
		appPanel = new CalculatorPanel(appController);
		
		setupFrame();
		
	}
	
	private void setupFrame()
	{
		this.setSize(500 , 700);
		this.setTitle("Calculator");
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.add(appPanel);
		
		this.setVisible(true);
	}

}
