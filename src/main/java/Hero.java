import java.util.ArrayList;
import java.util.Scanner;

public class Hero {

    private String name;
    private String role;
    private ArrayList<Stats> stats = new ArrayList<Stats>();
    Scanner scanner = new Scanner(System.in);
    private boolean exit =false;
    private boolean exit2 = false;


    public Hero(){
        name = "";
        role = "";
    }

    public Hero(String name, String role){
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void addStats(String eliminations, String dmgDealt, String healingDone, String deaths){
        stats.add(new Stats(eliminations,dmgDealt,healingDone,deaths));
    }

    public Stats getStats(int index){
        return stats.get(index);
    }

    public void printHero(){
        System.out.println("Hero name: " + name + "\n" +
                "Hero role: " + role);
    }

    public void printStats(){
        for (int i = 0; i < stats.size(); i++){
            System.out.println("The hero's stats for game " + (i+1) +" are: "+
                    "eliminations: " + stats.get(i).getEliminations() + "\n" +
                    "Damage Dealt: " + stats.get(i).getDmgDealt()+ "\n"+
                    "Healing Done: " + stats.get(i).getHealingDone() + "\n"+
                    "Deaths: " + stats.get(i).getDeaths()+ "\n");

        }

    }

    public void editStats(){
        while (exit == false){
            System.out.println("Would you like to remove stats for a game? (Y/N)");
            String input;
            input = scanner.nextLine();
            if (input.equals("N")){
                exit = true;
            }
            else {
                System.out.println("Which game would you like to remove?");

                int gameSelect;
                gameSelect = scanner.nextInt();
                for (int i = 0; i< stats.size();i++){
                    if (i == gameSelect -1){
                        stats.remove(i);
                        System.out.println("Game " + gameSelect + " has been removed.");
                    }
                    else {
                        exit =true;
                    }
                }



            }

        }

    }


    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", stats=" + stats +
                '}';
    }
}
