package calculator.view;

import calculator.controller.CalculatorController;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.border.LineBorder;

public class Button extends JButton
{
	private CalculatorController appController;
	private String buttonSymbol;
	
	
	public Button(CalculatorController appController, String buttonSymbol, int type)
	{
		super();
		this.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		this.appController = appController;
		this.buttonSymbol = buttonSymbol;
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
		setupListeners();
	}
	
	private void setupNumber()
	{
		
		this.setText(buttonSymbol);
		this.setOpaque(true);
		this.setBackground(Color.DARK_GRAY);
		this.setForeground(Color.WHITE);
		this.setFont(new Font("Lucida Grande", Font.PLAIN, 55));
		
		
	}
	
	private void setupFunction()
	{
		this.setText(buttonSymbol);
		this.setOpaque(true);
		this.setBackground(Color.BLUE);
		this.setForeground(Color.WHITE);
		this.setFont(new Font("Lucida Grande",Font.PLAIN, 50));
		
		
	}
	
	private void setupEquals()
	{
		this.setText(buttonSymbol);
		this.setOpaque(true);
		this.setBackground(Color.RED);
		this.setForeground(Color.WHITE);
		this.setFont(new Font("Lucida Grande",Font.PLAIN, 35));
		
	}
	
	private void setupOther()
	{
		this.setText(buttonSymbol);
		this.setOpaque(true);
		this.setBackground(new Color(0,200,150));
		this.setForeground(Color.WHITE);
		this.setFont(new Font("Lucida Grande",Font.PLAIN, 50));
				
	}
	
	private void setupListeners()
	{
		this.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent enter)
			{
				System.out.println("works");

			}
		});
		
		this.addMouseListener(new MouseAdapter() 
		{ 
	          public void mouseEntered(MouseEvent enter) 
	          { 
	        	  setBorder(new LineBorder(Color.WHITE,5)); 
	          } 
	     }); 
		
		this.addMouseListener(new MouseAdapter() 
		{ 
	          public void mouseExited(MouseEvent exit) 
	          { 
	        	  setBorder(new LineBorder(Color.BLACK,5)); 
	          } 
	     }); 
		
		
		
		
	}
	
	

}
