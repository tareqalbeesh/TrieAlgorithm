import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		

		
		Scanner sc =new Scanner(System.in);
		
		//input 
		String s;
		s = sc.next();
		int n;
		/// number of patterns 
		n = sc.nextInt();
		String Patterns[] = new String[n];
		for(int i=0;i<n;i++){
			Patterns[i] = sc.next();
		}
		//input end
		
		Trie T = new Trie(Patterns);
		T.printTrie();
		T.TrieMatching(s);
		
		/*
		 
panamabananas
8
banana
pan
and
nab
antena
bandanna
ananas
nana
		 
		 
		 
		 */
	
		
		
		
	}

}
