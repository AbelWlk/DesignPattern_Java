package AdapterPattern;

/**
 * 操作适配器：适配器
 */
public class OperationAdapter implements ScoreOperation {

    private QuickSort sortObj; //定义适配者QuickSort对象
    private BinarySearch searchObj; //定义适配者BinarySearch对象

    public OperationAdapter() {
        sortObj = new QuickSort();
        searchObj = new BinarySearch();
    }

    @Override
    public int[] sort(int[] array) {
        return sortObj.quickSort(array);
    }

    @Override
    public int search(int[] array, int key) {
        return searchObj.binarySearch(array, key);
    }
}
