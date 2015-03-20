package GUI.controller;

import GUI.model.Monster;

public class SortingMachine
{
	private long startTime;
	private long endTime;
	private long sortTime;
	private int position;
	public int partition;
	private int low;
	private int high;
	
	
	public long getSortTime()
	{
		return sortTime;
	}
	/**
	 * This is the data that is going to be sorted into time later on
	 * @param toBeSorted data that wants to be sorted
	 * @return
	 */
	public int[] selectionSort(int [] toBeSorted)
	{
		int minimum;
		int minimumPosition;
		startTime = System.currentTimeMillis();
		for(int position = 0; position < toBeSorted.length; position++)
		{
			minimumPosition = position;
			minimum = toBeSorted[position]; 
			for(int next = position +1; next < toBeSorted.length; next++)
			{
				if(toBeSorted[next] < minimum)
				{
					minimum = toBeSorted[next];
					minimumPosition = next;
				}
			}
			if(minimumPosition != position)
			{
				swap(toBeSorted, position, minimumPosition);
			}
		}
		endTime = System.currentTimeMillis();
		sortTime = endTime - startTime;
		return toBeSorted;
	}
	
	public Monster [] selectionSort(Monster [] sortTheMonsters)
	{
		int maximumPosition;
		Monster maximum;
		startTime = System.currentTimeMillis();
		for(int position = 1; position < sortTheMonsters.length; position++)
		{
			maximumPosition = position;
			maximum = sortTheMonsters[position];
			for(int next = position + 1; next < sortTheMonsters.length; next++)
			{
				if(sortTheMonsters[next].compareTo(maximum) > 0)
				{
					maximum = sortTheMonsters[next];
					maximumPosition = next;
				}
			
			}
			if(maximumPosition != position)
			{
				swap(sortTheMonsters, position, maximumPosition);
		
			}
		}
		endTime = System.currentTimeMillis();
		sortTime = endTime - startTime;

				return sortTheMonsters;
	}	
	public String[] selectionSort(String [] toBeSorted)
	{
		String minimum;
		int minimumPosition;
		startTime = System.currentTimeMillis();
		for(int position = 0; position < toBeSorted.length; position++)
		{
			minimumPosition = position;
			minimum = toBeSorted[position]; 
			for(int next = position +1; next < toBeSorted.length; next++)
			{
				if(toBeSorted[next].compareTo(minimum) < 0)
				{
					minimum = toBeSorted[next];
					minimumPosition = next;
				}
			}
			if(minimumPosition != position)
			{
				swap(toBeSorted, position, minimumPosition);
			}
		}
		
	
		endTime = System.currentTimeMillis();
		sortTime = endTime - startTime;
		return toBeSorted;
	}
	public double[] selectionSort(double [] toBeSorted)
	{
		double minimum;
		int minimumPosition;
		startTime = System.currentTimeMillis();
		for(int position = 0; position < toBeSorted.length; position++)
		{
			minimumPosition = position;
			minimum = toBeSorted[position]; 
			for(int next = position +1; next < toBeSorted.length; next++)
			{
				if(toBeSorted[next] < minimum)
				{
					minimum = toBeSorted[next];
					minimumPosition = next;
				}
			}
			if(minimumPosition != position)
			{
				swap(toBeSorted, position, minimumPosition);
			}
		}
		endTime = System.currentTimeMillis();
		sortTime = endTime - startTime;
		return toBeSorted;
	}
		private void swap(double [] array, int position, int change)
		{
			double temp = array[position];
			array[position] = array[change];
			array[change] = temp;
		}
		private void swap(String [] array, int position, int change)
		{
			String temp = array[position];
			array[position] = array[change];
			array[change] = temp;
		}
		private void swap(Monster [] array, int position, int change)
		{
			Monster temp = array[position];
			array[position] = array[change];
			array[change] = temp;
		}
	
	/**
	 * 
	 * @param array
	 * @param position
	 * @param change
	 */
	private void swap(int[] array, int position, int change)
	{
		int temp = array[position];
		array[position] = array[change];
		array[change] = temp;
	}
	/**
	 * gets Tobesorted and changes it into time
	 * @param sortTime how long it took to sort them
	 * @return
	 */
	public static String sortingTime(long sortTime)
	{
		String timeToSort = "";
		
		timeToSort += "Days: " + sortTime/(1000*60*60*24) + "\n";
		timeToSort += "Hours: " + sortTime/(1000*60*60) % 24 + "\n";
		timeToSort += "Minutes: " + sortTime/(1000*60) % 60 + "\n";
		timeToSort += "Seconds: " + sortTime/(1000) % 60 +"\n";
		timeToSort += "Milliseconds: " + sortTime % 1000 + "\n";
		return timeToSort;
	}
public int quicksort(int[] i,int minimumPosition ,int MaximumPosition)
{
	for(int position=0;position<i.length;position++ )
	{
		if(i[position] < minimumPosition)
		{
			minimumPosition=i[position];
		}
		if(i[position] > MaximumPosition)
		{
			MaximumPosition=i[position];
		}
		
	}
	
	return MaximumPosition;
}

private void swap1(int[] i, int minimumPosition, int MaximumPosition)
{
	int temp = i[minimumPosition];
	i[MaximumPosition] = i[minimumPosition];
	i[MaximumPosition] = temp;
}

}