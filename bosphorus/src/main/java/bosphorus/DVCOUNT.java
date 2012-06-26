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

public final class DVCOUNT implements Externalizable, Message<DVCOUNT>, Schema<DVCOUNT>
{

    public static Schema<DVCOUNT> getSchema()
    {
        return DEFAULT_INSTANCE;
    }

    public static DVCOUNT getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final DVCOUNT DEFAULT_INSTANCE = new DVCOUNT();

    
    private Integer magnitude;
    private DVINTERVAL normalrange;
    private List<REFERENCERANGE> otherreferenceranges;
    private CODEPHRASE normalstatus;
    private String magnitudestatus;
    private String accuracy;
    private Boolean accuracyispercent;

    public DVCOUNT()
    {
        
    }

    // getters and setters

    // magnitude

    public Integer getMagnitude()
    {
        return magnitude;
    }

    public void setMagnitude(Integer magnitude)
    {
        this.magnitude = magnitude;
    }

    // normalrange

    public DVINTERVAL getNormalrange()
    {
        return normalrange;
    }

    public void setNormalrange(DVINTERVAL normalrange)
    {
        this.normalrange = normalrange;
    }

    // otherreferenceranges

    public List<REFERENCERANGE> getOtherreferencerangesList()
    {
        return otherreferenceranges;
    }

    public void setOtherreferencerangesList(List<REFERENCERANGE> otherreferenceranges)
    {
        this.otherreferenceranges = otherreferenceranges;
    }

    // normalstatus

    public CODEPHRASE getNormalstatus()
    {
        return normalstatus;
    }

    public void setNormalstatus(CODEPHRASE normalstatus)
    {
        this.normalstatus = normalstatus;
    }

    // magnitudestatus

    public String getMagnitudestatus()
    {
        return magnitudestatus;
    }

    public void setMagnitudestatus(String magnitudestatus)
    {
        this.magnitudestatus = magnitudestatus;
    }

    // accuracy

    public String getAccuracy()
    {
        return accuracy;
    }

    public void setAccuracy(String accuracy)
    {
        this.accuracy = accuracy;
    }

    // accuracyispercent

    public Boolean getAccuracyispercent()
    {
        return accuracyispercent;
    }

    public void setAccuracyispercent(Boolean accuracyispercent)
    {
        this.accuracyispercent = accuracyispercent;
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

    public Schema<DVCOUNT> cachedSchema()
    {
        return this;
    }

    // schema methods

    public DVCOUNT newMessage()
    {
        return new DVCOUNT();
    }

    public Class<DVCOUNT> typeClass()
    {
        return DVCOUNT.class;
    }

    public String messageName()
    {
        return DVCOUNT.class.getSimpleName();
    }

    public String messageFullName()
    {
        return DVCOUNT.class.getName();
    }

    public boolean isInitialized(DVCOUNT message)
    {
        return true;
    }

    public void mergeFrom(Input input, DVCOUNT message) throws IOException
    {
        for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
        {
            switch(number)
            {
                case 0:
                    return;
                case 1:
                    message.magnitude = input.readInt32();
                    break;
                case 2:
                    message.normalrange = input.mergeObject(message.normalrange, DVINTERVAL.getSchema());
                    break;

                case 3:
                    if(message.otherreferenceranges == null)
                        message.otherreferenceranges = new ArrayList<REFERENCERANGE>();
                    message.otherreferenceranges.add(input.mergeObject(null, REFERENCERANGE.getSchema()));
                    break;

                case 4:
                    message.normalstatus = input.mergeObject(message.normalstatus, CODEPHRASE.getSchema());
                    break;

                case 5:
                    message.magnitudestatus = input.readString();
                    break;
                case 6:
                    message.accuracy = input.readString();
                    break;
                case 7:
                    message.accuracyispercent = input.readBool();
                    break;
                default:
                    input.handleUnknownField(number, this);
            }   
        }
    }


    public void writeTo(Output output, DVCOUNT message) throws IOException
    {
        if(message.magnitude != null)
            output.writeInt32(1, message.magnitude, false);

        if(message.normalrange != null)
             output.writeObject(2, message.normalrange, DVINTERVAL.getSchema(), false);


        if(message.otherreferenceranges != null)
        {
            for(REFERENCERANGE otherreferenceranges : message.otherreferenceranges)
            {
                if(otherreferenceranges != null)
                    output.writeObject(3, otherreferenceranges, REFERENCERANGE.getSchema(), true);
            }
        }


        if(message.normalstatus != null)
             output.writeObject(4, message.normalstatus, CODEPHRASE.getSchema(), false);


        if(message.magnitudestatus != null)
            output.writeString(5, message.magnitudestatus, false);

        if(message.accuracy != null)
            output.writeString(6, message.accuracy, false);

        if(message.accuracyispercent != null)
            output.writeBool(7, message.accuracyispercent, false);
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