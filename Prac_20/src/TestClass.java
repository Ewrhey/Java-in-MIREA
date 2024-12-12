import java.io.Serializable;


public class TestClass <T extends Comparable<T>,V extends Animal & Serializable,K extends String>{
    private final T t_data;
    private final V v_data;
    private final K k_data;

    public TestClass(T t_data, V v_data, K k_data){
        this.t_data = t_data;
        this.v_data = v_data;
        this.k_data = k_data;
    }

    public void checkType (){
        System.out.println("T: " + t_data.getClass() + " V: " + v_data.getClass() + " K: " + k_data.getClass());
    }

    public T getT_data() {
        return t_data;
    }

    public V getV_data() {
        return v_data;
    }

    public K getK_data() {
        return k_data;
    }
}
