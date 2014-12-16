package belobog.validator;

import belobog.exception.FactorielNegativeException;
import belobog.exception.FactorielZeroException;
import belobog.exception.InputFormatException;
import belobog.model.in.FactorielInput;


public interface IFactorielValidator {
	
	void validate(FactorielInput input) throws InputFormatException, FactorielNegativeException, FactorielZeroException;

}
