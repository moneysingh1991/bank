package cs_146_project;
/**
 * This interfaces gives an update method so that the mode view and controller can transmit data
 */
public interface UpdateInterface
{	
	/**
	 * This method is call across the model, view, and controller to send the necessary data
	 * @param data the necessary data
	 */
	public void update(Object... data);
}
