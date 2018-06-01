package com.iofractal.facreator.utils.exceptions;

public class MasivaIdcException extends RuntimeException {

    private static final long serialVersionUID = 8148737390324863474L;

    public MasivaIdcException() {
    }

    public MasivaIdcException(String message) {
        super(message);
    }

    public MasivaIdcException(Throwable cause) {
        super(cause);
    }

    public MasivaIdcException(String message, Throwable cause) {
        super(message, cause);
    }

}
