public class TennisGame2 {
    public int player1point = 0;
    public int player2point = 0;

    private final String player1Name;
    private final String player2Name;   

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

        boolean equalscorebutnotdeuceyet = player1point == player2point && player1point < 3;
        //เสมอแต่ยังไม่deuce
        if (equalscorebutnotdeuceyet)
        {
            return defaultmatchpoint(player1point) + "-All";
        }
        //deuce
        if (player1point==player2point && player2point>=3) {
            return "Deuce";
        }
        //1นำ2แบบcleanshhet
        if (player1point > 0 && player2point==0 && player1point < 4)
        {
            return  defaultmatchpoint(player1point)+"-Love";
        }
        //2นำ1แบบcleansheet
        if (player2point > 0 && player1point==0 && player2point < 4)
        {
            return "Love-" + defaultmatchpoint(player2point);
        }
        //1ชนะ
        if (player1point>=4 && player2point>=0 && (player1point-player2point)>=2)
        {
            return "Win for " + player1Name;
        }
        //2ชนะ
        if (player2point>=4 && player1point>=0 && (player2point-player1point)>=2)
        {
            return "Win for " + player2Name;
        }
        //1ขึ้นแท่น
        if (player1point > player2point && player2point >= 3)
        {
            return "Advantage " + player1Name;
        }
        //2ขึ้นแท่น
        if (player2point > player1point && player1point >= 3)
        {
            return "Advantage " + player2Name;
        }
        //เกมปกติ
        return defaultmatchpoint(player1point) + "-" + defaultmatchpoint(player2point);
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