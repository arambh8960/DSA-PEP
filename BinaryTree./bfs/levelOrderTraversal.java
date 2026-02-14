
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> out =new ArrayList<>();
        if(root==null)return out;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            List<Integer> l=new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode front=q.remove();
                l.add(front.val);
                if(front.left!=null) {
                    q.add( front.left);
                }
                if(front.right!=null) {
                    q.add( front.right);
                }
            }
            out.add(l);
        }
        return out;
    }
}