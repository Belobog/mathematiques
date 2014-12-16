package belobog.validator;

import java.util.ArrayList;
import java.util.List;

import belobog.common.Warning;
import belobog.exception.FactorielNegativeException;
import belobog.exception.FactorielZeroException;
import belobog.exception.InputFormatException;
import belobog.model.in.FactorielInput;

public class FactorielValidator implements IFactorielValidator {
	
	private List<Warning> warnings;
	private List<belobog.common.Error> errors;
	
	
	public FactorielValidator() {
		
	}

	@Override
	public void validate(FactorielInput input) throws InputFormatException, FactorielNegativeException, FactorielZeroException {
		
		try{
			Integer target = Integer.parseInt(input.getParametre()); 
			if(target < 0){
				throw new FactorielNegativeException();
			}
			if(target == 0){
				throw new FactorielZeroException();
				
			}
		}
		catch(NumberFormatException exception){
			
			throw new InputFormatException();
		}
		catch (FactorielZeroException exception) {
			System.out.println("Aucun sens de calculer le factoriel de 0");
		}
	}

	public List<Warning> getWarnings() {
		if(warnings == null){
			warnings = new ArrayList<Warning>();
		}
		return warnings;
	}

	public List<belobog.common.Error> getErrors() {
		if(errors == null){
			errors = new ArrayList<belobog.common.Error>();
		}
		return errors;
	}
	
	
	

}
