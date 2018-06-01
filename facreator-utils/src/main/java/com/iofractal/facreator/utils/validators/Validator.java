package com.iofractal.facreator.utils.validators;

import java.util.List;
import java.util.regex.Pattern;

import com.iofractal.facreator.utils.exceptions.ListEmptyException;
import com.iofractal.facreator.utils.exceptions.RfInvalidoException;

public class Validator {

	Validator() {
	}

	public static void isRFCValido(String rfc) throws RfInvalidoException {
		if (!Pattern.matches("^[A-Z_\u00D1\u0026]{3,4}[0-9]{2}([0][1-9]|[1][0-2])([0-2][0-9]|[3][0-1])[A-Z_0-9]{3}$",
				rfc)) {
			throw new RfInvalidoException("RFC Freezer");
		}
	}

	public static boolean isObjectNull(Object object) {
		return object == null;
	}
	
	public static boolean isListNotEmpty(List<?> lista) {
        if (lista != null) {
            return lista.size() > 0;
        } else {
            return false;
        }
    }

    public static boolean isListNotEmptyThrowException(List<?> lista) {
        if (lista != null) {
            return lista.size() > 0;
        } else {
            throw new ListEmptyException();
        }
    }

}
