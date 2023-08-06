package tubelight;

public class TubeLightOffCommand implements Command{
    TubeLight tubeLight;
    TubeLightOffCommand(TubeLight tubeLight){
        this.tubeLight = tubeLight;
    }
    @Override
    public void execute() {
        tubeLight.switchOff();
    }
}
