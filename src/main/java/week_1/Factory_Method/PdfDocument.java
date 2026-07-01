package week_1.Factory_Method;

class PdfDocument implements Document {
    public void open() {
        System.out.println("opening PDF document");
    }

    public void save() {
        System.out.println("saving PDF document");
    }
}