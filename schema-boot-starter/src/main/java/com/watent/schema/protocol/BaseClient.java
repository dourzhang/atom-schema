package com.watent.schema.protocol;

import feign.Param;
import feign.RequestLine;

public interface BaseClient<V> {

    @RequestLine("POST /save")
    Long save(V v);

    @RequestLine("DELETE /{id}")
    void delete(@Param("id") Long id);

    @RequestLine("GET /{id}")
    V findOne(@Param("id") Long id);
}
