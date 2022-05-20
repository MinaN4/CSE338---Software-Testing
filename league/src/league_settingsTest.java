import org.junit.Test;

import static org.junit.Assert.*;

public class league_settingsTest {
    league_settings ls = new league_settings();
    @Test
    public void getTeamsNum() {
        ls.setTeamsNum(5);
        assertEquals(5,ls.getTeamsNum());
    }

    @Test
    public void getTeamsName() {
        String names[] = { "Barcelona  ", "Real Madrid", "Liverpool  ", "Ahly       ", "Zamalek    " };
//        ls.setTeamName();
        for (int i = 0; i < ls.getTeamsNum(); i++) {
            ls.setTeamName(i, names[i]);
        }
        for (int i = 0; i < ls.getTeamsNum(); i++) {
            ls.setTeamName(i, names[i]);
            assertEquals(names[i],ls.getTeamsName(i));
        }
    }


    @Test
    public void getTeamMatchesNum() {
        ls.setTeamsNum(5);
        ls.setTeamMatchesNum(ls.getTeamsNum()-1);
        assertEquals(4,ls.getTeamMatchesNum());
    }

    @Test
    public void getMatchesNum() {
        ls.setTeamsNum(5);
        ls.setMatchesNum((ls.getTeamsNum() - 1) * ls.getTeamsNum() / 2);
        assertEquals(10,ls.getMatchesNum());
    }


//
    @Test
    public void random_goals() {
        int t=ls.random_goals();
        assertTrue(0<=t&&t<=5);
    }
}