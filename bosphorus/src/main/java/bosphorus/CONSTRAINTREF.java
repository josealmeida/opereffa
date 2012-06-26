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

public final class CONSTRAINTREF implements Externalizable, Message<CONSTRAINTREF>, Schema<CONSTRAINTREF>
{

    public static Schema<CONSTRAINTREF> getSchema()
    {
        return DEFAULT_INSTANCE;
    }

    public static CONSTRAINTREF getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final CONSTRAINTREF DEFAULT_INSTANCE = new CONSTRAINTREF();

    
    private String reference;
    private String rmtypename;
    private IntervalOfInteger occurrences;
    private String nodeid;

    public CONSTRAINTREF()
    {
        
    }

    public CONSTRAINTREF(
        String reference,
        String rmtypename,
        IntervalOfInteger occurrences,
        String nodeid
    )
    {
        this.reference = reference;
        this.rmtypename = rmtypename;
        this.occurrences = occurrences;
        this.nodeid = nodeid;
    }

    // getters and setters

    // reference

    public String getReference()
    {
        return reference;
    }

    public void setReference(String reference)
    {
        this.reference = reference;
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

    public Schema<CONSTRAINTREF> cachedSchema()
    {
        return this;
    }

    // schema methods

    public CONSTRAINTREF newMessage()
    {
        return new CONSTRAINTREF();
    }

    public Class<CONSTRAINTREF> typeClass()
    {
        return CONSTRAINTREF.class;
    }

    public String messageName()
    {
        return CONSTRAINTREF.class.getSimpleName();
    }

    public String messageFullName()
    {
        return CONSTRAINTREF.class.getName();
    }

    public boolean isInitialized(CONSTRAINTREF message)
    {
        return 
            message.reference != null 
            && message.rmtypename != null 
            && message.occurrences != null 
            && message.nodeid != null;
    }

    public void mergeFrom(Input input, CONSTRAINTREF message) throws IOException
    {
        for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
        {
            switch(number)
            {
                case 0:
                    return;
                case 1:
                    message.reference = input.readString();
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


    public void writeTo(Output output, CONSTRAINTREF message) throws IOException
    {
        if(message.reference == null)
            throw new UninitializedMessageException(message);
        output.writeString(1, message.reference, false);

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
