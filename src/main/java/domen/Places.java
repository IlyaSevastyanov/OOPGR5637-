package domen;

public class Places {
    private int row;
    private int col;
    private boolean empty;

    public Places(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public boolean isEmpty(){
        return empty;
    }

    public boolean setEmpty(boolean empty) {
        boolean result = this.empty;
        this.empty = empty;
        return result;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }
}
