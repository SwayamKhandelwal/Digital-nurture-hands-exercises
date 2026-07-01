package week_1.Factory_Method;

class WordDocument implements Document {
    public void open() {
        System.out.println("Opening word document");
    }

    public void save() {
        System.out.println("Saving word document");
    }
}