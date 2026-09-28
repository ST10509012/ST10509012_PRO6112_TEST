//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    // Declarations
    String[] Cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
    String[] GamingConsole = {"PSS", "XBOX", "SWITCH"};
    int[][] sales = {{1000, 2000, 3000}, {2000, 3000, 4000}, {1500, 1100, 1200}};
    int total = 0;

    System.out.println("--------------------------------------------------------------------------------------------");
    System.out.println("GAMING CONSOLE REPORT");
    System.out.println("--------------------------------------------------------------------------------------------");

    System.out.printf("%18s", " ");
    for (int i = 0; i < GamingConsole.length; i++) {
        System.out.printf("%18s", GamingConsole[i]);
    }

    System.out.println();
    int b;
    for (b = 0; b < Cities.length; b++) {
        System.out.printf("%18s", Cities[b]);
        for (int c = 0; c < sales[b].length; c++) {
            System.out.printf("%18d", sales[b][c]);
        }
        System.out.println();
    }
    System.out.println("--------------------------------------------------------------------------------------------");
    System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
    System.out.println("--------------------------------------------------------------------------------------------");

    for (int g = 0; b < Cities.length; g++) ;
    {
        int totals = 0;
        System.out.printf("%18s", Cities[b]);

        for (int g = 0; g < sales[b].length; g++) {
            totals += sales[b][g];

        }
        System.out.printf("%18d", totals);
        if (totals >= 15) {
            System.out.printf("%18s", "***");
        }
        System.out.println();

    }

    System.out.print("----------------------------------------------------------------------------------------------");
}
