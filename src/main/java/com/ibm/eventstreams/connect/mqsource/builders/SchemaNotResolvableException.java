package com.ibm.eventstreams.connect.mqsource.builders;


import javax.jms.JMSException;

public class SchemaNotResolvableException extends JMSException {
    public SchemaNotResolvableException(String reason, String errorCode) {
        super(reason, errorCode);
    }

    public SchemaNotResolvableException(String reason) {
        super(reason);
    }
}
