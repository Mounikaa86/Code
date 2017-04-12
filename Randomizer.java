import java.util.Queue;

public class Randomizer {
	
	public static void main(String[] args) {
		
		
		PrimeRandomizer obj = new PrimeRandomizer();
		
		Queue<PrimeInfo> finalQueue = obj.primeRandomgenerator();
		
		
		for(PrimeInfo info : finalQueue) {
			System.out.println(info.getNumber()+ ":::" +info.getPrime());
		}
	}

}
