import java.util.List;

public class Tree {
    Node root;
    public class Node{
        int value;
        List<Node> children;
    }
    private Node find(Node node, int value){
        if (node.value == value){
            return node;
        } else {
            for (Node child: node.children){
                Node result = find(child, value);
                if (result != null)
                    return result;

            }
        }
        return null;
    }
    public boolean exist(int value){
        if (root != null){
            Node node = find(root, value);
            if (node != null)
                return  true;
        }
        return false;
    }
}
