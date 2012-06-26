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

public final class DVENCAPSULATEDALTERNATIVES implements Externalizable, Message<DVENCAPSULATEDALTERNATIVES>, Schema<DVENCAPSULATEDALTERNATIVES>
{

    public static Schema<DVENCAPSULATEDALTERNATIVES> getSchema()
    {
        return DEFAULT_INSTANCE;
    }

    public static DVENCAPSULATEDALTERNATIVES getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final DVENCAPSULATEDALTERNATIVES DEFAULT_INSTANCE = new DVENCAPSULATEDALTERNATIVES();

    
    private DVMULTIMEDIA dvmultimediafield;
    private DVPARSABLE dvparsablefield;

    public DVENCAPSULATEDALTERNATIVES()
    {
        
    }

    // getters and setters

    // dvmultimediafield

    public DVMULTIMEDIA getDvmultimediafield()
    {
        return dvmultimediafield;
    }

    public void setDvmultimediafield(DVMULTIMEDIA dvmultimediafield)
    {
        this.dvmultimediafield = dvmultimediafield;
    }

    // dvparsablefield

    public DVPARSABLE getDvparsablefield()
    {
        return dvparsablefield;
    }

    public void setDvparsablefield(DVPARSABLE dvparsablefield)
    {
        this.dvparsablefield = dvparsablefield;
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

    public Schema<DVENCAPSULATEDALTERNATIVES> cachedSchema()
    {
        return this;
    }

    // schema methods

    public DVENCAPSULATEDALTERNATIVES newMessage()
    {
        return new DVENCAPSULATEDALTERNATIVES();
    }

    public Class<DVENCAPSULATEDALTERNATIVES> typeClass()
    {
        return DVENCAPSULATEDALTERNATIVES.class;
    }

    public String messageName()
    {
        return DVENCAPSULATEDALTERNATIVES.class.getSimpleName();
    }

    public String messageFullName()
    {
        return DVENCAPSULATEDALTERNATIVES.class.getName();
    }

    public boolean isInitialized(DVENCAPSULATEDALTERNATIVES message)
    {
        return true;
    }

    public void mergeFrom(Input input, DVENCAPSULATEDALTERNATIVES message) throws IOException
    {
        for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
        {
            switch(number)
            {
                case 0:
                    return;
                case 1:
                    message.dvmultimediafield = input.mergeObject(message.dvmultimediafield, DVMULTIMEDIA.getSchema());
                    break;

                case 2:
                    message.dvparsablefield = input.mergeObject(message.dvparsablefield, DVPARSABLE.getSchema());
                    break;

                default:
                    input.handleUnknownField(number, this);
            }   
        }
    }


    public void writeTo(Output output, DVENCAPSULATEDALTERNATIVES message) throws IOException
    {
        if(message.dvmultimediafield != null)
             output.writeObject(1, message.dvmultimediafield, DVMULTIMEDIA.getSchema(), false);


        if(message.dvparsablefield != null)
             output.writeObject(2, message.dvparsablefield, DVPARSABLE.getSchema(), false);

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
