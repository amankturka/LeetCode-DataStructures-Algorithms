//Implement Binary Search Tree
//left descendents <= current < right descendednts

struct Node{
    int value;
    Node* left;
    Node* right;
}

Node* newNode(int value){
    Node* newNode = new Node();
    newNode->value = value;
    newNode->left = null;
    newNode->right = null;
    return newNode;
}

Node* insertBST(Node* root,int value){
    if(root == null)
        root = newNode(value);
    else if(value <= root->value)
        root->left = insertBST(root->left,value);
    else 
        root->right = insertBST(root->right,value);

    return root;
}

bool search(Node* root,int value){
    if(root == null)
        return false;
    else if(root->value == value)
        return true;
    else if(value <= root->value)
        return search(root->left,value);
    else
        return search(root->right,value);
}

int main(){
    Node* root = null;
    insertBST(root,1);
    insertBST(root,10);
    insertBST(root,5);
    insertBST(root,50);

    bool found = search(root,10);
    printf("%s",found);
}