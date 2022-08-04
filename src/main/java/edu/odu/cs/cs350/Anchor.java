package edu.odu.cs.cs350;

import java.util.ArrayList;
import java.util.List;
import org.jsoup.nodes.Element;


public class Anchor {

	Classification linkType;

	public Anchor(Classification linkType) {
		this.linkType = linkType;

	}

	public List<Classification> getLinkTypes (List<Element> tags) {
        List<Classification> listLinkTypes = new ArrayList<>();
		for (Element e  : tags){
			// Need to design algorithm for determining intraPage (# at start or URL), intraSite (SameHost.com), External (DifferentHost.com)
        }
        return listLinkTypes;
//		Temporarily for reference:        
//		Anchor test = new Anchor(linkType.intraPage);
//		return test;
        
	}

}
