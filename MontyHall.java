import java.util.Random;
public class MontyHall{
	
	public static void main(String[] args){
		int wins = 0;
		int losses = 0;
		for(int i=0; i < 10000; i++){
			if(playGame()) wins++;
			else losses++;
		}
		System.out.printf("Wins: %d / Losses: %d", wins, losses);
	}

	public static boolean playGame(){
		return (new Random().nextInt(3) != new Random().nextInt(3));
	}
}