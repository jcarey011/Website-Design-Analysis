package edu.odu.cs.cs350;

import org.jsoup.nodes.*;

enum linkType {
	intraPage, intraSite, External
}

public class Anchor {
	
	linkType linktype;
	
	public Anchor(linkType linktype) {
		this.linktype = linktype;
		
	}
	
	public void getLinkType (String args[]) {
		Anchor test = new Anchor(linkType.intraPage);

	}

}
