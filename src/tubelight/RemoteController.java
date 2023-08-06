package tubelight;

public class RemoteController {
    Command command;

    RemoteController(Command command){
        this.command = command;
    }

    void setCommand(Command command){
        this.command = command;
    }

    void pressButton(){
        command.execute();
    }

}
