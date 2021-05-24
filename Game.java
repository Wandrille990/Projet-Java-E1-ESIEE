import pkg_engine.UserInterface;
import pkg_engine.GameEngine;

/**
 * La classe Game s'occupe de lancer l'engine du jeu et son interface.
 * 
 * @author Wandrille Legras
 * @version 2021
 */
public class Game
{
    private UserInterface aGui;
    private GameEngine aEngine;

    /**
     * Create the game and initialise its internal map. Create the inerface and link to it.
     */
    public Game() 
    {
        this.aEngine = new GameEngine();
        this.aGui = new UserInterface( this.aEngine );
        this.aEngine.setGUI( this.aGui );
    }
}