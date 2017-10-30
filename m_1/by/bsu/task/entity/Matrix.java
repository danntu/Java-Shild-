package m_1.by.bsu.task.entity;

import m_1.by.bsu.task.exceptions.MatrixException;

public class Matrix {
    private int[][] a;

    public Matrix(int n, int m) throws MatrixException{
        if ((n<1) || (m<1)){
            throw  new MatrixException();
        }
        a = new int[n][m];
    }

    public int getVerticalSize(){
        return a.length;
    }

    public int getHorizontalSize(){
        return  a[0].length;
    }

    public int getElement(int i, int j) throws MatrixException{
        if (checkRange(i,j)){
            return a[i][j];
        }
        throw new MatrixException();
    }

    public void setElement(int i, int j, int value) throws MatrixException{
        if (checkRange(i,j)){
            a[i][j]=value;
        }
        throw new MatrixException();
    }

    public String toString(){
        StringBuilder s = new StringBuilder("\nMatrix: "+a.length
        +"x"+a[0].length+"\n");

        for (int[] row:
             a) {
            for (int value:
                 row) {
                s.append(value+" ");
            }
            s.append("\n");
        }
        return s.toString();
    }

    private boolean checkRange(int i, int j){
        if (i>=0 && i<a.length && j>=0 && j<a[0].length){
            return true;
        } else{
            return false;
        }
    }
}
