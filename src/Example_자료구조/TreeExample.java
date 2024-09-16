package Example_자료구조;

class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
        left = right = null;
    }
}

//트리
//트리는 계층 구조를 나타내는 자료구조로, 노드들이 부모-자식 관계를 가지는 특징이 있습니다.
public class TreeExample {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        System.out.println(root.data);       // 출력: 1
        System.out.println(root.left.data);  // 출력: 2
        System.out.println(root.right.data); // 출력: 3
    }
}
