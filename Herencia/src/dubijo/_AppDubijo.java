package dubijo;

import javax.swing.JOptionPane;

public class _AppDubijo {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "LINE");
		Line line = new Line(Integer.parseInt(JOptionPane.showInputDialog("Width of the line:")));
		JOptionPane.showMessageDialog(null, "Length = "+line.getLength());
		
		JOptionPane.showMessageDialog(null, "RECTANGLE");
		Rectangle rect = new Rectangle(Integer.parseInt(JOptionPane.showInputDialog("Width of the rectangle:")), 
				Integer.parseInt(JOptionPane.showInputDialog("Height of the rectangle:")));
		JOptionPane.showMessageDialog(null, "Area = "+rect.getArea());
		
		JOptionPane.showMessageDialog(null, "BOX");
		Box box = new Box(Integer.parseInt(JOptionPane.showInputDialog("Width of the box:")), 
				Integer.parseInt(JOptionPane.showInputDialog("Height of the box:")), 
				Integer.parseInt(JOptionPane.showInputDialog("Thickness of the box:")));
		JOptionPane.showMessageDialog(null, "Volume = "+box.getVolume());

	}

}
