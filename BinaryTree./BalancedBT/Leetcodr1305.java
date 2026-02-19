/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    vector<int> getAllElements(TreeNode* root1, TreeNode* root2) {
        vector<int> A;
        vector<int> B;
        inorder(root1,A);
        inorder(root2,B);
        int n = A.size() , m = B.size() , k = 0 , i = 0 , j = 0;
        vector<int> ans(m+n);
        while(n and m){
            if(n and A[i] <= B[j]){
                ans[k++] = A[i++];
                n--;
            }
            else{
                ans[k++] = B[j++];
                m--;
            }
        }
        for(int x = i ; x < A.size() ; x++){
            ans[k++] = A[x];
        }
        for(int x = j ; x < B.size() ; x++){
            ans[k++] = B[x];
        }
        return ans;
    }
    void inorder(TreeNode* root , vector<int>& nums){
        if(!root)   return;
        inorder(root->left , nums);
        nums.push_back(root->val);
        inorder(root->right , nums);
        return;
    }
};