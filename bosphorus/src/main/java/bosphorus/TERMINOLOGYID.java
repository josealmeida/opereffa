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

public final class TERMINOLOGYID implements Externalizable, Message<TERMINOLOGYID>, Schema<TERMINOLOGYID>
{

    public static Schema<TERMINOLOGYID> getSchema()
    {
        return DEFAULT_INSTANCE;
    }

    public static TERMINOLOGYID getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final TERMINOLOGYID DEFAULT_INSTANCE = new TERMINOLOGYID();

    
    private String value;

    public TERMINOLOGYID()
    {
        
    }

    public TERMINOLOGYID(
        String value
    )
    {
        this.value = value;
    }

    // getters and setters

    // value

    public String getValue()
    {
        return value;
    }

    public void setValue(String value)
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

    public Schema<TERMINOLOGYID> cachedSchema()
    {
        return this;
    }

    // schema methods

    public TERMINOLOGYID newMessage()
    {
        return new TERMINOLOGYID();
    }

    public Class<TERMINOLOGYID> typeClass()
    {
        return TERMINOLOGYID.class;
    }

    public String messageName()
    {
        return TERMINOLOGYID.class.getSimpleName();
    }

    public String messageFullName()
    {
        return TERMINOLOGYID.class.getName();
    }

    public boolean isInitialized(TERMINOLOGYID message)
    {
        return 
            message.value != null;
    }

    public void mergeFrom(Input input, TERMINOLOGYID message) throws IOException
    {
        for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
        {
            switch(number)
            {
                case 0:
                    return;
                case 1:
                    message.value = input.readString();
                    break;
                default:
                    input.handleUnknownField(number, this);
            }   
        }
    }


    public void writeTo(Output output, TERMINOLOGYID message) throws IOException
    {
        if(message.value == null)
            throw new UninitializedMessageException(message);
        output.writeString(1, message.value, false);
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