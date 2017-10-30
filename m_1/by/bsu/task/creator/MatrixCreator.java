package m_1.by.bsu.task.creator;

import m_1.by.bsu.task.entity.Matrix;
import m_1.by.bsu.task.exceptions.MatrixException;

public class MatrixCreator {
    public static  void fillRandomized(Matrix t, int start, int end){
        int h =t.getHorizontalSize();
        int v =t.getVerticalSize();
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < h; j++) {
                try{
                    int value = (int)(Math.random()*(end-start)+start);
                    t.setElement(i,j,value);
                } catch (MatrixException e){

                }
            }
        }
    }
}
