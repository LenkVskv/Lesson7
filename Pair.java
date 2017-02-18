package Lesson7;

/**
 * Created by Olenkaa on 18.02.2017.
 */
public class Pair <R, L>{
    private final  R right;
    private final L left;

    @Override
    public String toString() {
        return "Pair{" +
                "right=" + right +
                ", left=" + left +
                '}';
    }

    public R getRight() {
        return right;
    }

    public L getLeft() {
        return left;
    }

    public Pair(R right, L left) {

        this.right = right;
        this.left = left;
    }
}
