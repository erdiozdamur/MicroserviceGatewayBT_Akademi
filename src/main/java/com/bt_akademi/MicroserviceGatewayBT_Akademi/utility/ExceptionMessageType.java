package com.bt_akademi.MicroserviceGatewayBT_Akademi.utility;

public enum ExceptionMessageType
{
    FIND_BY_USERNAME("Entity is not found");

    private String value;

    ExceptionMessageType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
