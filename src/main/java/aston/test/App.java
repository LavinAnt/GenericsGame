package aston.test;

import aston.test.entity.Children;
import aston.test.entity.Participant;
import aston.test.entity.Team;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Children natal = new Children(34, "Natal");
        Children antone = new Children(33, "Antone");
        Children var = new Children(7, "Var");
        Team<Participant> team = new Team<>("GOOD BOYS");
        team.addPlayer(natal);
        team.addPlayer(antone);
        team.addPlayer(var);
    }
}
