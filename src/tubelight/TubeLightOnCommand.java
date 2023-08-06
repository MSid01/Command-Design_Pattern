package tubelight;

public class TubeLightOnCommand implements Command{
    TubeLight tubeLight;
    TubeLightOnCommand(TubeLight tubeLight){
        this.tubeLight = tubeLight;
    }
    @Override
    public void execute() {
        tubeLight.switchOn();
    }
}
