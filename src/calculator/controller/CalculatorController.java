package calculator.controller;

import calculator.view.CalculatorFrame;

public class CalculatorController
{
	private CalculatorFrame appFrame;

	public void start()
	{
		appFrame = new CalculatorFrame(this);
	}
}
