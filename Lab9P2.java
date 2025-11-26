import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Lab9P2 extends JFrame{
	Label l;
	Lab9P2(){
		super("JTable Demo");
		String[]heading = {"Name","Course","ROLLno"};
		String[][]data = {
					{"Ahan","CSE","56"},
					{"Belly","CSM","63"},
					{"Mike","CSO","79"},
					{"Dustin","CSD","85"},
		};
		JTable jt = new JTable(data,heading);
		add(jt);
		setVisible(true);
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 	
 	}
 		public static void main(String...args){
 		new Lab9P2();
 		}
 }
