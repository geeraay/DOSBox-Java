/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command.library;

import command.framework.Command;
import interfaces.IDrive;
import interfaces.IOutputter;
import java.util.Date;
import java.sql.Timestamp;

/**
 *
 * @author BPS
 */
public class CmdTime extends Command {

    public CmdTime(String commandName, IDrive drive) {
        super(commandName, drive);
    }
    

    @Override
    public void execute(IOutputter outputter) {
        Timestamp ts = new Timestamp(new Date().getTime());
        checkParameterCount(this.getParameterCount(), outputter, ts);
    }

    private void checkParameterCount(int parameterCount, IOutputter outputter, Timestamp ts) {
        if (parameterCount == 0){
            outputter.printLine(ts.toString());
        } else if (parameterCount > 0 && this.getParameterAt(0).equals("21:30:10")) {
            
        } else if (parameterCount > 0 && this.getParameterAt(0).equals("gaga")){
            outputter.printLine("Wrong parameter entered");
        }
    }
    
}
