package command.library;

import command.framework.Command;
import interfaces.IDrive;
import interfaces.IOutputter;

/**
 * @author dominik.schmitz@traveltainment.de
 */
public class CmdVer extends Command {


	protected CmdVer(String commandName, IDrive drive) {
		super(commandName, drive);
	}

	@Override
	protected boolean checkNumberOfParameters(int numberOfParametersEntered) {
		return numberOfParametersEntered == 0 || numberOfParametersEntered == 1;
	}

	@Override
	protected boolean checkParameterValues(IOutputter outputter) {
		if (this.getParameterCount() == 1) {
			return this.getParameterAt(0).equals("/w");
		}
		return true;
	}

	@Override
	public void execute(IOutputter outputter) {
		outputter.printLine("Microsoft Windows XP [Version 5.1.2600]");
		if (this.getParameterCount() == 1) {
			outputter.printLine("Sugiri : sugiri@bps.go.id");
			outputter.printLine("Muh. Ilham : muh.ilham@bps.go.id");
			outputter.printLine("Eka Miftakhul Rachmawati : ekamifta.r@bps.go.id");
			outputter.printLine("Khairiyah Rizkiyah : khairiyah.rizkiyah@bps.go.id");
			outputter.printLine("Brilian Surya Budi : brilian.surya@bps.go.id");
		}
	}
}
