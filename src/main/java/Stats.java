public class Stats {

    private String eliminations;
    private String dmgDealt;
    private String healingDone;
    private String deaths;

    public Stats(){
        eliminations = "";
        dmgDealt = "";
        healingDone = "";
        deaths = "";
    }

    public Stats(String eliminations, String dmgDealt, String healingDone, String deaths){
        this.eliminations = eliminations;
        this.dmgDealt = dmgDealt;
        this.healingDone = healingDone;
        this.deaths = deaths;
    }

    public String getEliminations() {
        return eliminations;
    }

    public void setEliminations(String eliminations) {
        this.eliminations = eliminations;
    }

    public String getDmgDealt() {
        return dmgDealt;
    }

    public void setDmgDealt(String dmgDealt) {
        this.dmgDealt = dmgDealt;
    }

    public String getHealingDone() {
        return healingDone;
    }

    public void setHealingDone(String healingDone) {
        this.healingDone = healingDone;
    }

    public String getDeaths() {
        return deaths;
    }

    public void setDeaths(String deaths) {
        this.deaths = deaths;
    }

    @Override
    public String toString() {
        return "Stats{" +
                "eliminations=" + eliminations +
                ", dmgDealt=" + dmgDealt +
                ", healingDone=" + healingDone +
                ", deaths=" + deaths +
                '}';
    }
}
