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
	
	public NumberPanel()
	{
		super();
		numberArea = new JTextArea();
		appLayout = new SpringLayout();
		
		
		
		setupPanel();
		setupLayout();
	}
	
	private void setupPanel()
	{
		this.add(numberArea);
		this.setLayout(appLayout);
		this.setBorder(new LineBorder(Color.BLACK,3));
		
		numberArea.setBackground(new Color(238, 232, 170));
		numberArea.setFont(new Font("Adobe Fangsong Std", Font.PLAIN, 100));
		numberArea.setEditable(false);
		
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.NORTH, numberArea, 0, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, numberArea, 0, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, numberArea, 0, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, numberArea, 0, SpringLayout.EAST, this);
		
	}

}
