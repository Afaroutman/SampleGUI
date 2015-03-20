package GUI.model;

public class Monster implements Comparable
{

	private String name;
	private int weakFire;
	private boolean breakTail;
	
	public Monster(String name, int weakFire, boolean breakTail)
	{
		this.name = name;
		this.weakFire = weakFire;
		this.breakTail = breakTail;
	}

	public String getName()
	{
		return name;
	}

	public int getWeakFire()
	{
		return weakFire;
	}

	public boolean getBreakTail()
	{
		return breakTail;
	}
	
	@Override
	public String toString()
	{
		
		String monsterString = "";
		monsterString += "Hi, Im going to eat you in three seconds, #rekt " + name + ".";
		monsterString += " don't hit me with fire lvl " + weakFire + " and ";
		if(breakTail)
		{
			monsterString += " You cut off my tail.";
		}
		else
		{
			monsterString += " You cant cut my tail off";
		}
		return monsterString;
	}
	/**
	 * Compares Monster objects on the basis of the Fire weakness level of the monster. The 
	 * greater the Fire Weaknes, the better the monster.
	 * If the com[ared object is NOT a monster the comparison automatically returs Integer.MIN_VALUE.
	 * @param otherMonster A supplied object, should be of Monster type.
	 * @return A compared value for the otherMonster in relation to this Monster object.
	 */
	public int compareTo(Object otherMonster)
	{
		int comparedValue = 0;
		
		
		if(otherMonster instanceof Monster)
		{
			
			if(this.weakFire > ((Monster) otherMonster).getWeakFire() )
			{
				comparedValue = -1;
			}
			else if(this.weakFire < ((Monster) otherMonster).getWeakFire() )
			{
				comparedValue = 1;
			}
		}
		else
		{
			comparedValue = Integer.MIN_VALUE;
		}
		
		
		return comparedValue;
	}
}
