/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author adityangt
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class firstpage {
JFrame f=new JFrame("Sorter");
	JLabel l=new JLabel("Enter values");
	static JTextField t= new JTextField(20);
	JButton b=new JButton("Start");
	public static void main(String[] args) {
	new firstpage();
	}
	public firstpage()
	{
		frame();
		
	}
	public void frame()
	{
		f.setSize(500,500);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		/*JPanel q=new JPanel();
		JLabel l2=new JLabel("Student Portal");
		q.setSize(100,100);
		q.setVisible(true);
		q.add(l2);*/
		
		JPanel p=new JPanel();
		l.setFont(new Font("Ariel",Font.ITALIC,20));
		p.add(l);
		p.add(t);
		p.add(b);
		p.setBackground(new Color(64, 128, 191));
		b.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent arg0) {
				new Main().main(null);
				new main2().main(null);
                                new main3().main(null);
                                new main4().main(null);
                                f.dispose();
                                
				}
			});
		f.add(p);
		
		f.setVisible(true);
		l.setForeground(new Color(96, 64, 32));
		}
	

}
