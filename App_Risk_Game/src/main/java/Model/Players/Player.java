package App_Risk_Game.src.main.java.Model.Players;

import App_Risk_Game.src.main.java.Model.Board.Tile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Player class representing the players and their possessions.
 *
 * @author Mutesham
 * @version 1.0
 */

public class Player {
    /**
     * Stores the player's name
     */
    private String player_name;

    /**
     * Stores the player's profile type
     */
    private String player_type;

    /**
     * Stores the player's profile type
     */
    private String player_color;

    /**
     * Stores the player's Id
     */
    private int player_id;

    /**
     * Store the list of players
     */
    public HashMap<String,Integer> territories = new HashMap<>();

    /**
     * Store the players properties
     */
    private Map properties;

    // Adding two fields continents owned and percentage of map owned
    private String continents_owned;
    private float map_controlled;

    /**
     * Creates a new player
     */
    public Player() {
        //new player creation
    }

    /**
     * Creates a player with a specific name and Id
     *
     * @param name A string to set name of the player
     * @param id   A Integer used for identifying a player
     */
    public Player(String name, int id) {
        this.player_name = name;
        this.player_id = id;

    }

    /**
     *  Constructor for player with all attributes
     * @param player_name
     * @param player_type
     * @param player_color
     * @param player_id
     * @param territories
     */
    public Player(String player_name, String player_type, String player_color, int player_id, HashMap<String, Integer> territories) {
        this.player_name = player_name;
        this.player_type = player_type;
        this.player_color = player_color;
        this.player_id = player_id;
        this.territories = territories;
    }
    /**
     * gets the player Id
     *
     * @return player Id
     */
    public int getId() {
        return player_id;
    }

    /**
     * sets the player Id
     *
     * @param id A integer for a player Id
     * @return player Id
     */
    public void setId(int id) {
        this.player_id = id;
    }

    /**
     * Sets a player name
     *
     * @param name A string for player name
     */

    public void setName(String name) {
        this.player_name = name;
    }

    /**
     * Gets a player's name
     *
     * @return player name
     */
    public String getName() {
        return player_name;
    }

    /**
     * Sets player color
     *
     * @param color A color of a particular player
     */
    public void setColor(String color) {
        this.player_color = color;
    }

    /**
     * Gets the players color
     *
     * @return color of the player
     */
    public String getColor() {
        return player_color;
    }

    /**
     * Setter method to assign player type
     *
     * @param type A string representing the player type
     */
    public void setType(String type) {
        this.player_type = type;
    }

    /**
     * Getter method to get the player type
     *
     * @return player type
     */
    public String getType() {
        return player_type;
    }

    public  void setTerritories(HashMap<String,Integer> t){
territories = t;
    }

    public  HashMap<String,Integer> getTerritories(){
        return territories;
    }

    public void setTerritory(String t, int i) {
        territories.put(t,i);
    }
}
