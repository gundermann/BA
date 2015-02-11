package testwerkzeuge;

import gui.GuiExplorer;

import java.awt.BorderLayout;

import DE.data_experts.jwammc.core.interfaces.ComponentFactory;
import DE.data_experts.jwammc.core.pf.PfFrame;
import DE.data_experts.jwammc.core.pf.PfRootPane;
import DE.data_experts.jwammc.swing.JComponentFactory;
import DE.data_experts.util.DegEnvironment;
import de.jwamx.technology.iafpf.command.cmdActivate;

public class ToolTest {
	public static void main(String[] args) {
		DegEnvironment.getEnv().addEnvObject(ComponentFactory.class.getName(),
				new JComponentFactory());
		PfFrame frame = new PfFrame();
		GuiExplorer gui = new GuiExplorer();
		PfRootPane contentPane = new PfRootPane(new BorderLayout());
		contentPane.add(gui, BorderLayout.CENTER);
		frame.add(contentPane);
		frame.attachActivateCommand(new cmdActivate() {
			@Override
			protected void doExecute() {
				System.exit(0);
			}
		});

		frame.pack();
		frame.setVisible(true);
	}
	
}
