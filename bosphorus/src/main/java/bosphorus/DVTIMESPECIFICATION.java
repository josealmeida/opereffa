// Generated by http://code.google.com/p/protostuff/ ... DO NOT EDIT!
// Generated from aom.proto

package bosphorus;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import com.dyuproject.protostuff.GraphIOUtil;
import com.dyuproject.protostuff.Input;
import com.dyuproject.protostuff.Message;
import com.dyuproject.protostuff.Output;
import com.dyuproject.protostuff.Schema;
import com.dyuproject.protostuff.UninitializedMessageException;

public final class DVTIMESPECIFICATION implements Externalizable, Message<DVTIMESPECIFICATION>, Schema<DVTIMESPECIFICATION>
{

    public static Schema<DVTIMESPECIFICATION> getSchema()
    {
        return DEFAULT_INSTANCE;
    }

    public static DVTIMESPECIFICATION getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final DVTIMESPECIFICATION DEFAULT_INSTANCE = new DVTIMESPECIFICATION();

    
    private DVPARSABLE value;

    public DVTIMESPECIFICATION()
    {
        
    }

    public DVTIMESPECIFICATION(
        DVPARSABLE value
    )
    {
        this.value = value;
    }

    // getters and setters

    // value

    public DVPARSABLE getValue()
    {
        return value;
    }

    public void setValue(DVPARSABLE value)
    {
        this.value = value;
    }

    // java serialization

    public void readExternal(ObjectInput in) throws IOException
    {
        GraphIOUtil.mergeDelimitedFrom(in, this, this);
    }

    public void writeExternal(ObjectOutput out) throws IOException
    {
        GraphIOUtil.writeDelimitedTo(out, this, this);
    }

    // message method

    public Schema<DVTIMESPECIFICATION> cachedSchema()
    {
        return this;
    }

    // schema methods

    public DVTIMESPECIFICATION newMessage()
    {
        return new DVTIMESPECIFICATION();
    }

    public Class<DVTIMESPECIFICATION> typeClass()
    {
        return DVTIMESPECIFICATION.class;
    }

    public String messageName()
    {
        return DVTIMESPECIFICATION.class.getSimpleName();
    }

    public String messageFullName()
    {
        return DVTIMESPECIFICATION.class.getName();
    }

    public boolean isInitialized(DVTIMESPECIFICATION message)
    {
        return 
            message.value != null;
    }

    public void mergeFrom(Input input, DVTIMESPECIFICATION message) throws IOException
    {
        for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
        {
            switch(number)
            {
                case 0:
                    return;
                case 1:
                    message.value = input.mergeObject(message.value, DVPARSABLE.getSchema());
                    break;

                default:
                    input.handleUnknownField(number, this);
            }   
        }
    }


    public void writeTo(Output output, DVTIMESPECIFICATION message) throws IOException
    {
        if(message.value == null)
            throw new UninitializedMessageException(message);
        output.writeObject(1, message.value, DVPARSABLE.getSchema(), false);

    }

    public String getFieldName(int number)
    {
        return Integer.toString(number);
    }

    public int getFieldNumber(String name)
    {
        return Integer.parseInt(name);
    }
    
}