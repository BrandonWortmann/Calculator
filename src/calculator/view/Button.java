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
	private Color background;
	
	
	public Button(CalculatorController appController, String buttonSymbol, int type)
	{
		super();
		this.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		this.appController = appController;
		this.buttonSymbol = buttonSymbol;
		this.setBorder(new LineBorder(Color.BLACK,5));
		
		
		if(type == 1)
		{
			background = Color.DARK_GRAY;
			setupNumber();
			setupOtherListeners();
		}
		else if(type == 2)
		{
			background = Color.BLUE;
			setupFunction();
			setupListeners();
		}
		else if(type == 3)
		{
			background = Color.RED;
			setupEquals();
			setupListeners();
		}
		else if(type == 4)
		{
			background = new Color(0,200,150);
			setupOther();
			setupListeners();
		}
		else
		{
			background = new Color(0,200,150);
			setupRand();
			setupListeners();
		}
		
	}
	
	private void setupNumber()
	{
		
		this.setText(buttonSymbol);
		this.setOpaque(true);
		this.setBackground(background);
		this.setForeground(Color.WHITE);
		this.setFont(new Font("Lucida Grande", Font.PLAIN, 55));
		
		
	}
	
	private void setupFunction()
	{
		this.setText(buttonSymbol);
		this.setOpaque(true);
		this.setBackground(background);
		this.setForeground(Color.WHITE);
		this.setFont(new Font("Lucida Grande",Font.PLAIN, 50));
		
		
	}
	
	private void setupEquals()
	{
		this.setText(buttonSymbol);
		this.setOpaque(true);
		this.setBackground(background);
		this.setForeground(Color.WHITE);
		this.setFont(new Font("Lucida Grande",Font.PLAIN, 35));
		
	}
	
	private void setupOther()
	{
		this.setText(buttonSymbol);
		this.setOpaque(true);
		this.setBackground(background);
		this.setForeground(Color.WHITE);
		this.setFont(new Font("Lucida Grande",Font.PLAIN, 50));
				
	}
	
	private void setupRand()
	{
		this.setText(buttonSymbol);
		this.setOpaque(true);
		this.setBackground(background);
		this.setForeground(Color.WHITE);
		this.setFont(new Font("Lucida Grande",Font.PLAIN, 35));
		
	}
	
	private void setupListeners()
	{
		
		
		this.addMouseListener(new MouseAdapter() 
		{ 
	          public void mouseEntered(MouseEvent enter) 
	          { 
	        	  	setBorder(new LineBorder(Color.WHITE,5)); 
	          } 
	   
	          public void mouseExited(MouseEvent exit) 
	          { 
	        	  	setBorder(new LineBorder(Color.BLACK,5)); 
	          } 
	          
	          public void mousePressed(MouseEvent onClick)
	          {
	        	  	setBackground(background.darker());
	          }
	          
	          public void mouseReleased(MouseEvent offClick)
	          {
	        	  	setBackground(background);
	        	  	
	          }
	          
	          
	     }); 
		
		
		
		
	}
	private void setupOtherListeners()
	{
		this.addMouseListener(new MouseAdapter() 
		{ 
	          public void mouseEntered(MouseEvent enter) 
	          { 
	        	  	setBorder(new LineBorder(Color.WHITE,5)); 
	          } 
	   
	          public void mouseExited(MouseEvent exit) 
	          { 
	        	  	setBorder(new LineBorder(Color.BLACK,5)); 
	          } 
	          
	          public void mousePressed(MouseEvent onClick)
	          {
	        	  	setBackground(background.darker());
	          }
	          
	          public void mouseReleased(MouseEvent offClick)
	          {
	        	  	setBackground(background);
	        	  	appController.changeText(buttonSymbol);
	        	  	
	          }
	          
	          
	     }); 
	}
	
	

}
