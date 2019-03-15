import java.util.LinkedList;
import java.util.Queue;

public class Trie {

	public Node root;
	
	
	Trie(String [] Patterns)
	{
		this.root = new Node('!',null);
		Node curr_node;
		for(int i=0;i<Patterns.length;i++)
		{
			curr_node= root;
			String curr_pattern = Patterns[i];
			for(int j=0;j<curr_pattern.length();j++)
			{
				char curr_char = curr_pattern.charAt(j);
				Node temp=null;
				temp = curr_node.give_me_this(curr_char);
				if(temp!=null)
				{
					curr_node = temp;
				}
				else 
				{
					curr_node.add_this(curr_char,curr_node);
					curr_node = curr_node.give_me_this(curr_char);
				}
			}
		}
	}
	void printTrie()
	{
		
		Node curr_node = root;
		Queue <Node> q = new LinkedList<>();
		q.add(curr_node);
		while(!q.isEmpty())
		{
			curr_node = q.poll();
			if(curr_node.parent!=null)
			System.out.println(curr_node.value + " from " +  curr_node.parent.value);
			q.addAll(curr_node.Children);
		}
		
	}
		
	boolean PrefixTrieMatching(String s)
	{
		//System.out.println("@" + s);
		int i=0;
		char curr_char = s.charAt(0);
		Node curr_node = root;
		String S ="" ;
		while(true)
		{
			
			if(curr_node.is_leaf())
			{
				System.out.println(S);
				return true;
			}
			else if(curr_node.give_me_this(curr_char)!=null)
			{
				S+=curr_char;
				curr_node = curr_node.give_me_this(curr_char);
				i++;
				if(curr_node.is_leaf())
				{
					System.out.println(S);
					return true ;
				}
				curr_char=s.charAt(i);
			}
			
			else 
				return false;	
		}
		
	}
	void TrieMatching(String s)
	{
		while(s.length()!=0)
		{
			
			boolean res = this.PrefixTrieMatching(s);	
			if(s.equals("nana"))
			{
				System.out.println(res);
			}
			s = s.substring(1,s.length());
		}
	}
	
	
}
