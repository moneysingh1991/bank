package cs_146_project;

import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;

/**
 * This class communicates between model view controller by sending data when an buttom is pressed in object
 */
public class Controller
{
	private JScrollPane buttom;
	private UpdateInterface model;
	
	public Controller(View v)
	{
//		diceboard = v.getDiceBoard();
		buttom.addMouseListener(new java.awt.event.MouseAdapter()
		{
			public void mouseClicked(java.awt.event.MouseEvent evt)
			{
				diceboardMouseClicked(evt);
			}

			private void diceboardMouseClicked(MouseEvent evt)
			{
				model.update();					
			}
		});
	}
	
	public void setModel(UpdateInterface newModel)
	{
		this.model = newModel;
	}
}
