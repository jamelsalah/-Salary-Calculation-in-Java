package SalaryCalcularion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class Action implements ActionListener {
	private JTextField hoursField;
	private JTextField valueField;
	private JLabel resultLabel;
	
	public Action(JTextField hoursField, JTextField valueField, JLabel resultLabel) {
		this.hoursField = hoursField;
		this.valueField = valueField;
		this.resultLabel = resultLabel;
	}
	
	@Override
	
	public void actionPerformed(ActionEvent e) {
		Float hours = Float.parseFloat(hoursField.getText());
		Float value = Float.parseFloat(valueField.getText());
		Float result = null;
		
		if(hours/4 > 40) {
			float extraHours = ((hours/4) - 40) * 4;
			float extraHoursValue = (float) (extraHours * (value * 1.5));
			result = extraHoursValue + (40 * 4 * value);
		} else {
			result = hours * value;
		}
		
		resultLabel.setText("R$ "+Float.toString(result));
	}
}
