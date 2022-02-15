package by.training.vnemero.task01;

public class Main {

    public static void main(String[] args) {
        // task-1
        Input input = new Input();
        int number = input.scannerInputTask1();
        Logic logic = new Logic();
        View view = new View();
        view.outputTask1(logic.logicTask1(number));

        // task-2
        double a = input.scannerInputTask2();
        double b = input.scannerInputTask2();
        double c = input.scannerInputTask2();
        view.outputTask2(logic.logicTask2(a, b, c));

        // task-3
        double x = input.scannerInputTask3();
        double y = input.scannerInputTask3();
        view.outputTask3Perimeter(logic.logicTask3Perimeter(x, y));
        view.outputTask3Square(logic.logicTask3Square(x, y));

        // task-4
        int xCoordinate = input.scannerInputTask4();
        int yCoordinate = input.scannerInputTask4();
        view.outputTask4(logic.logicTask4(xCoordinate, yCoordinate));
    }
}
