package aston.test.entity;

import java.util.ArrayList;
import java.util.List;

public class Team <T extends Participant> {
    private String teamName;
    private List <T> team = new ArrayList<>();

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public List<T> getTeam() {
        return team;
    }

    public void setTeam(List<T> team) {
        this.team = team;
    }

    public void addPlayer (T player) {
        team.add(player);
        System.out.println("Player added - " + player.getName());
    }
}
