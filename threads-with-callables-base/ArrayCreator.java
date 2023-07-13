import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.List;

public class ArrayCreator implements Callable <List<Integer>> {
    int n;
    public ArrayCreator(int n){
        this.n = n;

    }
    @Override
    public List<Integer> call() throws Exception {
        List<Integer>arr =new ArrayList<>();
        for (int i=1; i<=n; i++){
            arr.add(i);
        }
        return arr;
    }
}
