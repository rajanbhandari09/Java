/*Notes:
1. BFS traversal or Level order traversal is an algorithm that processes the root, followed by childen of root (from left to right), 
followed by grandchildren of root (from left to right)
2. Implementation requires use of queue
*/

public class BFStraversal{
	public static void levelOrder(Node N){
		Node temp = root;
		Queue<Node> q = new LinkedList<Node>();
		q.add(temp);
		while(!q.isEmpty()){
			temp = q.remove();
			System.out.print(temp.data+" ");
			if(temp.left!=null)
				q.add(temp.left);
			if(temp.right!=null)
				q.add(temp.right);


		}


	}