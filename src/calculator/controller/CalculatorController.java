package calculator.controller;

import calculator.view.CalculatorFrame;

public class CalculatorController
{
	private CalculatorFrame appFrame;
	
	double total;
	double newText;

	public CalculatorController()
	{
		appFrame = new CalculatorFrame(this);
		total = 0.0;
		newText = 0.0;
	}
	
	public void add(String input)
	{
		if(checkInput(input))
		{
			newText = Double.parseDouble(input);
		}
		
		total = total + newText;
		
		
	}
	
	public void subtract(String input)
	{
		if(checkInput(input))
		{
			newText = Double.parseDouble(input);
		}
		
		total = total - newText;
	}
	
	public void multiply(String input)
	{
		if(checkInput(input))
		{
			newText = Double.parseDouble(input);
		}
		
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
