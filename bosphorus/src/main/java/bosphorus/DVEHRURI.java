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

public final class DVEHRURI implements Externalizable, Message<DVEHRURI>, Schema<DVEHRURI>
{

    public static Schema<DVEHRURI> getSchema()
    {
        return DEFAULT_INSTANCE;
    }

    public static DVEHRURI getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final DVEHRURI DEFAULT_INSTANCE = new DVEHRURI();

    
    private String value;

    public DVEHRURI()
    {
        
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

    public Schema<DVEHRURI> cachedSchema()
    {
        return this;
    }

    // schema methods

    public DVEHRURI newMessage()
    {
        return new DVEHRURI();
    }

    public Class<DVEHRURI> typeClass()
    {
        return DVEHRURI.class;
    }

    public String messageName()
    {
        return DVEHRURI.class.getSimpleName();
    }

    public String messageFullName()
    {
        return DVEHRURI.class.getName();
    }

    public boolean isInitialized(DVEHRURI message)
    {
        return true;
    }

    public void mergeFrom(Input input, DVEHRURI message) throws IOException
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


    public void writeTo(Output output, DVEHRURI message) throws IOException
    {
        if(message.value != null)
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