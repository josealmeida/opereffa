// Generated by http://code.google.com/p/protostuff/ ... DO NOT EDIT!
// Generated from aom.proto

package bosphorus;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

import com.dyuproject.protostuff.GraphIOUtil;
import com.dyuproject.protostuff.Input;
import com.dyuproject.protostuff.Message;
import com.dyuproject.protostuff.Output;
import com.dyuproject.protostuff.Schema;

public final class CSTRING implements Externalizable, Message<CSTRING>, Schema<CSTRING>
{

    public static Schema<CSTRING> getSchema()
    {
        return DEFAULT_INSTANCE;
    }

    public static CSTRING getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final CSTRING DEFAULT_INSTANCE = new CSTRING();

    
    private String pattern;
    private List<String> list;
    private Boolean listopen;
    private String assumedvalue;

    public CSTRING()
    {
        
    }

    // getters and setters

    // pattern

    public String getPattern()
    {
        return pattern;
    }

    public void setPattern(String pattern)
    {
        this.pattern = pattern;
    }

    // list

    public List<String> getListList()
    {
        return list;
    }

    public void setListList(List<String> list)
    {
        this.list = list;
    }

    // listopen

    public Boolean getListopen()
    {
        return listopen;
    }

    public void setListopen(Boolean listopen)
    {
        this.listopen = listopen;
    }

    // assumedvalue

    public String getAssumedvalue()
    {
        return assumedvalue;
    }

    public void setAssumedvalue(String assumedvalue)
    {
        this.assumedvalue = assumedvalue;
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

    public Schema<CSTRING> cachedSchema()
    {
        return this;
    }

    // schema methods

    public CSTRING newMessage()
    {
        return new CSTRING();
    }

    public Class<CSTRING> typeClass()
    {
        return CSTRING.class;
    }

    public String messageName()
    {
        return CSTRING.class.getSimpleName();
    }

    public String messageFullName()
    {
        return CSTRING.class.getName();
    }

    public boolean isInitialized(CSTRING message)
    {
        return true;
    }

    public void mergeFrom(Input input, CSTRING message) throws IOException
    {
        for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
        {
            switch(number)
            {
                case 0:
                    return;
                case 1:
                    message.pattern = input.readString();
                    break;
                case 2:
                    if(message.list == null)
                        message.list = new ArrayList<String>();
                    message.list.add(input.readString());
                    break;
                case 3:
                    message.listopen = input.readBool();
                    break;
                case 4:
                    message.assumedvalue = input.readString();
                    break;
                default:
                    input.handleUnknownField(number, this);
            }   
        }
    }


    public void writeTo(Output output, CSTRING message) throws IOException
    {
        if(message.pattern != null)
            output.writeString(1, message.pattern, false);

        if(message.list != null)
        {
            for(String list : message.list)
            {
                if(list != null)
                    output.writeString(2, list, true);
            }
        }

        if(message.listopen != null)
            output.writeBool(3, message.listopen, false);

        if(message.assumedvalue != null)
            output.writeString(4, message.assumedvalue, false);
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