/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soccer;

/**
 *
 * @author Conrad
 */
public class League {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        League theLeague = new League();
        
        Team[] theTeams = createTeams();
        Game[] theGames = theLeague.createGames(theTeams);
        
        
        for (Game currGame: theGames) {
        
        currGame.playGame();
        
        System.out.println(currGame.getDescription());
        }
    }

    public static Team[] createTeams() {

        Player player1 = new Player("George Eliot");
        //player1.setPlayerName("George Eliot");
        Player player2 = new Player("Graham Green");
        //player2.setPlayerName("Graham Greene");
        Player player3 = new Player("Geoffrey Chaucer");
        //player3.setPlayerName("Geoffrey Chaucer");
        Player[] thePlayers = {player1, player2, player3};

        Team team1 = new Team("The Greens", thePlayers);
        //team1.setTeamName("The Greens");
        //team1.setPlayerArray(thePlayers);

        
        //Create Team 2:
        Team team2 = new Team();
        team2.setTeamName("The Reds");
        team2.setPlayerArray(new Player[3]);
        
        team2.getPlayerArray()[0] = new Player("Robert Service");
        //team2.getPlayerArray()[0].setPlayerName("Robert Service");
        team2.getPlayerArray()[1] = new Player("Robbie Burns");
        //team2.getPlayerArray()[1].setPlayerName("Robbie Burns");
        team2.getPlayerArray()[2] = new Player("Rafael Sabatini");
        //team2.getPlayerArray()[2].setPlayerName("Rafael Sabatini");

        Team[] theTeams = {team1, team2};
        return theTeams;
    }

    public Game[] createGames(Team[] theTeams) {
        Game theGame = new Game(theTeams[0], theTeams[1]);
        Game theGame2 = new Game(theTeams[1], theTeams[0]);
        Game theGame3 = new Game(theTeams[0], theTeams[1]);
        Game theGame4 = new Game(theTeams[1], theTeams[0]);
        
        Game[] theGames = {theGame, theGame2, theGame3, theGame4};
        return theGames;
    }

}
