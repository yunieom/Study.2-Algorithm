/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number}
 */
var getMinimumDifference = function(root) {
    let arr = [];
    function sort(node) {
        if(node) {
            sort(node.left);
            arr.push(node.val);
            sort(node.right);
        }
    }

    sort(root);
    
    let minDiff = arr[1]-arr[0];
    for(let i=2; i<arr.length; i++) {
        minDiff = Math.min(minDiff, arr[i]-arr[i-1]);
    }

    return minDiff;
};