import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class TreeSizeCalculator implements Callable<Integer> {
    public Node root;
    public ExecutorService executorService;
    @Override
    public Integer call() throws Exception {
        if (root==null){
            return 0;
        }

        TreeSizeCalculator left=new TreeSizeCalculator(root.left, executorService);
        TreeSizeCalculator right=new TreeSizeCalculator(root.right, executorService);

        Future<Integer> leftSize = executorService.submit(left);
        Future<Integer> rightSize = executorService.submit(right);

        return leftSize.get()+rightSize.get()+1;

    }

    public TreeSizeCalculator(Node root, ExecutorService executorService){
        this.root = root;
        this.executorService = executorService;

    }
}
