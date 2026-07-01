package week_1.Factory_Method;

class ExcelDocument implements Document {
    public void open() {
        System.out.println("opening excel spreadsheet");
    }

    public void save() {
        System.out.println("saving excel spreadsheet");
    }
}