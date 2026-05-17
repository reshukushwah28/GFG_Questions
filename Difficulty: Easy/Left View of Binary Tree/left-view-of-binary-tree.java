/*
class Node {
	int data;
	Node left, right;
	
	Node(int val) {
		this.data = val;
		this.left = null;
		this.right = null;
	}
}
*/

class Solution {
	public ArrayList<Integer> leftView(Node root) {
		// code here
		ArrayList<Integer> ans = new ArrayList<>();
		if (root == null) {
			return ans;
		}
		
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			List<Integer> li = new ArrayList<>();
			int n = q.size();
			for (int i = 0; i<n; i++) {
				Node node = q.poll();
				li.add(node.data);
				if (node.left != null)q.add(node.left);
				if (node.right != null)q.add(node.right);
			}
			ans.add(li.get(0));
		}
		return ans;
	}
}
