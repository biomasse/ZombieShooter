import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class Game extends StateBasedGame
{
	public Game(String name) {
		super(name);
	}

	public static void main(String[] args)
	{
		try 
		{
			AppGameContainer app = new AppGameContainer(new Game("Zombie Shooter"));
			app.setDisplayMode(800, 600,  false);
			app.start();
		} 
		catch (SlickException e) 
		{
			e.printStackTrace();
		}
	}

	@Override
	public void initStatesList(GameContainer arg0) throws SlickException 
	{
		
	}
}