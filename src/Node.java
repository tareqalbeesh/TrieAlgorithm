import java.util.ArrayList;

public class Node {

	
	ArrayList <Node> Children = new ArrayList<>();
	public char value ;
	public Node parent;
	
	Node(char value,Node parent)
	{
		this.value = value;
		this.parent=parent;
	}

	void add_this(char c,Node parent)
	{
		Children.add(new Node(c,parent));
	}
	Node give_me_this(char c)
	{
		for(int i=0;i<Children.size();i++)
		{
			if(Children.get(i).value == c)
				return Children.get(i);
		}
		return null;
	}
	boolean is_leaf()
	{
		if(Children.isEmpty())
			return true;
		return false;
	}
	
	
}
