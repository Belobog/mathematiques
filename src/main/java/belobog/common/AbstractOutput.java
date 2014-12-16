package belobog.common;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractOutput {
	
	private List<Warning>warnings;
	private List<Error>errors;
	
	
	public List<Warning> getWarnings() {
		if(warnings == null){
			warnings = new ArrayList<Warning>();
		}
		return warnings;
	}
	
	public List<Error> getErrors() {
		if(errors == null){
			errors = new ArrayList<Error>();
		}
		return errors;
	}
	
	
	

}
