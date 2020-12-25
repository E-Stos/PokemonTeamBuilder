package p;
import java.util.List;
import java.util.ArrayList;

/**
 * This class defines the constructors
 * and methods for a pre-evolved Pokemon.
 * 
 * @author Evan Stosic
 * @version 12.21.20
 *
 */
public class Pokemon
{
// Fields
	private String name;
	private String type1;
	private String type2;
	private String evol;
	private List<Move> moveset;
	
// Constructors
	/**
	 * This method instantiates a Pokemon with
	 * a name and its types
	 * @param name	The name of the Pokemon
	 * @param type1	The primary type
	 * @param type2	The secondary type
	 * @param evol	Pre-evolution
	 */
	public Pokemon(String name, String type1, String type2, String evol)
	{
		this.name = name;
		this.type1 = type1;
		this.type2 = type2;
		this.evol = evol;
		moveset = new ArrayList<Move>();
	}
	
// Methods
	/**
	 * Returns the name of the Pokemon
	 * @return The name of the Pokemon
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Returns the primary type of the Pokemon
	 * @return The primary type of the Pokemon
	 */
	public String getType1()
	{
		return type1;
	}
	
	/**
	 * Returns the secondary type of the Pokemon
	 * @return The secondary type, or "none" if there
	 * is no secondary type
	 */
	public String getType2()
	{
		return type2;
	}
	
	/**
	 * Returns the pre-evolution of the Pokemon
	 * @return The pre-evolution, or "none" if
	 * one does not exist
	 */
	public String getEvol()
	{
		return evol;
	}
	
	/**
	 * Returns the moveset of the Pokemon
	 * @return	The moveset
	 */
	public List<Move> getMoveset()
	{
		return (moveset);
	}
	
	/**
	 * Sets the primary type
	 * @param t	The new type
	 */
	public void setType1(String t)
	{
		this.type1 = t;
	}
	
	/**
	 * Sets the secondary type
	 * @param t	The new type
	 */
	public void setType2(String t)
	{
		this.type2 = t;
	}
	
	/**
	 * Sets the pre-evolution
	 * @param t	The pre-evolution
	 */
	public void setEvol(String e)
	{
		this.evol = e;
	}
	
	/**
	 * Adds a move to a Pokemon's moveset
	 * @param m	The new move
	 */
	public void addMove(Move m)
	{
		moveset.add(m);
	}
}
