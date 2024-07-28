class OldPrinter {
    public void oldPrint(String text) {
        System.out.println("Old Printer: " + text);
    }
}

class NewPrinter {
    public void newPrint(String text) {
        System.out.println("New Printer: " + text);
    }
}

class PrinterAdapter extends NewPrinter {
    private OldPrinter oldPrinter;

    public PrinterAdapter(OldPrinter oldPrinter) {
        this.oldPrinter = oldPrinter;
    }

    @Override
    public void newPrint(String text) {
        oldPrinter.oldPrint(text);
    }
}

public class AdapterPatternDemo {
    public static void main(String[] args) {
        OldPrinter oldPrinter = new OldPrinter();
        NewPrinter adapter = new PrinterAdapter(oldPrinter);
        adapter.newPrint("Hello, world!");
    }
}
