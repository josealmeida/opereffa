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

public final class CATTRIBUTE implements Externalizable, Message<CATTRIBUTE>, Schema<CATTRIBUTE>
{

    public static Schema<CATTRIBUTE> getSchema()
    {
        return DEFAULT_INSTANCE;
    }

    public static CATTRIBUTE getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final CATTRIBUTE DEFAULT_INSTANCE = new CATTRIBUTE();

    
    private String rmattributename;
    private IntervalOfInteger existence;
    private List<COBJECTALTERNATIVES> children;

    public CATTRIBUTE()
    {
        
    }

    public CATTRIBUTE(
        String rmattributename,
        IntervalOfInteger existence
    )
    {
        this.rmattributename = rmattributename;
        this.existence = existence;
    }

    // getters and setters

    // rmattributename

    public String getRmattributename()
    {
        return rmattributename;
    }

    public void setRmattributename(String rmattributename)
    {
        this.rmattributename = rmattributename;
    }

    // existence

    public IntervalOfInteger getExistence()
    {
        return existence;
    }

    public void setExistence(IntervalOfInteger existence)
    {
        this.existence = existence;
    }

    // children

    public List<COBJECTALTERNATIVES> getChildrenList()
    {
        return children;
    }

    public void setChildrenList(List<COBJECTALTERNATIVES> children)
    {
        this.children = children;
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

    public Schema<CATTRIBUTE> cachedSchema()
    {
        return this;
    }

    // schema methods

    public CATTRIBUTE newMessage()
    {
        return new CATTRIBUTE();
    }

    public Class<CATTRIBUTE> typeClass()
    {
        return CATTRIBUTE.class;
    }

    public String messageName()
    {
        return CATTRIBUTE.class.getSimpleName();
    }

    public String messageFullName()
    {
        return CATTRIBUTE.class.getName();
    }

    public boolean isInitialized(CATTRIBUTE message)
    {
        return 
            message.rmattributename != null 
            && message.existence != null;
    }

    public void mergeFrom(Input input, CATTRIBUTE message) throws IOException
    {
        for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
        {
            switch(number)
            {
                case 0:
                    return;
                case 1:
                    message.rmattributename = input.readString();
                    break;
                case 2:
                    message.existence = input.mergeObject(message.existence, IntervalOfInteger.getSchema());
                    break;

                case 3:
                    if(message.children == null)
                        message.children = new ArrayList<COBJECTALTERNATIVES>();
                    message.children.add(input.mergeObject(null, COBJECTALTERNATIVES.getSchema()));
                    break;

                default:
                    input.handleUnknownField(number, this);
            }   
        }
    }


    public void writeTo(Output output, CATTRIBUTE message) throws IOException
    {
        if(message.rmattributename == null)
            throw new UninitializedMessageException(message);
        output.writeString(1, message.rmattributename, false);

        if(message.existence == null)
            throw new UninitializedMessageException(message);
        output.writeObject(2, message.existence, IntervalOfInteger.getSchema(), false);


        if(message.children != null)
        {
            for(COBJECTALTERNATIVES children : message.children)
            {
                if(children != null)
                    output.writeObject(3, children, COBJECTALTERNATIVES.getSchema(), true);
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
