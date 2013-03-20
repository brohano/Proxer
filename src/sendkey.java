import java.awt.event.*;
 
public class sendkey{
	public static String convert(int keyEvent){
	    if(keyEvent == 32){
	        return " ";
	    }
	    return null;
	}
	public static void main(String [] arg){
	    System.out.println("Space=" + convert(KeyEvent.VK_SPACE) + ".");
	    //en kemmentar
	}
}