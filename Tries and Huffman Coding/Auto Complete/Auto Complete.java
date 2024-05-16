import java.util.*;

class TrieNode{
	char data;
	boolean isTerminating;
	TrieNode children[];
	int childCount;

	public TrieNode(char data) {
		this.data = data;
		isTerminating = false;
		children = new TrieNode[26];
		childCount = 0;
	}
}

public class Trie {
	private TrieNode root;
	public int count;
	public Trie() {
		root = new TrieNode('\0');
	}

	private void add(TrieNode root, String word){
		if(word.length() == 0){
			root.isTerminating = true;
			return;
		}		
		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
		if(child == null){
			child = new TrieNode(word.charAt(0));
			root.children[childIndex] = child;
			root.childCount++;
		}
		add(child, word.substring(1));
	}
	public TrieNode find_root(TrieNode root, String word){
		if (word.isEmpty()){
			return root;
		}
		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
		if(child == null){
			return null;
		}
		return find_root(child, word.substring(1));

	} 

	public void display(TrieNode root,String word,String output) {
		if (root.isTerminating) {
			System.out.println(word+output);
		}
		for (int i = 0; i < 26; i++) {
			if (root.children[i] != null) {
				display(root.children[i], word, output+root.children[i].data);
			}
		}
	}

	public void add(String word){
		add(root, word);
	}
	
	
	public void autoComplete(ArrayList<String> input, String word) {

        // Write your code here

		for (int i=0;i<input.size();i++){
			String a=input.get(i);
			add(a);
		}
		


		TrieNode rot=find_root(root,word);
		if (rot==null){
			return;
		}
		String output="";
		if (root !=null){
			display(rot,word,output);
		}

    }

}