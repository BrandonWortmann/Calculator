package calculator.view;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.GridLayout;
import calculator.controller.CalculatorController;


public class ButtonPanel extends JPanel
{
	private JButton zeroButton;
	private JButton oneButton;
	private JButton twoButton;
	private JButton threeButton;
	private JButton fourButton;
	private JButton fiveButton;
	private JButton sixButton;
	private JButton seavenButton;
	private JButton eightButton;
	private JButton nineButton;
	private JButton plusButton;
	private JButton minusButton;
	private JButton multiplyButton;
	private JButton divideButton;
	private JButton equalsButton;
	private JButton decimalButton;
	private JButton negativeButton;
	private JButton answerButton;
	private JButton backButton;
	private JButton clearButton;
	
	private GridLayout buttonLayout;
	
	private CalculatorController appController;
	
	public ButtonPanel(CalculatorController appController)
	{
		super();
		zeroButton = new Button(appController, "0", 1);
		oneButton = new Button(appController, "1", 1);
		twoButton = new Button(appController, "2", 1);
		threeButton = new Button(appController, "3", 1);
		fourButton = new Button(appController, "4", 1);
		fiveButton = new Button(appController, "5", 1);
		sixButton = new Button(appController, "6", 1);
		seavenButton = new Button(appController, "7", 1);
		eightButton = new Button(appController, "8", 1);
		nineButton = new Button(appController, "9", 1);
		plusButton = new Button(appController, "+", 2);
		minusButton = new Button(appController, "-", 2);
		multiplyButton = new Button(appController, "x", 2);
		divideButton = new Button(appController, "/", 2);
		equalsButton = new Button(appController, "=", 3);
		decimalButton = new Button(appController, ".", 1);
		negativeButton = new Button(appController, "+/-", 1);
		answerButton = new Button(appController, "RAND", 4);
		backButton = new Button(appController, "-->", 4);
		clearButton = new Button(appController, "C", 4);

		buttonLayout = new GridLayout(5, 4, 10, 10);
		
		setupPanel();
		
		
		
	}
	
	public void setupPanel()
	{
		this.setBackground(Color.LIGHT_GRAY);
		this.add(clearButton);
		this.add(answerButton);
		this.add(backButton);
		this.add(divideButton);
		this.add(seavenButton);
		this.add(eightButton);
		this.add(nineButton);
		this.add(multiplyButton);
		this.add(fourButton);
		this.add(fiveButton);
		this.add(sixButton);
		this.add(minusButton);
		this.add(oneButton);
		this.add(twoButton);
		this.add(threeButton);
		this.add(plusButton);
		this.add(negativeButton);
		this.add(zeroButton);
		this.add(decimalButton);
		this.add(equalsButton);
		this.setLayout(buttonLayout);
		
		
		
		
		
	}
	
	

	
}
