package GUI.controller;
import GUI.model.Monster;
import GUI.view.SampleFrame;



public class SampleController
{
	private int [] integers;
	private double [] reals;
	private String [] words;
	private Monster [] myMonster;
	private SortingMachine mySorter;
	private int randomLetter;
	private String randomizedLetter;
	private SampleFrame baseFrame;
	
	
	public SampleController()
	{
		mySorter = new SortingMachine();
		fillTheArrays();
		baseFrame = new SampleFrame(this);
	}
	
	/**
	 * 
	 */
	public void start()
	{
		
//		System.out.println(displayTheArray(integers));
//		mySorter.selectionSort(integers);
//		System.out.println(displayTheArray(integers)); 
//		System.out.println(displayTheArray(myMonster));
//		mySorter.selectionSort(myMonster);
//		System.out.println(displayTheArray(myMonster));
//		System.out.println(displayTheArray(words));
//		mySorter.selectionSort(words);
//		System.out.println(displayTheArray(words));
//		System.out.println(displayTheArray(reals));
//		mySorter.selectionSort(reals);
//		System.out.println(displayTheArray(reals));
//		mySorter.selectionSort(integers);
//		// how long it takes to sort the items listed above
//		System.out.println("Numbers!"); 
//		System.out.println(integers);
//		System.out.println(mySorter.sortingTime(mySorter.getSortTime()));
//		mySorter.selectionSort(myMonster);
//		System.out.println("Monsters!");
//		System.out.println(myMonster);
//		System.out.println(mySorter.sortingTime(mySorter.getSortTime()));
//		mySorter.selectionSort(words);
//		System.out.println("Random Words!");
//		System.out.println(words);
//		mySorter.selectionSort(reals);
//		System.out.println("Real Numbers");
//		System.out.println(mySorter.sortingTime(mySorter.getSortTime()));
//		System.out.println(reals);	
		
	}
	


	public String displayTheArray(String [] arrayToDisplay)
	{
		String displayString = "StringArray: ";
		for(int start = 0; start < arrayToDisplay.length; start++)
		{
	
			displayString += "" + arrayToDisplay[start]+ ", ";
		}
		return displayString;
	}
	public String displayTheArray(Monster [] arrayToDisplay)
	{
		String displayMonster = "MonsterArray: ";
		for(int start = 0; start < arrayToDisplay.length; start++)
		{
			
			displayMonster += "" + arrayToDisplay[start]+ ", ";
		}
		return displayMonster;
	}

	public String displayTheArray(int [] arrayToDisplay)
	{	
		String displayint = "intArray: ";
		for(int start = 0; start < arrayToDisplay.length; start++)
		{
			displayint += "" + arrayToDisplay[start]+ ", ";
		}
		return displayint;
	}
	public int[] getIntegers()
	{
		return integers;
	}

	public double[] getReals()
	{
		return reals;
	}

	public String[] getWords()
	{
		return words;
	}

	public Monster[] getMyMonster()
	{
		return myMonster;
	}

	public int getRandomLetter()
	{
		return randomLetter;
	}

	public String getRandomizedLetter()
	{
		return randomizedLetter;
	}

	public String displayTheArray(double [] arrayToDisplay)
	{
		String displaydouble = "doubleArray: ";
		for(int start = 0; start < arrayToDisplay.length; start++)
		{
			displaydouble += "" + arrayToDisplay[start]+ ", ";
		}
		return displaydouble;
	}

	/**
	 * 
	 */
	private void fillTheArrays()
	{
		fillTheIntArray();
		fillTheDoubleArray();
		fillTheStringArray();
		fillTheMonsterArray();
	}
	/**
	 * 
	 */
	private void fillTheMonsterArray()
	{
		myMonster = new Monster[200];
		for(int index = 0;index < myMonster.length; index++)
		{
				String name = index +" Monster";
				int weakFire = (int) (Math.random() * 10);
				boolean breakTail = (weakFire%2 == 0);
				myMonster[index] = new Monster(name, weakFire, breakTail);
			}
		}
	/**
	 * 
	 */
	private void fillTheIntArray()
	{
		integers = new int[30000];
		for(int start = 0; start < integers.length; start++)
		{
			integers[start] = (int) (Math.random()* 36000);
		}
	}	
	private void fillTheStringArray()
	{
		words = new String [26];
		randomLetter = (int)(Math.random()* 26);
		if(randomLetter == 1)
			randomizedLetter = "a";
			else if(randomLetter == 2)
				randomizedLetter = "b";
		else if(randomLetter == 3)
			randomizedLetter = "c";
			else if(randomLetter == 4)
				randomizedLetter = "d";
		else if(randomLetter == 5)
			randomizedLetter = "e";
			else if(randomLetter == 6)
				randomizedLetter = "f";
		else if(randomLetter == 7)
			randomizedLetter = "g";
			else if(randomLetter == 8)
				randomizedLetter = "h";
		else if(randomLetter == 9)
			randomizedLetter = "i";
			else if(randomLetter == 10)
				randomizedLetter = "j";
		else if(randomLetter == 11)
			randomizedLetter = "k";
			else if(randomLetter == 12)
				randomizedLetter = "l";
		else if(randomLetter == 13)
			randomizedLetter = "m";
			else if(randomLetter == 14)
				randomizedLetter = "n";
		else if(randomLetter == 15)
			randomizedLetter = "o";
			else if(randomLetter == 16)
				randomizedLetter = "p";
		else if(randomLetter == 17)
			randomizedLetter = "q";
			else if(randomLetter == 18)
				randomizedLetter = "r";
		else if(randomLetter == 19)
			randomizedLetter = "s";
			else if(randomLetter == 20)
				randomizedLetter = "t";
		else if(randomLetter == 21)
			randomizedLetter = "u";
			else if(randomLetter == 22)
				randomizedLetter = "v";
		else if(randomLetter == 23)
			randomizedLetter = "w";
			else if(randomLetter == 24)
				randomizedLetter = "x";
		else if(randomLetter == 25)
			randomizedLetter = "y";
			else if(randomLetter == 26)
				randomizedLetter = "z";
		
		
		
		for(int start = 0; start < words.length; start++)
		{
			words[start] = randomizedLetter;
		}
		
	}
	
	private void fillTheDoubleArray()
	{
		reals = new double[30000];
		for(int start = 0; start < reals.length; start++)
		{
			reals[start] = Math.random()* 36000;
		}
	}

	
	
}
