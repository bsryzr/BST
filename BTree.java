
public class BTree {

	Node root;

	public BTree(Node root) { //constructor 
		root=null;
	}
	
	public BTree() { // ???
		// TODO Auto-generated constructor stub
	}

	Node newNode(int data) {
		root=new Node(data);//datasını rootun ıcıne attık
		System.out.println(data + "agaca eklendi");
		return root;
		
	}
	
	Node Insert(Node root,int data) {// ekleme yapcaz
		if(root!=null) {
			if(data<root.data) {
				root.left=Insert(root.left,data); // recursive sekılde cagırdık
				root.right=Insert(root.right,data);
			}
			else 
				root=newNode(data);
		}
		return root;
	}
	
	
	
	
	
	
	
}
