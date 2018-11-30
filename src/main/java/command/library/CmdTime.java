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
        Date date = new Date();
        Timestamp ts = new Timestamp(date.getTime());
        System.out.println(ts);
    }
    
}
