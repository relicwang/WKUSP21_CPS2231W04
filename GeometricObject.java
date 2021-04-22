package week9_Inheritance;

import java.util.Date;

public class GeometricObject extends Object {
	/**Data Field**/
	private String color;
	private boolean filled;
	private Date   dateCreated;//Record the date the object is created

	public GeometricObject() {
		this("white",false);
		//==new GeometricObject("white",false);
	}
	
	public GeometricObject(String color,  boolean filled) {
		this.color=color;
		this.filled=filled;
		dateCreated = new Date();
		System.out.println("I am in GeometricObject Class");
	}
	
	/**getColor():    -> String 
	 *Return the color of current object
	 */
	public String getColor() {
		return this.color;
	}
	
	/**setColor():  String  -> void 
	 *Set the color of current object
	 */
	public void setColor(String color) {
		 this.color=color;
	}
	
	/**isFilled():    -> boolean 
	 *Return whether current object is filled or not
	 */
	public boolean isFilled() {
		return this.filled;
	}
	
	/**setFilled():  boolean  -> void 
	 *Set the filled status of current object
	 */
	public void setFilled(boolean filled) {
		 this.filled=filled;
	}
	
	/**getDateCreated():    -> java.util.Date 
	 *Return the date that object created
	 */
	public Date getDateCreated() {
		return this.dateCreated;
	}
	
	/**toString():    -> String
	 *Return the String representation of current object
	 */
	public String toString() {
		return "The Color of Object is："+this.color
				+".\n The object Filled Status: "+this.filled
				+".\n The data object created is: "+this.dateCreated;
	}
	


	
}
