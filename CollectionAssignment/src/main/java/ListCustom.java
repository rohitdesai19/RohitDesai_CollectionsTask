import java.util.Arrays;
 
public class ListCustom<T> 
{
    private int size = 0;
    private int listsize = 10;
    private Object list[];
 
    public ListCustom() {
        list = new Object[listsize];
    }
 
    private void ensureCapacity() {
        int newSize = list.length*4;
        list = Arrays.copyOf(list, newSize);
    }
    
    public void add(T element) {
        if (size == list.length) {
            ensureCapacity();
        }
        list[size++] = element;
    }
    
    public T get(int index) {
        return (T) list[index];
    }
     
    public T remove(int index) {
        Object item = list[index];
        int numElts = list.length - ( index + 1 ) ;
        System.arraycopy( list, index + 1, list, index, numElts ) ;
        size--;
        return (T) item;
    }
     
    
    public int size() {
        return size;
    }
     
    public void displayList() {
    	for(int i=0;i<list.length;i++)
    		System.out.println(list[i]+" ");
    }

}