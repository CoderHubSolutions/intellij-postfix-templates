package de.endrullis.idea.postfixtemplates.languages.go;

import de.endrullis.idea.postfixtemplates.language.CptLang;

/**
 * Language definition for Java.
 *
 * @author Stefan Endrullis &lt;stefan@endrullis.de&gt;
 */
public class GoLang extends CptLang {

	public GoLang() {
		super("Go", GoAnnotator.class);
	}

}
