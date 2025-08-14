class NullPointerDemo {
    public static void main(String[] args) {
        // Without handling
        // String text = null;
        // System.out.println(text.length());

        // With handling
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException!");
        }
    }
}