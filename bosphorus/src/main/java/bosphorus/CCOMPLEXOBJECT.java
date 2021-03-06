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
import com.dyuproject.protostuff.UninitializedMessageException;

public final class CCOMPLEXOBJECT implements Externalizable, Message<CCOMPLEXOBJECT>, Schema<CCOMPLEXOBJECT>
{

    public static Schema<CCOMPLEXOBJECT> getSchema()
    {
        return DEFAULT_INSTANCE;
    }

    public static CCOMPLEXOBJECT getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final CCOMPLEXOBJECT DEFAULT_INSTANCE = new CCOMPLEXOBJECT();

    
    private List<CATTRIBUTEALTERNATIVES> attributes;
    private String rmtypename;
    private IntervalOfInteger occurrences;
    private String nodeid;

    public CCOMPLEXOBJECT()
    {
        
    }

    public CCOMPLEXOBJECT(
        String rmtypename,
        IntervalOfInteger occurrences,
        String nodeid
    )
    {
        this.rmtypename = rmtypename;
        this.occurrences = occurrences;
        this.nodeid = nodeid;
    }

    // getters and setters

    // attributes

    public List<CATTRIBUTEALTERNATIVES> getAttributesList()
    {
        return attributes;
    }

    public void setAttributesList(List<CATTRIBUTEALTERNATIVES> attributes)
    {
        this.attributes = attributes;
    }

    // rmtypename

    public String getRmtypename()
    {
        return rmtypename;
    }

    public void setRmtypename(String rmtypename)
    {
        this.rmtypename = rmtypename;
    }

    // occurrences

    public IntervalOfInteger getOccurrences()
    {
        return occurrences;
    }

    public void setOccurrences(IntervalOfInteger occurrences)
    {
        this.occurrences = occurrences;
    }

    // nodeid

    public String getNodeid()
    {
        return nodeid;
    }

    public void setNodeid(String nodeid)
    {
        this.nodeid = nodeid;
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

    public Schema<CCOMPLEXOBJECT> cachedSchema()
    {
        return this;
    }

    // schema methods

    public CCOMPLEXOBJECT newMessage()
    {
        return new CCOMPLEXOBJECT();
    }

    public Class<CCOMPLEXOBJECT> typeClass()
    {
        return CCOMPLEXOBJECT.class;
    }

    public String messageName()
    {
        return CCOMPLEXOBJECT.class.getSimpleName();
    }

    public String messageFullName()
    {
        return CCOMPLEXOBJECT.class.getName();
    }

    public boolean isInitialized(CCOMPLEXOBJECT message)
    {
        return 
            message.rmtypename != null 
            && message.occurrences != null 
            && message.nodeid != null;
    }

    public void mergeFrom(Input input, CCOMPLEXOBJECT message) throws IOException
    {
        for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
        {
            switch(number)
            {
                case 0:
                    return;
                case 1:
                    if(message.attributes == null)
                        message.attributes = new ArrayList<CATTRIBUTEALTERNATIVES>();
                    message.attributes.add(input.mergeObject(null, CATTRIBUTEALTERNATIVES.getSchema()));
                    break;

                case 2:
                    message.rmtypename = input.readString();
                    break;
                case 3:
                    message.occurrences = input.mergeObject(message.occurrences, IntervalOfInteger.getSchema());
                    break;

                case 4:
                    message.nodeid = input.readString();
                    break;
                default:
                    input.handleUnknownField(number, this);
            }   
        }
    }


    public void writeTo(Output output, CCOMPLEXOBJECT message) throws IOException
    {
        if(message.attributes != null)
        {
            for(CATTRIBUTEALTERNATIVES attributes : message.attributes)
            {
                if(attributes != null)
                    output.writeObject(1, attributes, CATTRIBUTEALTERNATIVES.getSchema(), true);
            }
        }


        if(message.rmtypename == null)
            throw new UninitializedMessageException(message);
        output.writeString(2, message.rmtypename, false);

        if(message.occurrences == null)
            throw new UninitializedMessageException(message);
        output.writeObject(3, message.occurrences, IntervalOfInteger.getSchema(), false);


        if(message.nodeid == null)
            throw new UninitializedMessageException(message);
        output.writeString(4, message.nodeid, false);
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
