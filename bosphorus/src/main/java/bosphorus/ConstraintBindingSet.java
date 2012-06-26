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

public final class ConstraintBindingSet implements Externalizable, Message<ConstraintBindingSet>, Schema<ConstraintBindingSet>
{

    public static Schema<ConstraintBindingSet> getSchema()
    {
        return DEFAULT_INSTANCE;
    }

    public static ConstraintBindingSet getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final ConstraintBindingSet DEFAULT_INSTANCE = new ConstraintBindingSet();

    
    private List<CONSTRAINTBINDINGITEM> items;
    private String terminology;

    public ConstraintBindingSet()
    {
        
    }

    // getters and setters

    // items

    public List<CONSTRAINTBINDINGITEM> getItemsList()
    {
        return items;
    }

    public void setItemsList(List<CONSTRAINTBINDINGITEM> items)
    {
        this.items = items;
    }

    // terminology

    public String getTerminology()
    {
        return terminology;
    }

    public void setTerminology(String terminology)
    {
        this.terminology = terminology;
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

    public Schema<ConstraintBindingSet> cachedSchema()
    {
        return this;
    }

    // schema methods

    public ConstraintBindingSet newMessage()
    {
        return new ConstraintBindingSet();
    }

    public Class<ConstraintBindingSet> typeClass()
    {
        return ConstraintBindingSet.class;
    }

    public String messageName()
    {
        return ConstraintBindingSet.class.getSimpleName();
    }

    public String messageFullName()
    {
        return ConstraintBindingSet.class.getName();
    }

    public boolean isInitialized(ConstraintBindingSet message)
    {
        return true;
    }

    public void mergeFrom(Input input, ConstraintBindingSet message) throws IOException
    {
        for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
        {
            switch(number)
            {
                case 0:
                    return;
                case 1:
                    if(message.items == null)
                        message.items = new ArrayList<CONSTRAINTBINDINGITEM>();
                    message.items.add(input.mergeObject(null, CONSTRAINTBINDINGITEM.getSchema()));
                    break;

                case 2:
                    message.terminology = input.readString();
                    break;
                default:
                    input.handleUnknownField(number, this);
            }   
        }
    }


    public void writeTo(Output output, ConstraintBindingSet message) throws IOException
    {
        if(message.items != null)
        {
            for(CONSTRAINTBINDINGITEM items : message.items)
            {
                if(items != null)
                    output.writeObject(1, items, CONSTRAINTBINDINGITEM.getSchema(), true);
            }
        }


        if(message.terminology != null)
            output.writeString(2, message.terminology, false);
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