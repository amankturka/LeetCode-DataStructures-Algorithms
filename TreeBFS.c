//Breadth first / level oreder traversal
//using queue
//Time complexity: O(n)

struct Node{
    char data;
    Node *left;
    Node *right;
}

void BFS(Node *root){
    if(root == null){
        return;
    }
    queue<Node*> queue;
    queue.push(root);
    while(!queue.empty()){
        Node* current = queue.front();
        if(current->right != null){
            queue.push(current->right);
        }
        if(current->left != null){
            queue.push(current->left);
        }
        queue.pop();
    }
}