package com.designpatterns.flyweight;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.designpatterns.flyweight.ShapeFactory.ShapeType;


public class Draw extends JFrame{
	int height;
	int width;

	private static final ShapeType shapes[] = { ShapeType.LINE, ShapeType.OVAL_FILL,ShapeType.OVAL_NOT_FILL };
	private static final Color colors[] = { Color.RED, Color.GREEN, Color.YELLOW };
	
	ShapeFactory shapeFactory=null;
	
	public Draw(int height,int widht){
		this.height=height;
		this.width=width;
		Container contentPane= getContentPane();
		JButton button=new JButton("draw");
		final JPanel panel=new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		contentPane.add(button, BorderLayout.SOUTH);
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event) {
				Graphics g = panel.getGraphics();
				if(shapeFactory==null)shapeFactory=new ShapeFactory();
				for (int i = 0; i < 20; ++i) {
					Shape shape = shapeFactory.getShape(getRandomShape());
					shape.draw(g, getRandomX(), getRandomY(), getRandomWidth(),
							getRandomHeight(), getRandomColor());
				}
			}
		});
	}

	private ShapeType getRandomShape() {
		return shapes[(int) (Math.random() * shapes.length)];
	}

	private int getRandomX() {
		return (int) (Math.random() * WIDTH);
	}

	private int getRandomY() {
		return (int) (Math.random() * HEIGHT);
	}

	private int getRandomWidth() {
		return (int) (Math.random() * (WIDTH / 10));
	}

	private int getRandomHeight() {
		return (int) (Math.random() * (HEIGHT / 10));
	}

	private Color getRandomColor() {
		return colors[(int) (Math.random() * colors.length)];
	}
	
	public static void main(String[] args){
		Draw drawing = new Draw(500,600);
	}
}