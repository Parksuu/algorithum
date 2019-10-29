import java.util.*;
import java.io.*;

class Node{
	Node left;
	Node right;
	char data; //어차피 받는 데이터가 문자 하나니까
	
	Node(char data){
		this.data = data;
		this.left = null;
		this.right = null;
	}

}

class Tree{
	
	Node root; //root 생성
	
	Tree(char data, char left, char right){
		
		root = new Node(data);
		//처음 생성할때  root node에 data넣고, root의 left와 right에 데이터가 존재하면 각각에 해당하는 node를 생성한다
		
		if(data != '.')
			root = new Node(data);
		if(left != '.')
			root.left = new Node(left);
		if(right != '.')
			root.right = new Node(right);
		
	}
	
	void add(char data, char left, char right) {
		//들어온 세 문자와 원래있던  트리를 비교해야함
		//root부터 재귀를 돌리면 서브트리부터 올라오면서 전부 확인 가능
		//node를 추가할 때는 a에 달지 않기때문에 root.left와 root.right를 비교해서 add 해줌
		next(root.left,data,left,right); //left다 돌면서 찾아봄
		next(root.right,data,left,right); //right 다 돌면서 찾아봄
		
	}
	
	void next(Node node, char data, char left, char right) {
		//node와 들어온 data 비교!
		//존재하면 new node를 만들어서 달아준다
		
		//node가 존재하지않으면
		if(node == null)
			return;
		
		//1. 바로 root에서 발견했을 경우
		if(node.data == data){ 
			if(left != '.') //left가 값을 가진다면 바로 node의 left에 붙여준다
				node.left = new Node(left); 
			
			if(right !='.') //right가 값을 가진다면 바로 node의 right에 붙여준다
				node.right = new Node(right);
		}
		
		//2. root에서 발견견하지 못했을 경우
		else {
			next(node.left,data,left,right); //node의 left를 root로 두고 다시 들어가서 비교
			next(node.right,data,left,right); //node의 right를 root로 두고 다시 들어가서 비교
			
		}		
	}
	
	//전위 순회
	
	void preOrder(Node node) {
		System.out.print(node.data);
		
		if(node.left != null)
			preOrder(node.left);
		
		if(node.right != null)
			preOrder(node.right);
		
	}
	
	void inOrder(Node node) {
		if(node.left != null)
			inOrder(node.left);
		
		System.out.print(node.data);
		
		if(node.right != null)
			inOrder(node.right);		
	}
	
	void postOrder(Node node) {
		if(node.left != null)
			postOrder(node.left);
		
		if(node.right != null)
			postOrder(node.right);
		
		System.out.print(node.data);
		
	}
	
}

public class Main {
	
	 public static void main(String[] args) throws Exception {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int i,n = Integer.parseInt(bf.readLine());
		char data[] = bf.readLine().replaceAll(" ", "").toCharArray(); //두번째줄 데이터를 char 배열로 만듬
		
		Tree tree = new Tree(data[0],data[1],data[2]); // 일단 첫번째 tree 만들고
		
		for(i = 1;i<n;i++) { //그 다음줄부터 배열을 만들어서 tree에 비교하면서 추가
			data = bf.readLine().replaceAll(" ","").toCharArray(); 
			tree.add(data[0],data[1],data[2]); //다음 가지부터는 add로 원래 있던 tree와 비교한다	
		}
		
		tree.preOrder(tree.root);
		System.out.println("");
		
		tree.inOrder(tree.root);
		System.out.println("");
		
		tree.postOrder(tree.root);
	 }
}
