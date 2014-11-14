import ui.SnakeUserInterface;
import ui.UserInterfaceFactory;
import ui.Event;
import java.util.Scanner;

class SnakeExample
{
    SnakeUserInterface ui;
    int i;

    SnakeExample()
    {
        i = 1;
        ui = UserInterfaceFactory.getSnakeUI(10, 10);
        ui.setFramesPerSecond(2);
    }


    void handleAlarm()
    {
        if (i >= 10)
            return;

        ui.place(i-1, i-1, ui.EMPTY);
        ui.place(i, i, ui.SNAKE);
        ui.showChanges();

        ++i;
    }

    void handleLeftArrow()
    {

    }

    void handleRightArrow()
    {

    }

    void handleKey(String theKey)
    {
        // if (theKey.equals(...)) ...
    }


    void handleArrow(String arrowType)
    {
        if (arrowType.equals("R"))
            handleRightArrow();
        else if (arrowType.equals("L"))
            handleLeftArrow();
        // else ...
    }

    void processEvent(Event event)
    {
        if (event.name.equals("alarm"))
        {
            handleAlarm();
        }
        else if (event.name.equals("arrow"))
        {
            handleArrow(event.data);
        }
        else if (event.name.equals("letter"))
        {
            handleKey(event.data);
        }
    }

    void start()
    {
        while (true) {
            // infinite loop
            Event event = ui.getEvent();
            processEvent(event);
        }

    }



    public static void main(String[] args)
    {
        SnakeExample e = new SnakeExample();
        e.start();
    }

}
