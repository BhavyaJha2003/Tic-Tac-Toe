import java.util.Scanner;
import board.Board;
import player.Player;
import game.Game;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("First Project -> Tic Tac Toe");

        Board b=new Board(3);
        
        b.setdefaultSymbol('-');
        b.printBoardconfig();
        
       // Scanner scn=new Scanner(System.in);
        //System.out.println("Please enter your name");
        //String name=scn.nextLine();
        //System.out.println("PLease enter your symbol");
        //char symbol=scn.nextLine().charAt(0);
       
       //p1.setPlayerDetails("Bhavya", 20, "bilasi", "8676021592", "jhab977@gmail.com", '*');
       //p1.getPlayerDetails();
       Player p1=new Player();
       p1.setPlayerNameandSymbol("Ankit",'X');
       p1.getPlayerNameandSymbol();
       Player p2=new Player();
       p2.setPlayerNameandSymbol("Bhavya", 'O');
       p2.getPlayerNameandSymbol();

       Game game=new Game(new Player[] {p1,p2},b);
       game.play();
    }
}
