package battleship;

import java.awt.EventQueue;

import javax.swing.JFrame;


public class GameCreator {
	
	public static void main (String[] args)
	{
		EventQueue.invokeLater(new Runnable()
        {
           public void run()
           {
        	   
//        	   JFrame frame = new Frame();
//        	   frame.setTitle("BattleShip");
//        	   BoardView view = new BoardView();
//        	   frame.add(view);

        	   
        	   BoardView bv = new BoardView();
        	   JFrame frame = new JFrame();
        	   BoardModel s = new BoardModel();
        	   Controller c = new Controller(bv,s);
        	   frame.add(bv.getGui());   
        	   frame.pack();
        	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	   frame.setVisible(true);
           }
        });
	}
	

	
}

