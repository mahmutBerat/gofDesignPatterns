import com.command.Command;
import com.command.LightCommand.LightOffCommand;
import com.command.LightCommand.LightOnCommand;
import com.command.NoCommand;
import com.command.TVCommand.TVOffCommand;
import com.command.TVCommand.TVOnCommand;
import com.invoker.SimpleRemoteControl;
import com.receiver.Light;
import com.receiver.TV;
import org.junit.Test;

import java.util.HashMap;

/**
 * Created by Mahmut on 1/7/2018.
 */

public class CommandTest {


    @Test
    public void testLightCommand(){

        SimpleRemoteControl remoteControl = new SimpleRemoteControl(new HashMap());
        Light light = new Light();
        Command command = new NoCommand();
        remoteControl.addCommand("lightOn",command);
        remoteControl.buttonWasPressed("lightOn");

        LightOnCommand lightCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        remoteControl.addCommand("lightOn",lightCommand);
        remoteControl.addCommand("lightOff",lightOffCommand);
        //remoteControl.undo();

        TV tv = new TV();
        TVOnCommand tvOnCommand = new TVOnCommand(tv);
        TVOffCommand tvOffCommand = new TVOffCommand(tv);

        remoteControl.addCommand("tvOn",tvOnCommand);
        remoteControl.addCommand("tvOff",tvOffCommand);

        remoteControl.buttonWasPressed("tvOn");
        remoteControl.buttonWasPressed("tvOff");
        remoteControl.undo();
        //remoteControl.buttonWasPressed("tvOn");
    }
}
