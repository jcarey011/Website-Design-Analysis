package edu.odu.cs.cs350;

import java.util.ArrayList;
import java.util.List;
import org.jsoup.nodes.Element;

	enum linkType {
		intraPage, intraSite, External
	}

public class Anchor {

	linkType linktype;

	public Anchor(linkType linktype) {
		this.linktype = linktype;

	}

	public List<linkType> getLinkTypes (List<Element> tags) {
        List<linkType> listLinkTypes = new ArrayList<>();
		for (Element e  : tags){
			// Need to design algorithm for determining intraPage (# at start or URL), intraSite (SameHost.com), External (DifferentHost.com)
        }
        return listLinkTypes;
//		Temporarily for reference:        
//		Anchor test = new Anchor(linkType.intraPage);
//		return test;
        
	}

}
