import org.example.Author;
import org.example.MethodInfo;

public class ArrayUtils {

    @MethodInfo(name = "sum", returnType = int.class, description = "Обчислює суму елементів масиву.")
    @Author(name = "Денис", surname = "Рожков")
    public int sum(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }

    @MethodInfo(name = "average", returnType = double.class, description = "Обчислює середнє значення елементів масиву.")
    @Author(name = "Денис", surname = "Рожков")
    public double average(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return (double) sum / array.length;
    }
}