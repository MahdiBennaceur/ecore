package org.occiware.clouddesigner.occi.xtext.tests;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;

public class Parse {
	private static final String WORKSPACE_PATH = new File(new File("").getAbsolutePath()).getParent();

	// TODO auto tests / checking
	public static void main(String[] args) throws IOException {
		XTextUtils.parse(URI.createURI("data/input/default.occi"));
	}

}
