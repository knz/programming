import ui.UserInterfaceFactory;
import ui.OthelloReplayUserInterface;

class Cross
{
    OthelloReplayUserInterface ui;

    // Constructor
    Cross()
    {
        UserInterfaceFactory.enableLowResolution(true);
        ui = UserInterfaceFactory.getOthelloReplayUI();
    }

    void fillRow(int n)
    {
        for (int i = 0; i < 8; i = i + 1)
            ui.place(i, n, ui.WHITE);
    }

    void fillColumn(int n)
    {
        for (int i = 0; i < 8; i = i + 1)
            ui.place(n, i, ui.WHITE);
    }

    void drawCross()
    {
        fillColumn(3);
        fillColumn(4);
        fillRow(3);
        fillRow(4);
    }

    void start()
    {
        drawCross();
        ui.showChanges();
    }

    public static void main(String[] args) {
        Cross c = new Cross();
        c.start();
    }
}
