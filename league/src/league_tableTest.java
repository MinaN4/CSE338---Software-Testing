import org.junit.Test;

import static org.junit.Assert.*;

public class league_tableTest {
    league_table lt = new league_table();
    @Test
    public void setScores() {

        lt.setScores();
        lt.print_matches();

    }
    @Test
    public void getMatchDetails() {
        String team1="barca";
        String team2="real";
        String st = team1 + ":" + team2+":"+"1"+":"+"2" ;
        String[] exp={"barca","real","1","2"};
        String[] rt = lt.getMatchDetails(st);
        assertArrayEquals(exp,rt);
    }
    @Test
    public void random_goals() {
        int t=lt.random_goals();
        assertTrue(0<=t&&t<=5);
    }

}