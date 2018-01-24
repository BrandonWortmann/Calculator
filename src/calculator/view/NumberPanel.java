package calculator.view;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.SpringLayout;
import java.awt.Font;
import javax.swing.border.LineBorder;



public class NumberPanel extends JPanel
{
	private JTextArea numberArea;
	private SpringLayout appLayout;
	private String text;
	
	public NumberPanel()
	{
		super();
		numberArea = new JTextArea();
		appLayout = new SpringLayout();
		appLayout.putConstraint(SpringLayout.SOUTH, numberArea, 0, SpringLayout.SOUTH, this);
		
		
		
		setupPanel();
		setupLayout();
	}
	
	private void setupPanel()
	{
		this.add(numberArea);
		this.setLayout(appLayout);
		this.setBorder(new LineBorder(Color.BLACK,3));
		
		numberArea.setBackground(new Color(238, 232, 170));
		numberArea.setFont(new Font("Lucida Console", Font.PLAIN, 70));
		numberArea.setEditable(false);
		numberArea.setText("                    0");
		
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.NORTH, numberArea, 0, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, numberArea, 0, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, numberArea, 0, SpringLayout.EAST, this);
		
	}
	
	public String getNumbers()
	{
		
		return text;
	}
	
	public void changeText(String text)
	{
		this.text = text;
		numberArea.setText(text);
	}

}
