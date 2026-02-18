/*
class Node
{
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

class Tree {
    // Recursive function to print right view of a binary tree.
    ArrayList<Integer> Kdistance(Node root, int k) {
        // Your code here
        
        ArrayList<Integer> ans= new ArrayList<>();
        if(root==null)return ans;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        int level=0;
        
        while(!q.isEmpty()){
            int n=q.size();
            if (level == k) {
    while (!q.isEmpty()) {
        ans.add(q.remove().data);
    }
    return ans;
}

            for(int i=0;i<n;i++){
            Node front=q.remove();
            
            if(front.left!=null){
                q.add(front.left);
            }
            if(front.right!=null){
                q.add(front.right);
            }
                
            }
            level++;
        }
        return ans;
        
    }
}