package edu.odu.cs.cs350;
/**
 * Anchor tag classification options
 * {@link #intraPage}
 * {@link #intraSite}
 * {@link #External}
 */
public enum Classification {
	/**
	 * Tag links to another location on the same page
	 */
	intraPage,
	/**
	 * Tag links to another location on the same site
	 */
	intraSite,
	/**
	 * Tag links to a different site
	 */
	External
}
