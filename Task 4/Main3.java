interface Printer {
    void printDocument();
}

interface Scanner {
    void scanDocument();
}

interface Fax {
    void faxDocument();
}

class MultiFunctionCopier implements Printer, Scanner, Fax {

    public void printDocument() {
        System.out.println("Printing...");
    }

    public void scanDocument() {
        System.out.println("Scanning...");
    }

    public void faxDocument() {
        System.out.println("Faxing...");
    }
}

class BasicPrinter implements Printer {

    public void printDocument() {
        System.out.println("Printing...");
    }
}

public class Main {
    public static void main(String[] args) {

        Printer printer = new BasicPrinter();
        printer.printDocument();

        MultiFunctionCopier mfc = new MultiFunctionCopier();
        mfc.printDocument();
        mfc.scanDocument();
        mfc.faxDocument();
    }
}
