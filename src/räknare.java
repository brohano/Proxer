import java.util.Scanner;


public class r�knare {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Hur l�ng �r koden? (mellan 1 och 8)");
		int l�ngd = scan.nextInt();
		
		for(int ett = 48; ett < 123; ett+=1) {
			
			for(int tv� = 48; tv� < 123; tv�+=1) {
				
				for(int tre = 48; tre < 123; tre+=1) {
					
					for(int fyra = 48; fyra < 123; fyra+=1) {
						
						for(int fem = 48; fem < 123; fem+=1) {
							
							for(int sex = 48; sex < 123; sex+=1) {
								
								for(int sju = 48; sju < 123; sju+=1) {
									
									for(int �tta = 48; �tta < 123; �tta+=1) {
										
										if(�tta== 58){
											�tta = 65;
										}
										if(�tta== 91){
											�tta = 97;
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
				
				if(tv�== 58){
					tv� = 65;
				}
				if(tv�== 91){
					tv� = 97;
				}
				
			if(ett== 58){
				ett = 65;
			}
			if(ett== 91){
				ett = 97;
			}
			
			char bokstav = (char)ett;
			char bokstav2 = (char)tv�;
			char bokstav3 = (char)tre;
			char bokstav4 = (char)fyra;
			char bokstav5 = (char)fem;
			char bokstav6 = (char)sex;
			char bokstav7 = (char)sju;
			char bokstav8 = (char)�tta;
			
			if (l�ngd == 8){
				System.out.println("" + bokstav + bokstav2 + bokstav3 + bokstav4 + bokstav5 + bokstav6 + bokstav7 + bokstav8);
				if (ett== 122){
					break;
				}
			}
			else if (l�ngd == 7){
				System.out.println("" + bokstav2 + bokstav3 + bokstav4 + bokstav5 + bokstav6 + bokstav7 + bokstav8);
				if (tv�== 122){
					l�ngd = 8;
					break;
				}
			}
			else if (l�ngd == 6){
				System.out.println("" + bokstav3 + bokstav4 + bokstav5 + bokstav6 + bokstav7 + bokstav8);
				if (tre== 122){
					l�ngd = 7;
					break;
				}
			}
			else if (l�ngd == 5){
				System.out.println("" + bokstav4 + bokstav5 + bokstav6 + bokstav7 + bokstav8);
				if (fyra== 122){
					l�ngd = 6;
					break;
				}
			}
			else if (l�ngd == 4){
				System.out.println("" + bokstav5 + bokstav6 + bokstav7 + bokstav8);
				if (fem== 122){
					l�ngd = 5;
					break;
				}
			}
			else if (l�ngd == 3){
				System.out.println("" + bokstav6 + bokstav7 + bokstav8);
				if (sex== 122){
					l�ngd = 4;
					break;
				}
			}
			else if (l�ngd == 2){
				System.out.println("" + bokstav7 + bokstav8);
				if (sju== 122){
					l�ngd = 3;
					break;
				}
			}
			else if (l�ngd == 1){
				System.out.println("" + bokstav8);
				if (�tta== 122){
					l�ngd = 2;
					break;
				}
			}
			
			/*if (tv�== 122){
				System.out.println("One tv� loop");
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