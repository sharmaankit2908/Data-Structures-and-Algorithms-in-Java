
import java.util.ArrayList;

class TrieNode {
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

		if(child == null) {
			child = new TrieNode(word.charAt(0));
			root.children[childIndex] = child;
			root.childCount++;
		}

		add(child, word.substring(1));
	}

	public void add(String word){
		add(root, word);
	}

	private boolean search(TrieNode root, String word) {
		if(word.length() == 0) {
			return root.isTerminating;
		}

		int childIndex=word.charAt(0) - 'a';
		TrieNode child=root.children[childIndex];

		if(child == null) {
			return false;
		}

		return search(child,word.substring(1));

	}

	public boolean search(String word) {
		return search(root,word);
	}

	private void print(TrieNode root, String word) {
		if (root == null) {
			return;
		}
		
		if (root.isTerminating) {
			System.out.println(word);
		}
		
		for (TrieNode child : root.children) {
			if (child == null) {
				continue;
			}
			String fwd = word + child.data;
			print(child, fwd);
		}
	}
	
	public void print() {
		print(this.root, "");
	}





	/*..................... Palindrome Pair................... */


	public boolean isPalindromePair(ArrayList<String> words) {
		//Your code goes here
		for (int i=0;i<words.size();i++){
			String reverse_word="";
			String currentword=words.get(i);
			int n=currentword.length();
			for (int j=0;j<n;j++){
				reverse_word +=currentword.charAt(n-1-j);
			}
			String added_word="";
			for(int k=0;k<n;k++){
				added_word +=reverse_word.charAt(k);
				add(added_word);
			}
			for(int m=0;m<reverse_word.length();m++){
				add(reverse_word.substring(m));
			}
		}

		boolean ans=false;
		for (int i=0;i<words.size();i++){
			String currentword=words.get(i);
			ans = (ans|| search(currentword));
		}
		return ans;
		
	}
} 