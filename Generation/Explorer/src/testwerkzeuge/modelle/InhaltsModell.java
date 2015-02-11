package testwerkzeuge.modelle;

import javax.swing.tree.DefaultMutableTreeNode;

public class InhaltsModell extends DefaultMutableTreeNode{
	
	public InhaltsModell(){
		super("");
		DefaultMutableTreeNode antragsmappe = new DefaultMutableTreeNode("Antragsmappe XYZ");
		this.add(antragsmappe);
		DefaultMutableTreeNode antragsblatt = new DefaultMutableTreeNode("Antragsblatt");
		antragsmappe.add(antragsblatt);
		DefaultMutableTreeNode bewilligungsblatt = new DefaultMutableTreeNode("Bewilligungsblatt");
		antragsmappe.add(bewilligungsblatt);
		DefaultMutableTreeNode zahlungsblatt = new DefaultMutableTreeNode("Zahlungsblatt");
		antragsmappe.add(zahlungsblatt);
	}

}
