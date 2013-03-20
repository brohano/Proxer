import java.util.Scanner;


public class räknare {


	public static void main(String[] args) {
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
				System.out.println("" + bokstav + bokstav2 + bokstav3 + bokstav4 + bokstav5 + bokstav6 + bokstav7 + bokstav8);
				if (ett== 122){
					break;
				}
			}
			else if (längd == 7){
				System.out.println("" + bokstav2 + bokstav3 + bokstav4 + bokstav5 + bokstav6 + bokstav7 + bokstav8);
				if (två== 122){
					längd = 8;
					break;
				}
			}
			else if (längd == 6){
				System.out.println("" + bokstav3 + bokstav4 + bokstav5 + bokstav6 + bokstav7 + bokstav8);
				if (tre== 122){
					längd = 7;
					break;
				}
			}
			else if (längd == 5){
				System.out.println("" + bokstav4 + bokstav5 + bokstav6 + bokstav7 + bokstav8);
				if (fyra== 122){
					längd = 6;
					break;
				}
			}
			else if (längd == 4){
				System.out.println("" + bokstav5 + bokstav6 + bokstav7 + bokstav8);
				if (fem== 122){
					längd = 5;
					break;
				}
			}
			else if (längd == 3){
				System.out.println("" + bokstav6 + bokstav7 + bokstav8);
				if (sex== 122){
					längd = 4;
					break;
				}
			}
			else if (längd == 2){
				System.out.println("" + bokstav7 + bokstav8);
				if (sju== 122){
					längd = 3;
					break;
				}
			}
			else if (längd == 1){
				System.out.println("" + bokstav8);
				if (åtta== 122){
					längd = 2;
					break;
				}
			}
			
			/*if (två== 122){
				System.out.println("One två loop");
			}*/
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