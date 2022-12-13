import java.nio.Buffer;
import java.util.Scanner;

public class Player {

    private String name;
    private String gamertag;
    private String hometown;
    private Hero mainHero;
    Scanner scanner = new Scanner(System.in);
    private boolean exit = false;

    public Player(){
        name = "";
        gamertag = "";
        hometown = "";

    }

    public Player(String name, String gamertag, String hometown){
        this.name = name;
        this.gamertag = gamertag;
        this.hometown = hometown;
    }

    public void addHero(String name, String role){
        mainHero = new Hero(name, role);
    }

    public Hero getMainHero(){
        return mainHero;
    }

    public void addStats(String eliminations, String dmgDealt, String healingDone, String death){
        mainHero.addStats(eliminations,dmgDealt,healingDone,death);
    }

    public void printPlayer(){
        System.out.println("Player name: " + name + "\n"+
                "Gamertag: " + gamertag + "\n"+
                "Hometown: "+ hometown + "\n"+
                "Main Hero: "+ mainHero.getName() + "\n"+
                "Role: " + mainHero.getRole() + "\n");
        mainHero.printStats();
    }

    public void printStats(){
        mainHero.printStats();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGamertag() {
        return gamertag;
    }

    public void setGamertag(String gamertag) {
        this.gamertag = gamertag;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public Stats getStats(Hero hero, int index){
        return hero.getStats(index);
    }

    public void editHero(){
        while (exit==false){
            System.out.println("What would you like to edit about the hero? " + "\n" +
                "1) Hero name" + "\n" +
                "2) Hero role" + "\n" +
                "3) Stats"+ "\n" +
                "Enter number of choice or 'exit' to return");
            String input;
            input = scanner.nextLine();
            if (input.equals("exit")){
                exit=true;
            }
            else {
                int inputParse = Integer.parseInt(input);
                if (inputParse == 1){
                    System.out.println("What would you like to change the hero name to? ");
                    String nameChange;
                    nameChange = scanner.nextLine();
                    mainHero.setName(nameChange);
                }
                else if (inputParse == 2){
                    System.out.println("What would you like to change the hero role to? ");
                    String roleChange;
                    roleChange = scanner.nextLine();
                    mainHero.setRole(roleChange);
                }
                else if (inputParse == 3){
                    mainHero.printStats();
                    mainHero.editStats();
                }
                else {
                    System.out.println("Incorrect input please try again");
                }

            }
        }
    }


}
