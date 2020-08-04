public class TennisGame2 {
    public int player1point = 0;
    public int player2point = 0;

    private String player1Response = "";
    private String player2Response = "";
    private String player1Name;
    private String player2Name;

    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String defaultmatchpoint(int playerScore){
        switch (playerScore){
            case 0:
                return "Love";
            case 1:
                return "Fifteen";
            case 2:
                return "Thirty";
        }
        return "Forty";
    }

    public String getScore(){
        String score = "";
        if (player1point == player2point && player1point < 4)
        {
            score += defaultmatchpoint(player1point);
            score += "-All";
        }
        if (player1point==player2point && player1point>=3)
            score = "Deuce";

        if (player1point > 0 && player2point==0)
        {
            player1Response = defaultmatchpoint(player1point);
            player2Response = "Love";
            score = player1Response + "-" + player2Response;
        }
        if (player2point > 0 && player1point==0)
        {
            player2Response = defaultmatchpoint(player2point);
            player1Response = "Love";
            score = player1Response + "-" + player2Response;
        }

        if (player1point!=player2point && player1point < 4)
        {
            player1Response = defaultmatchpoint(player1point);
            player2Response = defaultmatchpoint(player2point);
            score = player1Response + "-" + player2Response;
        }

        if (player1point > player2point && player2point >= 3)
        {
            score = "Advantage player1";
        }

        if (player2point > player1point && player1point >= 3)
        {
            score = "Advantage player2";
        }

        if (player1point>=4 && player2point>=0 && (player1point-player2point)>=2)
        {
            score = "Win for player1";
        }
        if (player2point>=4 && player1point>=0 && (player2point-player1point)>=2)
        {
            score = "Win for player2";
        }
        return score;
    }

    public void P1Score(){
        player1point++;
    }

    public void P2Score(){
        player2point++;
    }

    public void wonPoint(String player) {
        if (player.equals("player1"))
            P1Score();
        else
            P2Score();
    }
}