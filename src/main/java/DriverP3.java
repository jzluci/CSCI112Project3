/*
Name: James Zachary Luci
Current Date: 10/19/2022
Sources Consulted: Referenced lecture notes and labs. Talked with my classmate Jaysun to work through some of the logic and decision making.
We did not copy or share code.

By submitting this work, I attest that it is my original work and that I did
not violate the University of Mississippi academic policies set forth in the
M book.
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DriverP3 {
    public static void main(String[] args) throws FileNotFoundException {

        boolean exit = false;
        int counter = -1;
        File file = new File("C:\\Users\\snowp\\IdeaProjects\\Project3\\src\\main\\java\\GameData.txt");
        Scanner scanner = new Scanner(file);
        Scanner tempScanner = new Scanner(System.in);
        Team team = new Team("Cloud 9");

        while (scanner.hasNextLine()){
            String line  = scanner.nextLine();
            String[] tokens = line.trim().split(",");
            if (tokens.length == 3){ //players
                team.addPlayer(tokens[0], tokens[1], tokens[2]);
                counter++;
            }
            else if (tokens.length ==2){//hero
                team.addHero(tokens[0],tokens[1],counter);
            }
            else if (tokens.length==4){//stats
                team.addStats(counter,tokens[0],tokens[1],tokens[2],tokens[3]);
            }

        }
        scanner.close();

        System.out.println("Welcome to the Overwatch League Team Library. Here you can find and modify teams, rosters, players, heroes, and statistics." +
                "The team name is " + team.getName());
        while (exit==false){
            System.out.println("Would you like to edit any existing entries? (Y/N): ");
            String input;
            input = tempScanner.nextLine();
            if (input.equals("Y")){
                System.out.println("Would you like to modify the team name? (Y/N): ");
                input = tempScanner.nextLine();
                if (input.equals("Y")){
                    System.out.println("What would you like to change the team name to?");
                    String newTeamName;
                    newTeamName = tempScanner.nextLine();
                    team.setName(newTeamName);
                    System.out.println("Team name is now: " + team.getName());
                    team.editPlayer();
                }
                else if (input.equals("N")){
                    System.out.println("Would you like to modify the players, heroes, or stats? (Y/N): ");
                    String input2;
                    input2 = tempScanner.nextLine();
                    if (input2.equals("Y")) {
                        team.editPlayer();
                    }
                    else {
                        System.out.println("How many times would you like to print out the team and the player stats? ");
                        int printCount;
                        printCount = tempScanner.nextInt();
                        if (printCount == 0){
                            exit = true;
                        }
                        else {
                            for (int i = 0; i<printCount;i++){
                                team.printTeam();
                            }
                        }
                    }
                }
            }
            else {
                System.out.println("How many times would you like to print out the team and the player stats? ");
                int printCount;
                printCount = tempScanner.nextInt();
                if (printCount == 0){
                    exit = true;
                }
                else {
                    for (int i = 0; i<printCount;i++){
                        team.printTeam();
                    }
                }
            }
            exit = true;
        }

    }

}
