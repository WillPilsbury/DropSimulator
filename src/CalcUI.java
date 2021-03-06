import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GraphicsConfiguration;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.peer.LightweightPeer;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class CalcUI extends DropCalc implements ActionListener {
	static GraphicsConfiguration gc;
	DropCalc dc = new DropCalc();
	int newRoll = dc.getRoll();
	int newRoll2 = dc.getRoll2();
	Color color = Color.decode("#81D4FA");
	Dimension dimension = new Dimension(250, 50);
	int dropRate2 = dropRate;
	// String output = "It took you " + dc.i + " rolls.";

	
	
	
	public void ui() {
		JFrame frame = new JFrame(gc);
		frame.setSize(500, 250);
		frame.setTitle("WillPil's Drop Simulator v0.1");
		
		JPanel p = new JPanel(new FlowLayout());
		JPanel p1 = new JPanel(new FlowLayout());
		Border padding = BorderFactory.createEmptyBorder(40, 40, 40, 40);
		p1.setBorder(padding);
		p1.setPreferredSize(dimension);
		p1.setLocation(250, 50);
		frame.add(p);
		frame.add(p1);
		
		
		JButton btn1 = new JButton("Roll");
		btn1.setPreferredSize(dimension);
		btn1.setBackground(color);
		p1.add(btn1);
		
		
		JComboBox itemDrop = new JComboBox(itemDrops);
		itemDrop.setBounds(10, 10, 45, 30);
		p1.add(itemDrop);
		itemDrop.setVisible(true);
		frame.setVisible(true);
		String itemType = itemDrop.getSelectedItem().toString();
		System.out.println(itemType);
		
		
		
		
		
		frame.getContentPane().setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dc.dCalc();
				int x = DropCalc.i;
				String inc = Integer.toString(x);
				JLabel j = new JLabel();
				if(x == 1) {
					j.setText("It took you " + inc + " roll.");
				} else {
					j.setText("It took you " + inc + " rolls.");
				}
				
				JPanel p2 = new JPanel(new BorderLayout());
				p2.setSize(250, 50);
				p2.setLocation(115, 100);
				p2.add(j);
				p2.setVisible(true);
				j.setSize(250, 50);
				j.setLocation(250, 100);
				j.setVisible(true);
				j.setHorizontalAlignment(JLabel.CENTER);
				frame.add(p2);
				frame.setVisible(true);

				// System.out.println(output);
			} 
		});
		
		ActionListener cbAL = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String itemType = itemDrop.getSelectedItem().toString();
				
				
				switch (itemType) {
				case "Ranger Boots":
					dropRate = 293;
					System.out.println(itemType);
					break;
				case "Armadyl Hilt":
					dropRate = 508;
					System.out.println(itemType);
					break;
				case "Bandos Hilt":
					dropRate = 508;
					System.out.println(itemType);
					break;
				case "Saradomin Hilt":
					dropRate = 508;
					System.out.println(itemType);
					break;
				case "Zamorak Hilt":
					dropRate = 508;
					System.out.println(itemType);
					break;
				case "Dragon Warhammer":
					dropRate = 5000;
					System.out.println(itemType);
					break;
				default: break;
				}
			}
		};
		
		itemDrop.addActionListener(cbAL);
		 	
	}
	
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

}
