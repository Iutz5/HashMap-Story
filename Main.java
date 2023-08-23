/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashMapStory;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author ianut
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        HashMap<String, String> places = new HashMap<String, String>();
        HashMap<String, String[]> moves = new HashMap<String, String []>();
        
        places.put("start" , "You are in a maze");
        places.put("courtyard", "You find yourself in the middle of a big open field");
        places.put("ladder", "You find a ladder and decide to climb up it to get to the next level");
        places.put("slide", "You find a chute to go down to the floor beneath you");
        places.put("hot air balloon", "You manage to find a hot air balloon and begin to soar the skies");
        places.put("pole", "You slide down the pole and find yourself back to the start. Oh no!");
        places.put("middle", "You hit a dead end, guess you have to turn around and go back!");
        places.put("detour", "You find a detour, will it be a good one or a bad one?");
        places.put("end", "Congrats you made it to the end of the maze!");
        
        String[] startMoves = {"start", "courtyard", "ladder"};
        moves.put("start", startMoves);
        
        String[] middleMoves = {"courtyard"};
        moves.put("middle", middleMoves);
        
        String[] courtyardMoves = {"hot air balloon","start","middle"};
        moves.put("courtyard", courtyardMoves);
        
        String[] ladderMoves = {"slide","hot air balloon","middle"};
        moves.put("ladder", ladderMoves);
        
        String[] hotAirBalloonMoves = {"slide" , "pole" , "middle"};
        moves.put("hot air balloon", hotAirBalloonMoves);
        
        String[] poleMoves = {"start"};
        moves.put("pole",poleMoves);
        
        String[] slideMoves = {"courtyard" , "detour"};
        moves.put("slide", slideMoves);
        
        String[] detourMoves = {"end"};
        moves.put("detour", detourMoves);
        
        String currentRoom = "start";
        
        do {

            String story = places.get(currentRoom);
            String[] nextSteps = moves.get(currentRoom);
            System.out.println(story);
            System.out.println("Where should you go next?");
            for (int i = 0 ; i < nextSteps.length ; i++) {
                System.out.println(nextSteps[i]);
            }
            currentRoom = scanner.nextLine();
            
            
        } while(!"end".equals(currentRoom));
        System.out.println(places.get("end"));
    }
    
}
