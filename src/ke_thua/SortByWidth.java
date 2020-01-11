package ke_thua;

import java.util.Comparator;

public class SortByWidth implements Comparator<Rectangle>{

    @Override
    public int compare(Rectangle o1, Rectangle o2) {
        double res = o1.getWidth() - o2.getWidth();
        if (res < 0) {
            return -1;
        } else {
            return 1;
        }
    }
}
