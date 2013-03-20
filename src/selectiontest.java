public class selectiontest {
	/**
	 * Main-metoden �r "commando-centralen" som startar programmet,
	 * h�r anropas alla andra metoder, annars k�rs de ej
	 */
	public static void main(String[] args)
	{
		int [] testArray = {3,7,4,5,2,8,1,6};
		printArray(testArray);
		selectionSort(testArray);
		printArray(testArray);
	}
	
	/**
	 * En metod som byter plats p� tv� v�rden i arrayen
	 * 
	 * @param array - en int-array att skicka in
	 * @param firstPos - f�rsta positionen att g�ra ett byte p�
	 * @param secondPos - andra positionen att g�selectiora bytet med
	 */
	public static void swap(int [] array, int firstPos, int secondPos)
	{
		int temp;
		temp = array [firstPos];
		array[firstPos] = array[secondPos];
		array[secondPos] = temp;
	}
	
	/**
	 * Linjning efter minsta talets position
	 * @param array - en int-array att s�ka i
	 * @param startPos - vart i arrayen s�kningen ska b�rja, anv�nds f�r
	 * att inte s�ka igenom alla platser
	 * @return position - positionen (indexet) f�r minsta talet
	 */
	public static int liniarSearch(int [] array, int startPos)
	{
		int smallestPos = startPos;
		for(int index = startPos;index < array.length; index++)
		{
			if (array[index] < array[smallestPos])
			{
				smallestPos = index;
			}
		}
		return smallestPos; //ska bytas ut
	}
	
	/**
	 * Urvalssortering (selectionsort) som sorterar en int-array i stigande ordning
	 * @param array - en int-array att skicka in till metoden
	 */
	public static void selectionSort(int[] array)
	{
		for (int i = 0; i < array.length; i++){
			int index = liniarSearch(array, i );
			swap(array,i,index);
		}
	}
	
	public static void printArray(int [] array)
	{
		for(int n : array)
		{
			System.out.print(n + " ");
		}
		System.out.println();
	}
}