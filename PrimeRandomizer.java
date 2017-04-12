import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class PrimeRandomizer {
	
	
	
	
	public Queue<PrimeInfo> primeRandomgenerator() {
		
		Queue<Integer> randomIntegers = new LinkedList<Integer>();
		Queue<PrimeInfo> result = new LinkedList<PrimeInfo>();
		Random randomGenerator = new Random();
	    for (int idx = 1; idx <= 10; ++idx){
	      int randomInt = randomGenerator.nextInt(50);
	      System.out.println(randomInt);
	      randomIntegers.add(randomInt);
	    }
	    
	    for(int value : randomIntegers) {
	    	
	    boolean isPrime =	checkPrime(value);
		PrimeInfo obj = new PrimeInfo();
	    obj.setNumber(value);
	    obj.setPrime(isPrime);
	    result.add(obj);
	   
	    }
	    return result;
	}
	
	private boolean checkPrime(int value) {
		
			int i,m=0,flag=0;    
			m=value/2;    
			for(i=2;i<=m;i++){    
				if(value%i==0){    
					flag=1;    
					break;    
				}    
		  }    
		  if(flag==0) {
			  return true;
		  } else {
			  return false;
		  }
		
	}

}

 class PrimeInfo {
	 
	 private int number;
	 public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	private boolean isPrime;
	public boolean getPrime() {
		return isPrime;
	}
	public void setPrime(boolean isPrime) {
		this.isPrime = isPrime;
	}
	 
	 
	 
 }