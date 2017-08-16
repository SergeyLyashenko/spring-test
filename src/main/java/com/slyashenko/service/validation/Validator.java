package com.slyashenko.service.validation;

/**
 * Created by Kate on 06.05.17.
 */
public interface Validator<T> {

    void validate(T t);
}
