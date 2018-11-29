/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command.library;

import command.framework.Command;
import interfaces.IDrive;
import interfaces.IOutputter;

/**
 * Command to change current directory.
 * Example for a command with optional parameters.
 */
class CmdExit extends Command {

	protected CmdExit(String name, IDrive drive) {
		super(name, drive);
	}

	@Override
	public boolean checkNumberOfParameters(int numberOfParametersEntered) {
		return numberOfParametersEntered == 0;
	}

	@Override
	public boolean checkParameterValues(IOutputter outputter) {
		return true;
	}

	@Override
	public void execute(IOutputter outputter) {
	}
}