import static java.awt.event.KeyEvent.*;
import java.awt.AWTException;
import java.awt.Robot;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;

public class Johan {
	
    private Robot robot;
    
    private JFrame f;
    private JPanel p;
    private JButton b;
    private JLabel l;
    
    
    public void construct()
    {
    	gui();
    }
    
    public void gui()
    {
    	
    	f = new JFrame("4/20 Ganja Hack");
    	f.setVisible(true);
    	f.setSize(1000,650);
    	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
    	p = new JPanel();
    	p.setBackground(Color.BLUE);
    	
    	b = new JButton ("Start");
    	l = new JLabel ("Testlabel");
    	
    	p.add(b);
    	p.add(l);
    	
    	f.add(p);
    }

  /*  public static void main(String... args) throws Exception {
    	Johan Johan = new Johan();
    	Johan.type("Hello there, how are you?");
    }*/
	public static void main(String[] args) throws Exception {
		
		
		new Johan();
		
		
		
		
		
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Hur lång är koden? (mellan 1 och 8)");
		int längd = scan.nextInt();
		
		for(int ett = 48; ett < 123; ett+=1) {
			
			for(int två = 48; två < 123; två+=1) {
				
				for(int tre = 48; tre < 123; tre+=1) {
					
					for(int fyra = 48; fyra < 123; fyra+=1) {
						
						for(int fem = 48; fem < 123; fem+=1) {
							
							for(int sex = 48; sex < 123; sex+=1) {
								
								for(int sju = 48; sju < 123; sju+=1) {
									
									for(int åtta = 48; åtta < 123; åtta+=1) {
										
										if(åtta== 58){
											åtta = 65;
										}
										if(åtta== 91){
											åtta = 97;
										}
									
									if(sju== 58){
										sju = 65;
									}
									if(sju== 91){
										sju = 97;
									}
								
								if(sex== 58){
									sex = 65;
								}
								if(sex== 91){
									sex = 97;
								}
							
							if(fem== 58){
								fem = 65;
							}
							if(fem== 91){
								fem = 97;
							}
						
						if(fyra== 58){
							fyra = 65;
						}
						if(fyra== 91){
							fyra = 97;
						}
					
					if(tre== 58){
						tre = 65;
					}
					if(tre== 91){
						tre = 97;
					}
				
				if(två== 58){
					två = 65;
				}
				if(två== 91){
					två = 97;
				}
				
			if(ett== 58){
				ett = 65;
			}
			if(ett== 91){
				ett = 97;
			}
			
			char bokstav = (char)ett;
			char bokstav2 = (char)två;
			char bokstav3 = (char)tre;
			char bokstav4 = (char)fyra;
			char bokstav5 = (char)fem;
			char bokstav6 = (char)sex;
			char bokstav7 = (char)sju;
			char bokstav8 = (char)åtta;
			
			if (längd == 8){
				Johan Johan = new Johan();
				Johan.type("\n" + bokstav + bokstav2 + bokstav3 + bokstav4 + bokstav5 + bokstav6 + bokstav7 + bokstav8);
				if (ett== 122){
					break;
				}
			}
			else if (längd == 7){
				Johan Johan = new Johan();
				Johan.type("\n" + bokstav2 + bokstav3 + bokstav4 + bokstav5 + bokstav6 + bokstav7 + bokstav8);
				if (två== 122){
					längd = 8;
					break;
				}
			}
			else if (längd == 6){
				Johan Johan = new Johan();
				Johan.type("\n" + bokstav3 + bokstav4 + bokstav5 + bokstav6 + bokstav7 + bokstav8);
				if (tre== 122){
					längd = 7;
					break;
				}
			}
			else if (längd == 5){
				Johan Johan = new Johan();
				Johan.type("\n" + bokstav4 + bokstav5 + bokstav6 + bokstav7 + bokstav8);
				if (fyra== 122){
					längd = 6;
					break;
				}
			}
			else if (längd == 4){
				Johan Johan = new Johan();
				Johan.type("\n" + bokstav5 + bokstav6 + bokstav7 + bokstav8);
				if (fem== 122){
					längd = 5;
					break;
				}
			}
			else if (längd == 3){
				Johan Johan = new Johan();
				Johan.type("\n" + bokstav6 + bokstav7 + bokstav8);
				if (sex== 122){
					längd = 4;
					break;
				}
			}
			else if (längd == 2){
				Johan Johan = new Johan();
				Johan.type("\n" + bokstav7 + bokstav8);
				if (sju== 122){
					längd = 3;
					break;
				}
			}
			else if (längd == 1){
				Johan Johan = new Johan();
				Johan.type("\n" + bokstav8);
				if (åtta== 122){
					längd = 2;
					break;
				}
			}
			
			
			}
			}
			}
			}
			}
			}
			}
		
		}
		
		
		
	}

    public Johan() throws AWTException {
    	this.robot = new Robot();
    }

    public Johan(Robot robot) {
    	this.robot = robot;
    }

    public void type(CharSequence characters) {
    	int length = characters.length();
    	for (int i = 0; i < length; i++) {
    		char character = characters.charAt(i);
    		type(character);
    	}
    }

