package DeadlockExample;

import java.util.List;
import java.util.ArrayList;

class Player {
    private Integer age;
    private String name;

    public Player(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println("Name = " + this.name + " Age = " + this.age);
    }
}

class Team {
    private String nameOfTeam;
    private List<Player> players;

    public Team(String nameOfTeam) {
        this.nameOfTeam = nameOfTeam;
        this.players = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public int getSizeOfTeam() {
        return this.players.size();
    }

    public void displayTeamDetails() {
        System.out.println("Name of Team = " + this.nameOfTeam);
        System.out.println("Size of Team = " + this.getSizeOfTeam());
        if (!this.players.isEmpty()) {
            System.out.println("List of Players:");
            this.players.forEach(Player::display);
        }
    }
}

public class AggregationExmaple {
    public static void main(String[] args) {
        Team india = new Team("INDIA");
        india.addPlayer(new Player(22, "Rohan"));
        india.addPlayer(new Player(23, "Ram"));
        india.displayTeamDetails();
    }
}
