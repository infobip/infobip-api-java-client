package com.infobip.api.util;

import com.infobip.ApiException;

@FunctionalInterface
public interface ApiCall<T> {

    T execute() throws ApiException;

}