    public void type(char character) {
    	switch (character) {
    	case 'a': doType(VK_A); break;
    	case 'b': doType(VK_B); break;
    	case 'c': doType(VK_C); break;
    	case 'd': doType(VK_D); break;
    	case 'e': doType(VK_E); break;
    	case 'f': doType(VK_F); break;
    	case 'g': doType(VK_G); break;
    	case 'h': doType(VK_H); break;
    	case 'i': doType(VK_I); break;
    	case 'j': doType(VK_J); break;
    	case 'k': doType(VK_K); break;
    	case 'l': doType(VK_L); break;
    	case 'm': doType(VK_M); break;
    	case 'n': doType(VK_N); break;
    	case 'o': doType(VK_O); break;
    	case 'p': doType(VK_P); break;
    	case 'q': doType(VK_Q); break;
    	case 'r': doType(VK_R); break;
    	case 's': doType(VK_S); break;
    	case 't': doType(VK_T); break;
    	case 'u': doType(VK_U); break;
    	case 'v': doType(VK_V); break;
    	case 'w': doType(VK_W); break;
    	case 'x': doType(VK_X); break;
    	case 'y': doType(VK_Y); break;
    	case 'z': doType(VK_Z); break;
    	case 'A': doType(VK_SHIFT, VK_A); break;
    	case 'B': doType(VK_SHIFT, VK_B); break;
    	case 'C': doType(VK_SHIFT, VK_C); break;
    	case 'D': doType(VK_SHIFT, VK_D); break;
    	case 'E': doType(VK_SHIFT, VK_E); break;
    	case 'F': doType(VK_SHIFT, VK_F); break;
    	case 'G': doType(VK_SHIFT, VK_G); break;
    	case 'H': doType(VK_SHIFT, VK_H); break;
    	case 'I': doType(VK_SHIFT, VK_I); break;
    	case 'J': doType(VK_SHIFT, VK_J); break;
    	case 'K': doType(VK_SHIFT, VK_K); break;
    	case 'L': doType(VK_SHIFT, VK_L); break;
    	case 'M': doType(VK_SHIFT, VK_M); break;
    	case 'N': doType(VK_SHIFT, VK_N); break;
    	case 'O': doType(VK_SHIFT, VK_O); break;
    	case 'P': doType(VK_SHIFT, VK_P); break;
    	case 'Q': doType(VK_SHIFT, VK_Q); break;
    	case 'R': doType(VK_SHIFT, VK_R); break;
    	case 'S': doType(VK_SHIFT, VK_S); break;
    	case 'T': doType(VK_SHIFT, VK_T); break;
    	case 'U': doType(VK_SHIFT, VK_U); break;
    	case 'V': doType(VK_SHIFT, VK_V); break;
    	case 'W': doType(VK_SHIFT, VK_W); break;
    	case 'X': doType(VK_SHIFT, VK_X); break;
    	case 'Y': doType(VK_SHIFT, VK_Y); break;
    	case 'Z': doType(VK_SHIFT, VK_Z); break;
    	case '`': doType(VK_BACK_QUOTE); break;
    	case '0': doType(VK_0); break;
    	case '1': doType(VK_1); break;
    	case '2': doType(VK_2); break;
    	case '3': doType(VK_3); break;
    	case '4': doType(VK_4); break;
    	case '5': doType(VK_5); break;
    	case '6': doType(VK_6); break;
    	case '7': doType(VK_7); break;
    	case '8': doType(VK_8); break;
    	case '9': doType(VK_9); break;
    	case '-': doType(VK_MINUS); break;
    	case '=': doType(VK_EQUALS); break;
    	case '~': doType(VK_SHIFT, VK_BACK_QUOTE); break;
    	case '!': doType(VK_EXCLAMATION_MARK); break;
    	case '@': doType(VK_AT); break;
    	case '#': doType(VK_NUMBER_SIGN); break;
    	case '$': doType(VK_DOLLAR); break;
    	case '%': doType(VK_SHIFT, VK_5); break;
    	case '^': doType(VK_CIRCUMFLEX); break;
    	case '&': doType(VK_AMPERSAND); break;
    	case '*': doType(VK_ASTERISK); break;
    	case '(': doType(VK_LEFT_PARENTHESIS); break;
    	case ')': doType(VK_RIGHT_PARENTHESIS); break;
    	case '_': doType(VK_UNDERSCORE); break;
    	case '+': doType(VK_PLUS); break;
    	case '\t': doType(VK_TAB); break;
    	case '\n': doType(VK_ENTER); break;
    	case '[': doType(VK_OPEN_BRACKET); break;
    	case ']': doType(VK_CLOSE_BRACKET); break;
    	case '\\': doType(VK_BACK_SLASH); break;
    	case '{': doType(VK_SHIFT, VK_OPEN_BRACKET); break;
    	case '}': doType(VK_SHIFT, VK_CLOSE_BRACKET); break;
    	case '|': doType(VK_SHIFT, VK_BACK_SLASH); break;
    	case ';': doType(VK_SEMICOLON); break;
    	case ':': doType(VK_COLON); break;
    	case '\'': doType(VK_QUOTE); break;
    	case '"': doType(VK_QUOTEDBL); break;
    	case ',': doType(VK_COMMA); break;
    	case '<': doType(VK_LESS); break;
    	case '.': doType(VK_PERIOD); break;
    	case '>': doType(VK_GREATER); break;
    	case '/': doType(VK_SLASH); break;
    	case '?': doType(VK_SHIFT, VK_SLASH); break;
    	case ' ': doType(VK_SPACE); break;
    	default:
    		throw new IllegalArgumentException("Cannot type character " + character);
    	}
    }

    private void doType(int... keyCodes) {
    	doType(keyCodes, 0, keyCodes.length);
    }

    private void doType(int[] keyCodes, int offset, int length) {
    	if (length == 0) {
    		return;
    	}

    	robot.keyPress(keyCodes[offset]);
    	robot.delay(250);                  //Changes the speed it sends the keys (miliseconds)
    	doType(keyCodes, offset + 1, length - 1);
    	robot.keyRelease(keyCodes[offset]);
    }

}