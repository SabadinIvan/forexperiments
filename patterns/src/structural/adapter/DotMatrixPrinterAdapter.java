package structural.adapter;

public class DotMatrixPrinterAdapter implements Printer {
    private final DotMatrixPrinter dotMatrixPrinter;

    public DotMatrixPrinterAdapter() {
        this.dotMatrixPrinter = new DotMatrixPrinter();
    }

    @Override
    public void print(String message) {
        dotMatrixPrinter.printDocument(message);
    }
}
