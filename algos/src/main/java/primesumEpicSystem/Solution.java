package primesumEpicSystem;


import java.util.ArrayList;

public class Solution {
	
	
	public static void main(String[] args) {
		for(int i : primesum(3500) )
			System.out.println( i + " ");
	}
	
	
	    public static int[] primesum(int n) {
	        
	        int []prime = new int[n+1];
	        
	        for(int i=0;i<=n;i++)
	            prime[i] = 1;
	        
	        prime[0] = 0;
	        prime[1] = 0;
	        
	        for(int j=2;j<=n;j++)
	        {
	           boolean isPrime = true;
	           for(int i=2;i<=Math.sqrt(j);i++){
	                if(j%i == 0){
	                    isPrime = false;
	                }
	                
	            } 
	           
	           if(isPrime){
	               for(int i = 2; i*j<=n; i++){
	                   prime[i*j] = 0;
	               }
	           }
	        }
	        
	        ArrayList<Integer> primeList = new ArrayList<Integer>();
	        for(int i = 2;i<=n;i++){
	            if(prime[i] == 1)
	                primeList.add(i);
	        }
	        
	        
////////////////////////////////////
System.out.println();
for(int i : primeList )
System.out.print( i + " ");


//////////////////////////////////////////
	        
	        int []res = new int[2];
	        boolean bahar = false;
	        
	        for(int i = 2;i<=n;i++){
	            
	            if(bahar)
	                break;
	            if(prime[i]==1){
	                if(primeList.contains(n - i)){
	                    res[0] = i;
	                    res[1] = n - i;
	                    bahar = true;
	                }
	            }
	        }
	        
	        System.out.println();
	        System.out.println();
	        
	        return res;
	}

}


/*14348907
 * 
 * 16808
 * 
 * */
