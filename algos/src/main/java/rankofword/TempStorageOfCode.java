package rankofword;

public class TempStorageOfCode {
	/*
	public class Solution {

	    /*Maths approach
	    
	    public static int findRank(String naam) {
	        
	        int length = naam.length();
	        int []rank = rankArray(naam); 
	        int []repetition = calcRepitition(naam);
	        
	        int sum = 0;
	        for(int i=length-1;i>=0;i--) {
	            int again = 1;
	            ArrayList<Character> chars = nonRepeatList(naam);
	            
	            for(int j=length-i-1;j<length;j++) {
	                if(chars.contains(naam.charAt(j))){
	                    again *= factorial(repetition[j]+1);
	                    //again = (int) (again * (factorial(repetition[j]+1)% 1000003))% 1000003;
	                    chars.remove((Character)naam.charAt(j));
	                }
	            }
	            sum = (sum + (int) ((factorial(i)*rank[length-i-1])/again) % 1000003) % 1000003;
	        }
	        
	        return (sum+1) % 1000003;
	        
	    }
	    
	    public static int[] calcRepitition(String naam) {
	        int length = naam.length();
	        int []repetition = new int[length]; 
	        
	        for(int i=0;i<length;i++){
	            int repeat = 0;
	            for(int j=i+1;j<length;j++){
	                if(naam.charAt(i) == naam.charAt(j))
	                    repeat++;
	            }
	            repetition[i] = repeat;
	        }
	        
	        return repetition;
	    }

	    public static int[] rankArray(String naam) {
	        
	        int length = naam.length();
	        int []rank = new int[length]; 
	        for(int i=0;i<length;i++){
	            int count = 0;
	            for(int j=i+1;j<length;j++){
	                if(naam.charAt(i) > naam.charAt(j))
	                    count++;
	            }
	            rank[i] = count;
	        }
	        return rank;
	    }
	    
	    public static long factorial(int number) {
	        long result = 1;
	        for (int factor = 2; factor <= number; factor++) 
	            result = (result * (factor % 1000003)) % 1000003;
	        return result;
	    }
	    
	    public static ArrayList<Character> nonRepeatList(String naam) {
	        ArrayList<Character> chars = new ArrayList<Character>();
	        for (char c : naam.toCharArray()) 
	          chars.add(c);
	        
	        Set<Character> set = new HashSet<Character>(chars);
	        chars.clear();
	        chars.addAll(set);
	        
	        return chars;
	    }
	}





	/*eclipseee waalaaa code 

	package rankofword;

	public class Solution {
	    
	    
	    public static void main(String[] args) {
	        System.out.println(findRank("ashish"));
	    }

	    ///////////////////////////////////Maths approach
	    
	    private static int findRank(String naam) {
	        
	        int length = naam.length();
	        int []rank = rankArray(naam); 
	        int []repetition = calcRepitition(naam);
	        
	        int sum = 0;
	        for(int i=length-1;i>=0;i--) {
	            int again = 1;
	            for(int j=length-i-1;j<length;j++) {
	                again *= factorial(repetition[j]+1);
	            }
	            sum += ((factorial(i)*rank[length-i-1])/again);
	        }
	        
	        return (sum+1) % 1000003;
	        
	    }
	    
	    private static int[] calcRepitition(String naam) {
	        int length = naam.length();
	        int []repetition = new int[length]; 
	        
	        for(int i=0;i<length;i++){
	            int repeat = 0;
	            for(int j=i+1;j<length;j++){
	                if(naam.charAt(i) == naam.charAt(j))
	                    repeat++;
	            }
	            repetition[i] = repeat;
	        }
	        
	        return repetition;
	    }

	    private static int[] rankArray(String naam) {
	        
	        int length = naam.length();
	        int []rank = new int[length]; 
	        for(int i=0;i<length;i++){
	            int count = 0;
	            for(int j=i+1;j<length;j++){
	                if(naam.charAt(i) > naam.charAt(j))
	                    count++;
	            }
	            rank[i] = count;
	        }
	        return rank;
	    }
	    
	    public static long factorial(int number) {
	        long result = 1;
	        for (int factor = 2; factor <= number; factor++) 
	            result *= factor;
	        return result;
	    }
	    
	    
	//////////-------------------------------------------------////////////////////
	    /*   blessing approach
	    public static int findRank(String A) {
	        
	        int length = A.length();
	        int []rank = new int[length]; 
	        for(int i=0;i<length;i++){
	            int count = 0,duplicate = 0;
	            for(int j=i;j<length;j++){
	                if(A.charAt(i) > A.charAt(j))
	                    count++;
	            }
	            rank[i] = count;
	        }
	        
	        
	        Map<Character,Integer> map = new HashMap<Character,Integer>();
	        for (int i = 0; i < length; i++) {
	          char c = A.charAt(i);
	          if (map.containsKey(c)) {
	            int cnt = map.get(c);
	            map.put(c, ++cnt);
	          } else {
	            map.put(c, 1);
	          }
	        }
	        
	        
	        for(int i=0;i<length;i++) {
	            
	        }
	        
	        return length;
	        
	    }
	}
	*/

	/*************************    nii horaa haiii ******************
	"sadasdsasassasas"

	Your function returned the following :
	356
	The expected returned value :
	208526
	*//////////////////////////////
	
	/*************************    nii horaa haiii ******************
	Your submission failed for the following input:
		A : "asasdsdsadasdadsadasdsa"
		Your function returned the following :
		688044
		The expected returned value :
		502900
	*//////////////////////////////
	
	    

}
