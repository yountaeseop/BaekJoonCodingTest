package java1991;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		System.out.println();
		
		String[] alps = sc.nextLine().split(" ");
		
	}
}

class BinaryTree {
	Node root;
	Node[] array;
 	
	public void preorder() {
		
	}

	public void inorder() {
		
	}

	public void postorder() {
		
	}
	
	public void print() {
		for(Node array : array) {
			System.out.print(array);
		}
		System.out.println();
	}
}

class Node{
	String name;
	Node left;
	Node right;
	
	public Node(String name, Node left, Node right) {
		this.name = name;
		this.left = left;
		this.right = right;
	}
}