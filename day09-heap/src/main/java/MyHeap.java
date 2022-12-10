import java.util.NoSuchElementException;

public class MyHeap {
        int[] items;
        int size;

    public MyHeap(int capacity) {
        this.items = new int[capacity];
        this.size=0;
    }
    public int peak(){

        if (size==0) throw new NoSuchElementException();

        return items[0];
    }

    public void insert(int value){
        if(size==items.length) throw new IllegalStateException();

        else{
            items[size++]=value;
            bubbleUp();


        }
    }
    public void bubbleUp(){
        //calculate start point/index
        int index=size-1;
        //while indec>0 ..&& parent is less than c';l;./hild continue (max heapify)

        }


}
