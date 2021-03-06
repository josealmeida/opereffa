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

public final class REVISIONHISTORY implements Externalizable, Message<REVISIONHISTORY>, Schema<REVISIONHISTORY>
{

    public static Schema<REVISIONHISTORY> getSchema()
    {
        return DEFAULT_INSTANCE;
    }

    public static REVISIONHISTORY getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final REVISIONHISTORY DEFAULT_INSTANCE = new REVISIONHISTORY();

    
    private List<REVISIONHISTORYITEM> items;

    public REVISIONHISTORY()
    {
        
    }

    // getters and setters

    // items

    public List<REVISIONHISTORYITEM> getItemsList()
    {
        return items;
    }

    public void setItemsList(List<REVISIONHISTORYITEM> items)
    {
        this.items = items;
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

    public Schema<REVISIONHISTORY> cachedSchema()
    {
        return this;
    }

    // schema methods

    public REVISIONHISTORY newMessage()
    {
        return new REVISIONHISTORY();
    }

    public Class<REVISIONHISTORY> typeClass()
    {
        return REVISIONHISTORY.class;
    }

    public String messageName()
    {
        return REVISIONHISTORY.class.getSimpleName();
    }

    public String messageFullName()
    {
        return REVISIONHISTORY.class.getName();
    }

    public boolean isInitialized(REVISIONHISTORY message)
    {
        return true;
    }

    public void mergeFrom(Input input, REVISIONHISTORY message) throws IOException
    {
        for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
        {
            switch(number)
            {
                case 0:
                    return;
                case 1:
                    if(message.items == null)
                        message.items = new ArrayList<REVISIONHISTORYITEM>();
                    message.items.add(input.mergeObject(null, REVISIONHISTORYITEM.getSchema()));
                    break;

                default:
                    input.handleUnknownField(number, this);
            }   
        }
    }


    public void writeTo(Output output, REVISIONHISTORY message) throws IOException
    {
        if(message.items != null)
        {
            for(REVISIONHISTORYITEM items : message.items)
            {
                if(items != null)
                    output.writeObject(1, items, REVISIONHISTORYITEM.getSchema(), true);
            }
        }

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
