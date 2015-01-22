package testwerkzeuge.modelle;

import javax.swing.tree.DefaultMutableTreeNode;

public class VerweiseModell extends DefaultMutableTreeNode{
	
	public VerweiseModell(){
		super("");
		DefaultMutableTreeNode v1 = new DefaultMutableTreeNode("Verweis 1");
		this.add(v1);
		DefaultMutableTreeNode v2 = new DefaultMutableTreeNode("Verweis 2");
		this.add(v2);
		DefaultMutableTreeNode v3 = new DefaultMutableTreeNode("Verweis 3");
		this.add(v3);
	}

}
