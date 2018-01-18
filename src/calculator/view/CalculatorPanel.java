package calculator.view;

import javax.swing.JPanel;
import calculator.controller.CalculatorController;
import javax.swing.SpringLayout;

public class CalculatorPanel extends JPanel
{
	private ButtonPanel buttonPanel;
	private NumberPanel numberPanel;
	private CalculatorController appController;
	private SpringLayout appLayout;
	
	public CalculatorPanel( CalculatorController appController)
	{
		super();
		this.appController = appController;
		appLayout = new SpringLayout();
		buttonPanel = new ButtonPanel(appController);
		appLayout.putConstraint(SpringLayout.NORTH, buttonPanel, 80, SpringLayout.NORTH, this);
		numberPanel = new NumberPanel();
		
		
		setupPanel();
		setupLayout();
	}
	
	private void setupPanel()
	{
		this.add(buttonPanel);
		this.add(numberPanel);
		this.setLayout(appLayout);
		
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.WEST, buttonPanel, 0, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, buttonPanel, 0, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, buttonPanel, 0, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, numberPanel, 0, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, numberPanel, 0, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, numberPanel, 0, SpringLayout.NORTH, buttonPanel);
		appLayout.putConstraint(SpringLayout.EAST, numberPanel, 0, SpringLayout.EAST, this);
		
	}
	
	public void setPanel(String input)
	{
		numberPanel.changeText(input);
	}

}
