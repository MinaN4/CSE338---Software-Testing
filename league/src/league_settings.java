public class league_settings {
    public static int TeamsNum, TeamMatchesNum, MatchesNum;
    public static String[] names = new String[36];

    // Identifing Teams Number
    public static int getTeamsNum() {
        return TeamsNum;
    }

        public void setTeamsNum(int x) {
        TeamsNum = x;
    }

    // Identifing Teams Names
    public String getTeamsName(int rank) {
        return names[rank];
    }

    public void setTeamName(int rank, String name) {
        names[rank] = name;
    }

    // Identifing matches for each team in the league
    public int getTeamMatchesNum() {
        return TeamMatchesNum;
    }

    public void setTeamMatchesNum(int x) {
        TeamMatchesNum = x;
    }

    // Identifing total matches in the league
    public static int getMatchesNum() {
        return MatchesNum;
    }

    public void setMatchesNum(int x) {
        MatchesNum = x;
    }

//
//    public static String[] getMatchDetails(String match) {
//        String data = match;
//        // System.out.println(data);
//        String[] data2 = data.split(":");
//        return data2;
//
//    }
    // Seting random number for goals
    public static int random_goals() {
        int max = 5;
        int min = 0;
        int range = max - min + 1;
        int rand = (int) (Math.random() * range) + min;
        return rand;
    }
}