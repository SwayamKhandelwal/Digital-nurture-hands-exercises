package week_1.Factory_Method;

public class Main {
    public static void main(String[] args) {
        DocumentFactory factory1 = new WordDocumentFactory();
        Document doc1 = factory1.createDocument();
        doc1.open();
        doc1.save();

        DocumentFactory factory2 = new PdfDocumentFactory();
        Document doc2 = factory2.createDocument();
        doc2.open();
        doc2.save();

        DocumentFactory factory3 = new ExcelDocumentFactory();
        Document doc3 = factory3.createDocument();
        doc3.open();
        doc3.save();
    }
}
