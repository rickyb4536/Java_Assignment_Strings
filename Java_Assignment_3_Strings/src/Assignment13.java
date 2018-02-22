public class Assignment13 {

	public static void main(String[] args) {
		String one = " ";
		String two = " ";
		
		
		//check if strings are exactly the same
		if (one.equals(two)) {
			System.out.println("The strings are equal and not anagrams");
			System.exit(0);
		}
		if (one.length() != two.length()){
			System.out.println("The strings are different lengths");
			System.exit(0);
		}
		
		
		int[] map = new int[one.length()];
		//initialize array to -1 values
		for (int i = 0; i < map.length; i++){
			map[i] = -1;
		}
		
		//loop through letters of 1st and check if they are in the 2nd
		for (int i = 0; i < one.length(); i++){
			char c = one.charAt(i);
			
			int index = two.indexOf(c);
			
			//if index is -1 the letter is not in the first
			if (index == -1){
				System.out.println("The strings are not anagrams");
				System.exit(0);
			}
			
			//loop through array if present, if so, update by one and try again
			for (int j = 0; j < map.length; j++){
				
				//check if duplicate letter
				if (map[j] == index){
					index = two.indexOf(c, index + 1);
					
					
					
					if (index == -1){
						System.out.println("the strings are not anagrams");
						System.exit(0);
					}
					
					continue;
				}
				
				
			}
			
			//store current index in map
			map[i] = index;
		}
		
		System.out.println("The strings are anagrams!");
	}
}