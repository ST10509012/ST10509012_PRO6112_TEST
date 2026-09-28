public abstract class Console implements IConsoles {

    private String consoleType;
    private String nameofStore;
    private int totalSales;

    public Console(String consoleType, String nameofStore, int totalSales); {
        this.consoleType = consoleType;
        this.nameofStore = nameofStore;
        this. totalSales = totalSales;
    }

    @Override
    public String getConsoleType() {
        return consoleType;
    }

    @Override
    public String getStore() {
        return "";
    }

    public int getTotalSales() {
        return totalSales;
    }
}
