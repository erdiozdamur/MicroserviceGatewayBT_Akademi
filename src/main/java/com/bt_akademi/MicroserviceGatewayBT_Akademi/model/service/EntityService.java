package com.bt_akademi.MicroserviceGatewayBT_Akademi.model.service;

import java.util.List;

public interface EntityService<E, I>
{
    List<E> getAll();

    E save(E entity);

    void deleteById(I id);
}

