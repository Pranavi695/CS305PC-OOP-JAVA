import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Lab9P3 extends JFrame{
	Label l;
	Lab9P3(){
		super("JTree Demo");
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("Fruits");
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("Apples");
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("SoftDrinks");
		apple.add(new DefaultMutableTreeNode("Red Apple"));
		apple.add(new DefaultMutableTreeNode("Green Apple"));
		softdrink.add(new DefaultMutableTreeNode("pepsi"));
		softdrink.add(new DefaultMutableTreeNode("thumbsup"));
		root.add(apple);
		root.add(softdrink);
		JTree jt = new JTree(root);		
		add(jt);
		setVisible(true);
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 	
 	}
 		public static void main(String...args){
 		new Lab9P3();
 		}
 }
	
	
	
	
