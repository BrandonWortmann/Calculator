package calculator.controller;

import calculator.view.CalculatorFrame;
import calculator.view.NumberPanel;

public class CalculatorController
{
	private CalculatorFrame appFrame;
	
	
	private String number;
	
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
		number = "";
		
		
	}
	public void changeText(String number)
	{
		this.number +=  number;
		appFrame.changeNumberPanel(number);
	}
	
	public void add(String input)
	{
		if(checkInput(input))
		{
			newText = Double.parseDouble(input);
			total = total + newText;
			wasSubtract = false;
			appFrame.changeNumberPanel(total + "");
		}
		else
		{
			appFrame.changeNumberPanel("Syntax Error");
		}
		
		
		
		
	}
	
	public void subtract(String input)
	{
		if(checkInput(input))
		{
			newText = Double.parseDouble(input);
			previousText = newText;
			total = total - newText;
			wasSubtract = true;
			appFrame.changeNumberPanel(total + "");
		}
		else
		{
			appFrame.changeNumberPanel("Syntax Error");
		}
		
	}
	
	public void multiply(String input)
	{
		if(checkInput(input))
		{
			newText = Double.parseDouble(input);
			if(wasSubtract)
			{
				total = total + previousText;
				previousText = previousText * newText;
				total = total - previousText;
			}
			else
			{
				total = total - previousText;
				previousText = previousText * newText;
				total = total + previousText;
				
			}
			
			appFrame.changeNumberPanel(total + "");
		}
		else
		{
			appFrame.changeNumberPanel("Syntax Error");
		}
		
		
	}
	
	public void divide(String input)
	{
		if(checkInput(input))
		{
			newText = Double.parseDouble(input);
			if(wasSubtract)
			{
				total = total + previousText;
				previousText = previousText / newText;
				total = total - previousText;
			}
			else
			{
				total = total - previousText;
				previousText = previousText / newText;
				total = total + previousText;
				
			}
			
			appFrame.changeNumberPanel(total + "");
		}
		else
		{
			appFrame.changeNumberPanel(total + "");
		}
		
		
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
