public class MinMax <T extends Comparable<T>>{
    private final T[] TArray;

    public MinMax (T[] TArray){
        this.TArray = TArray;
    }

    public T FindMin (){
        if (this.TArray.length == 0)
            throw new IllegalArgumentException("Array is empty or filled with null");
        T minElem = TArray[0];
        for (T t : this.TArray)
            if (t.compareTo(minElem) < 0)
                minElem = t;
        return minElem;
    }

    public T FindMax (){
        if (this.TArray.length == 0)
            throw new IllegalArgumentException("Array is empty or filled with null");
        T maxElem = TArray[0];
        for (T t : this.TArray)
            if (t.compareTo(maxElem) > 0)
                maxElem = t;
        return maxElem;
    }

    public T[] getTArray() {
        return TArray;
    }
}
