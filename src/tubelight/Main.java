package tubelight;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
            TubeLight tubeLight = new TubeLight();
            Command switchOnCommand = new TubeLightOnCommand(tubeLight);
            RemoteController remoteController = new RemoteController(switchOnCommand);
            remoteController.pressButton();


        Command switchOffCommand = new TubeLightOffCommand(tubeLight);
            remoteController.setCommand(switchOffCommand);
            remoteController.pressButton();
        }
}