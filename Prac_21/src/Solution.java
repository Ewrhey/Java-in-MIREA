import java.io.File;
import java.util.*;

public class Solution<T, K, V> {

    private T typeVariable;
    private K key;
    private V value;

    public Solution(T typeVariable, K key, V value) {
        this.typeVariable = typeVariable;
        this.key = key;
        this.value = value;
    }

    // 1. Метод для конвертации массива в список
    public static <T> List<T> convertArrayToList(T[] array) {
        List<T> list = new ArrayList<>();
        Collections.addAll(list, array);
        return list;
    }

    // 2. Класс для работы с массивом любого типа
    public static class GenericArray<T> {
        private final T[] array;

        public GenericArray(T[] array) {
            this.array = array;
        }

        public T getElement(int index) {
            if (index < 0 || index >= array.length) {
                throw new IndexOutOfBoundsException("Index out of range!");
            }
            return array[index];
        }

        public int getSize() {
            return array.length;
        }
    }

    // 4. Метод для получения содержимого каталога
    public static List<String> getDirectoryContents(String path) {
        File directory = new File(path);
        if (!directory.isDirectory()) {
            throw new IllegalArgumentException("The provided path is not a directory!");
        }
        File[] files = directory.listFiles();
        if (files == null) {
            return Collections.emptyList();
        }

        List<String> fileNames = new ArrayList<>();
        for (int i = 0; i < files.length && i < 5; i++) {
            fileNames.add(files[i].getName());
        }
        return fileNames;
    }

    // 5. Вспомогательные методы для создания коллекций
    public static <T> ArrayList<T> newArrayList(T... elements) {
        ArrayList<T> list = new ArrayList<>();
        Collections.addAll(list, elements);
        return list;
    }

    public static <T> HashSet<T> newHashSet(T... elements) {
        HashSet<T> set = new HashSet<>();
        Collections.addAll(set, elements);
        return set;
    }

    public static <K, V> HashMap<K, V> newHashMap(Pair<K, V>... pairs) {
        HashMap<K, V> map = new HashMap<>();
        for (Pair<K, V> pair : pairs) {
            map.put(pair.key, pair.value);
        }
        return map;
    }

    public static class Pair<K, V> {
        public final K key;
        public final V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
