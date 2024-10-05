public class Shop {
    public enum Categories {
        BOOKS("Books"),
        OFFICE("Office");

        private final String title;

        Categories(String title) {
            this.title = title;
        }


        @Override
        public String toString() {
            return title;
        }
    }

    public enum Books {
        BNW("Brave New World"),
        F451("Fahrenheit 451"),
        O1984("1984");

        private final String title;

        Books(String title) {
            this.title = title;
        }

        @Override
        public String toString() {
            return "'" + title + "'";
        }
    }

    public enum Office {
        PEN("Pen"),
        PENCIL("Pencil"),
        ERASER("Eraser");

        private final String title;

        Office(String title) {
            this.title = title;
        }

        @Override
        public String toString() {
            return "'" + title + "'";
        }
    }
}
