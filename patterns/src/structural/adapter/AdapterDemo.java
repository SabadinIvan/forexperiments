package structural.adapter;

public class AdapterDemo {
    public static void printText(Printer printer, String message) {
        printer.print(message);
    }

    public static void main(String[] args) {
        DotMatrixPrinterAdapter matrixPrinterAdapter = new DotMatrixPrinterAdapter();
        LaserPrinterAdapter laserPrinterAdapter = new LaserPrinterAdapter();
        printText(matrixPrinterAdapter, "Hello Via Matrix Printer");
        printText(laserPrinterAdapter, "Hello Via Laser Printer");
    }
}
