package calculator.controller;

import calculator.view.CalculatorFrame;

public class CalculatorController
{
	private CalculatorFrame appFrame;
	
	double total;
	double newText;
	double previousText;
	boolean wasSubtract;

	public CalculatorController()
	{
		appFrame = new CalculatorFrame(this);
		total = 0.0;
		newText = 0.0;
		previousText = 0.0;
		wasSubtract = false;
		
		
	}
	
	public void add(String input)
	{
		if(checkInput(input))
		{
			newText = Double.parseDouble(input);
		}
		
		previousText = newText;
		total = total + newText;
		newText = 0.0;
		
		appFrame.setPanel(total + "");
	}
	
	public void subtract(String input)
	{
		if(checkInput(input))
		{
			newText = Double.parseDouble(input);
		}
		previousText = newText;
		total = total - newText;
		newText = 0.0;
	}
	
	public void multiply(String input)
	{
		if(checkInput(input))
		{
			newText = Double.parseDouble(input);
		}
		
		previousText *= newText
		total = total * newText;
	}
	
	public void divide(String input)
	{
		if(checkInput(input))
		{
			newText = Double.parseDouble(input);
		}
		
		total = total / newText;
	}
	
	public boolean checkInput(String input)
	{
		
		
		try
		{
			Double.parseDouble(input);
		}
		
		catch (NumberFormatException error)
		{
			return false;
		}
		
		return true;
		
		
	}
}
