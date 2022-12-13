import java.util.ArrayList;
import java.util.Scanner;

public class Team {

    private String name;
    private ArrayList<Player> players = new ArrayList<Player>();
    Scanner scanner = new Scanner(System.in);
    boolean exit = false;
    boolean exit2 = false;

    public Team(){
        name = "";

    }
    public Team(String name){
        this.name = name;
    }

    public void addPlayer(String name, String gamertag, String hometown){
        players.add(new Player(name,gamertag,hometown));
    }

    public void addHero(String name, String role, int index){
        players.get(index).addHero(name,role);
    }

    public Hero getHero(int index){
        return players.get(index).getMainHero();
    }



    public void addStats(int index, String eliminations, String dmgDealt, String healingDone, String deaths){
        players.get(index).addStats(eliminations,dmgDealt,healingDone,deaths);
    }

    public void printTeam(){
        System.out.println("Team name: " + name +
                "Number of players: " + players.size());
        for (int i =0; i<players.size();i++){
            players.get(i).printPlayer();
            players.get(i).printStats();
        }

    }

    public Player getPlayer(int index){
        return players.get(index);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void editPlayer(){
        System.out.println("Would you like to edit a player on this team? (Y/N): ");
        String input;
        input = scanner.nextLine();
        if (input.equals("Y")){
            while (exit == false){
                System.out.println("Players currently on team: ");
                for (int i =0;i<players.size();i++){
                    System.out.print(i + ") ");
                    players.get(i).printPlayer();
                }
                System.out.println("Which player would you like to change? (Enter the number preceding the player or enter 'exit' to quit): ");
                String inputPlayer;
                inputPlayer = scanner.nextLine();
                if (inputPlayer.equals("exit")){
                    exit = true;
                }
                else {
                    int playerChoice = Integer.parseInt(inputPlayer);
                    System.out.print(playerChoice+ ") ");
                    players.get(playerChoice).printPlayer();
                    while (exit2 == false){
                        System.out.println("What would you like to modify? "+"\n"+
                                "1) Player name "+"\n"+
                                "2) Player gamertag "+"\n"+
                                "3) Player hometown "+"\n"+
                                "4) Player main hero and stats "+ "\n" +
                                "Enter the number or enter 'exit' to quit: ");
                        String choice;
                        choice = scanner.nextLine();
                        if (choice.equals("exit")){
                            exit2 = true;
                        }
                        else {
                            int choiceParse = Integer.parseInt(choice);
                            if (choiceParse == 1){
                                System.out.println("What would you like to change the player's name to? ");
                                String newName;
                                newName = scanner.nextLine();
                                players.get(playerChoice ).setName(newName);
                                System.out.println("Player name is now: "+ players.get(playerChoice).getName());
                            }
                            else if (choiceParse ==2){
                                System.out.println("What would you like to change the player's gamertag to? ");
                                String newIGN;
                                newIGN = scanner.nextLine();
                                players.get(playerChoice).setGamertag(newIGN);
                                System.out.println("Player gamertag is now: "+ players.get(playerChoice).getGamertag());
                            }
                            else if (choiceParse == 3){
                                System.out.println("What would you like to change the player's hometown to? ");
                                String newHome;
                                newHome = scanner.nextLine();
                                players.get(playerChoice).setHometown(newHome);
                                System.out.println("Player hometown is now: "+ players.get(playerChoice).getHometown());
                            }
                            else if (choiceParse == 4){
                                players.get(playerChoice).editHero();
                            }
                        }
                    }
                }

            }
        }
    }

}
