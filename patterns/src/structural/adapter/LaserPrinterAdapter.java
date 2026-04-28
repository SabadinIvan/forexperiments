package structural.adapter;

public class LaserPrinterAdapter implements Printer{
    private final LaserPrinter laserPrinter;

    public LaserPrinterAdapter() {
        this.laserPrinter = new LaserPrinter();
    }

    @Override
    public void print(String message) {
        laserPrinter.printDocument(message);
    }
}
