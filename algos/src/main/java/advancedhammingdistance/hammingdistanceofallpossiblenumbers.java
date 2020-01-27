package advancedhammingdistance;

public class hammingdistanceofallpossiblenumbers {
	
	public static void main(String[] args) {
		int[] a = {4, 6};
		
			System.out.println( hammingDistance(a));
	}
	
	    public static int hammingDistance(int[] A) {
	        
//	        int l = A.length;
//	        
//	        for(int i=0;i<l;i++){
//	        	StringBuilder sb = new StringBuilder();
//	            int binary = A[i];
//	            while(binary > 0){
//	                sb.append(binary%2);
//	                binary /= 2;
//	            }
//	            
//	            A[i] = Integer.parseInt(sb.reverse().toString());
//	        }
//	        
//	        for(int i : A)
//	        		System.out.println(i);
	        
	        int parity = A[0] ^ A[1];
	        System.out.println(parity);
	        System.out.println();

	        
	        int count = 0;
	        
	        while(parity > 0) {
		        count += (parity & 1);
		        parity >>= 1;
	        }
	        
	        return count;

//	        for(int i=0;i<l;i++){
//	            for(int j=0;j<l;j++){
//	                
//	            }
//	        }
//	        
//	        System.out.println();
//			return l;
	        
	        
	        
	    }
	

}
