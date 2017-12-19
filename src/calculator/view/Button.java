package calculator.view;

import calculator.controller.CalculatorController;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.LineBorder;

public class Button extends JButton
{
	private CalculatorController appController;
	private String buttonSymbol;
	private int type;
	
	public Button(CalculatorController appController, String buttonSymbol, int type)
	{
		super();
		setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		this.appController = appController;
		this.buttonSymbol = buttonSymbol;
		this.type = type;
		this.setBorder(new LineBorder(Color.BLACK,5));
		
		if(type == 1)
		{
			setupNumber();
		}
		else if(type == 2)
		{
			setupFunction();
		}
		else if(type == 3)
		{
			setupEquals();
		}
		else
		{
			setupOther();
		}
	}
	
	public void setupNumber()
	{
		
		this.setText(buttonSymbol);
		this.setOpaque(true);
		this.setBackground(Color.DARK_GRAY);
		this.setForeground(Color.WHITE);
		this.setFont(new Font("Lucida Grande", Font.PLAIN, 50));
		
		
	}
	
	public void setupFunction()
	{
		this.setText(buttonSymbol);
		this.setOpaque(true);
		this.setBackground(Color.BLUE);
		this.setForeground(Color.WHITE);
		this.setFont(new Font("Lucida Grande",Font.PLAIN, 35));
		
		
	}
	
	public void setupEquals()
	{
		this.setText(buttonSymbol);
		this.setOpaque(true);
		this.setBackground(Color.RED);
		this.setForeground(Color.WHITE);
		this.setFont(new Font("Lucida Grande",Font.PLAIN, 35));
		
	}
	
	public void setupOther()
	{
		this.setText(buttonSymbol);
		this.setOpaque(true);
		this.setBackground(Color.GREEN);
		this.setForeground(Color.WHITE);
		this.setFont(new Font("Lucida Grande",Font.PLAIN, 35));
				
	}
	
	

}
