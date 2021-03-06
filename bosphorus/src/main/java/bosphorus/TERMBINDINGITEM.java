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

public final class TERMBINDINGITEM implements Externalizable, Message<TERMBINDINGITEM>, Schema<TERMBINDINGITEM>
{

    public static Schema<TERMBINDINGITEM> getSchema()
    {
        return DEFAULT_INSTANCE;
    }

    public static TERMBINDINGITEM getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final TERMBINDINGITEM DEFAULT_INSTANCE = new TERMBINDINGITEM();

    
    private CODEPHRASE value;
    private String code;

    public TERMBINDINGITEM()
    {
        
    }

    public TERMBINDINGITEM(
        CODEPHRASE value
    )
    {
        this.value = value;
    }

    // getters and setters

    // value

    public CODEPHRASE getValue()
    {
        return value;
    }

    public void setValue(CODEPHRASE value)
    {
        this.value = value;
    }

    // code

    public String getCode()
    {
        return code;
    }

    public void setCode(String code)
    {
        this.code = code;
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

    public Schema<TERMBINDINGITEM> cachedSchema()
    {
        return this;
    }

    // schema methods

    public TERMBINDINGITEM newMessage()
    {
        return new TERMBINDINGITEM();
    }

    public Class<TERMBINDINGITEM> typeClass()
    {
        return TERMBINDINGITEM.class;
    }

    public String messageName()
    {
        return TERMBINDINGITEM.class.getSimpleName();
    }

    public String messageFullName()
    {
        return TERMBINDINGITEM.class.getName();
    }

    public boolean isInitialized(TERMBINDINGITEM message)
    {
        return 
            message.value != null;
    }

    public void mergeFrom(Input input, TERMBINDINGITEM message) throws IOException
    {
        for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
        {
            switch(number)
            {
                case 0:
                    return;
                case 1:
                    message.value = input.mergeObject(message.value, CODEPHRASE.getSchema());
                    break;

                case 2:
                    message.code = input.readString();
                    break;
                default:
                    input.handleUnknownField(number, this);
            }   
        }
    }


    public void writeTo(Output output, TERMBINDINGITEM message) throws IOException
    {
        if(message.value == null)
            throw new UninitializedMessageException(message);
        output.writeObject(1, message.value, CODEPHRASE.getSchema(), false);


        if(message.code != null)
            output.writeString(2, message.code, false);
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
