//import league_settings;
//import league_table;

public class league {

    public static void main(String[] args) {
        league_settings league_s = new league_settings();

        // set number of teams
        league_s.setTeamsNum(4);
        System.out.println("Number of teams = " + league_s.getTeamsNum());
        // set names of the teams
        String teams_available[] = { "Barcelona  ", "Real Madrid", "Liverpool  ", "Ahly       ", "Zamalek    " };
        for (int i = 0; i < league_s.getTeamsNum(); i++) {
            league_s.setTeamName(i, teams_available[i]);
        }

        for (int i = 0; i < league_s.getTeamsNum(); i++) {
            System.out.println("Names of team " + (i + 1) + " = " + league_s.getTeamsName(i));
        }

        // set number of matches for the team
        league_s.setTeamMatchesNum((league_s.getTeamsNum() - 1));
        System.out.println("Number of matches for one team = " + league_s.getTeamMatchesNum());

        // set matches of the tournment
        league_s.setMatchesNum((league_s.getTeamsNum() - 1) * league_s.getTeamsNum() / 2);
        System.out.println("Number of matches in league= " + league_s.getMatchesNum());


         league_table lt = new league_table();

         lt.setMatchDetails();
         lt.print_matches();
         lt.setScores();
         lt.print_table();

    }
}
