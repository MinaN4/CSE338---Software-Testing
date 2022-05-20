public class league_table extends league_settings {
    public static int points[] = new int[getTeamsNum()];
    public static int goalDiff[] = new int[getTeamsNum()];
    public static int matchPlayed[] = new int[getTeamsNum()];
    public static int goalf[] = new int[getTeamsNum()];
    public static int goala[] = new int[getTeamsNum()];
    public static String[] matches_available = new String[getMatchesNum()];
    public static int team1_goals[] = new int[getMatchesNum()];
    public static int team2_goals[] = new int[getMatchesNum()];
    // Getting match details
    public void setMatchDetails() {
        int x = 1;
//        int t1_goals[] = new int[getMatchesNum()];
//        int t2_goals[] = new int[getMatchesNum()];
//        String[] matches_available = new String[getMatchesNum()];
        for (int i = 0; i < getTeamsNum(); i++) { // teams
            for (int j = i + 1; j < getTeamsNum(); j++) {// matches per team
//                t1_goals[x - 1] = random_goals();
//                t2_goals[x - 1] = random_goals();
//                matches_available[x - 1] = getTeamsName(i) + ":" + getTeamsName(j);
//                x++;
                team1_goals[x - 1] = random_goals();
                team2_goals[x - 1] = random_goals();
                matches_available[x - 1] = getTeamsName(i) + ":" + getTeamsName(j);
                x++;
            }
        }
    }

    public static String[] getMatchDetails(String match) {
        String data = match;
        // System.out.println(data);
        String[] data2 = data.split(":");
        return data2;

    }
    public void setScores() {
        String[] matchDetails = new String[getMatchesNum()];
        String team1, team2;

        int team1_state, team2_state;
        int win = 3, draw = 1, lose = 0;
        int y = 1;
        // calculating table points for each team
        for (int i = 0; i < getTeamsNum(); i++) { // teams
            for (int j = i + 1; j < getTeamsNum(); j++) {// matches per team
                matchDetails = getMatchDetails(matches_available[y - 1]);
                team1 = matchDetails[0];
                team2 = matchDetails[1];

                if (team1_goals[y - 1] > team2_goals[y - 1]) {
                    team1_state = win;
                    team2_state = lose;
                } else if (team2_goals[y - 1] > team1_goals[y - 1]) {
                    team1_state = lose;
                    team2_state = win;
                } else {
                    team1_state = draw;
                    team2_state = draw;
                }
                for (int k = 0; k < getTeamsNum(); k++) {
                    if (team1.equals(getTeamsName(k))) {// team1.equals(getTeamsName(k)) if (team1 ==
                                                                 // getTeamsName(k))
                        matchPlayed[k] += 1;
                        points[k] += team1_state;
                        goalf[k] += team1_goals[y - 1];
                        goala[k] += team2_goals[y - 1];
                        goalDiff[k] += team1_goals[y - 1] - team2_goals[y - 1];
                    } else if (team2.equals(getTeamsName(k))) {
                        matchPlayed[k] += 1;
                        points[k] += team2_state;
                        goalf[k] += team2_goals[y - 1];
                        goala[k] += team1_goals[y - 1];
                        goalDiff[k] += team2_goals[j] - team1_goals[y - 1];
                    }

                }
                y++;
            }
        }
    }
    public void print_matches() {
        int x = 1;
        for (int i = 0; i < getTeamsNum(); i++) { // teams
            for (int j = i + 1; j < getTeamsNum(); j++) {// matches per team
//                team1_goals[x - 1] = random_goals();
//                team2_goals[x - 1] = random_goals();
//                matches_available[x - 1] = getTeamsName(i) + ":" + getTeamsName(j);
                System.out.println("Match " + x + " = " + matches_available[x - 1] + "\t\t" + team1_goals[x - 1] + " : "
                        + team2_goals[x - 1]);
                x++;
            }
        }
    }
    public void print_table() {
        // Printing Table
        System.out.println(
                "Name       " + "\t\t" + "  Match" + "\t" + "  GoalF" + "\t" + "  GoalA" + "\t" + "    GD" +
                        "\t" + "  Points");

        for (int i = 0; i < getTeamsNum(); i++) {
            System.out.println(
                    getTeamsName(i) + "\t\t\t" + matchPlayed[i] + "\t\t" + goalf[i] + "\t\t" + goala[i]
                            + "\t\t" + goalDiff[i]
                            + "\t\t"
                            + points[i]);
        }
    }
}
