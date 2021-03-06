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

public final class DVORDEREDALTERNATIVES implements Externalizable, Message<DVORDEREDALTERNATIVES>, Schema<DVORDEREDALTERNATIVES>
{

    public static Schema<DVORDEREDALTERNATIVES> getSchema()
    {
        return DEFAULT_INSTANCE;
    }

    public static DVORDEREDALTERNATIVES getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final DVORDEREDALTERNATIVES DEFAULT_INSTANCE = new DVORDEREDALTERNATIVES();

    
    private DVPROPORTION dvproportionfield;
    private DVCOUNT dvcountfield;
    private DVTEMPORAL dvtemporalfield;
    private DVTIME dvtimefield;
    private DVQUANTITY dvquantityfield;
    private DVDURATION dvdurationfield;
    private DVDATE dvdatefield;
    private DVAMOUNT dvamountfield;
    private DVDATETIME dvdatetimefield;
    private DVORDINAL dvordinalfield;

    public DVORDEREDALTERNATIVES()
    {
        
    }

    // getters and setters

    // dvproportionfield

    public DVPROPORTION getDvproportionfield()
    {
        return dvproportionfield;
    }

    public void setDvproportionfield(DVPROPORTION dvproportionfield)
    {
        this.dvproportionfield = dvproportionfield;
    }

    // dvcountfield

    public DVCOUNT getDvcountfield()
    {
        return dvcountfield;
    }

    public void setDvcountfield(DVCOUNT dvcountfield)
    {
        this.dvcountfield = dvcountfield;
    }

    // dvtemporalfield

    public DVTEMPORAL getDvtemporalfield()
    {
        return dvtemporalfield;
    }

    public void setDvtemporalfield(DVTEMPORAL dvtemporalfield)
    {
        this.dvtemporalfield = dvtemporalfield;
    }

    // dvtimefield

    public DVTIME getDvtimefield()
    {
        return dvtimefield;
    }

    public void setDvtimefield(DVTIME dvtimefield)
    {
        this.dvtimefield = dvtimefield;
    }

    // dvquantityfield

    public DVQUANTITY getDvquantityfield()
    {
        return dvquantityfield;
    }

    public void setDvquantityfield(DVQUANTITY dvquantityfield)
    {
        this.dvquantityfield = dvquantityfield;
    }

    // dvdurationfield

    public DVDURATION getDvdurationfield()
    {
        return dvdurationfield;
    }

    public void setDvdurationfield(DVDURATION dvdurationfield)
    {
        this.dvdurationfield = dvdurationfield;
    }

    // dvdatefield

    public DVDATE getDvdatefield()
    {
        return dvdatefield;
    }

    public void setDvdatefield(DVDATE dvdatefield)
    {
        this.dvdatefield = dvdatefield;
    }

    // dvamountfield

    public DVAMOUNT getDvamountfield()
    {
        return dvamountfield;
    }

    public void setDvamountfield(DVAMOUNT dvamountfield)
    {
        this.dvamountfield = dvamountfield;
    }

    // dvdatetimefield

    public DVDATETIME getDvdatetimefield()
    {
        return dvdatetimefield;
    }

    public void setDvdatetimefield(DVDATETIME dvdatetimefield)
    {
        this.dvdatetimefield = dvdatetimefield;
    }

    // dvordinalfield

    public DVORDINAL getDvordinalfield()
    {
        return dvordinalfield;
    }

    public void setDvordinalfield(DVORDINAL dvordinalfield)
    {
        this.dvordinalfield = dvordinalfield;
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

    public Schema<DVORDEREDALTERNATIVES> cachedSchema()
    {
        return this;
    }

    // schema methods

    public DVORDEREDALTERNATIVES newMessage()
    {
        return new DVORDEREDALTERNATIVES();
    }

    public Class<DVORDEREDALTERNATIVES> typeClass()
    {
        return DVORDEREDALTERNATIVES.class;
    }

    public String messageName()
    {
        return DVORDEREDALTERNATIVES.class.getSimpleName();
    }

    public String messageFullName()
    {
        return DVORDEREDALTERNATIVES.class.getName();
    }

    public boolean isInitialized(DVORDEREDALTERNATIVES message)
    {
        return true;
    }

    public void mergeFrom(Input input, DVORDEREDALTERNATIVES message) throws IOException
    {
        for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
        {
            switch(number)
            {
                case 0:
                    return;
                case 1:
                    message.dvproportionfield = input.mergeObject(message.dvproportionfield, DVPROPORTION.getSchema());
                    break;

                case 2:
                    message.dvcountfield = input.mergeObject(message.dvcountfield, DVCOUNT.getSchema());
                    break;

                case 3:
                    message.dvtemporalfield = input.mergeObject(message.dvtemporalfield, DVTEMPORAL.getSchema());
                    break;

                case 4:
                    message.dvtimefield = input.mergeObject(message.dvtimefield, DVTIME.getSchema());
                    break;

                case 5:
                    message.dvquantityfield = input.mergeObject(message.dvquantityfield, DVQUANTITY.getSchema());
                    break;

                case 6:
                    message.dvdurationfield = input.mergeObject(message.dvdurationfield, DVDURATION.getSchema());
                    break;

                case 7:
                    message.dvdatefield = input.mergeObject(message.dvdatefield, DVDATE.getSchema());
                    break;

                case 8:
                    message.dvamountfield = input.mergeObject(message.dvamountfield, DVAMOUNT.getSchema());
                    break;

                case 9:
                    message.dvdatetimefield = input.mergeObject(message.dvdatetimefield, DVDATETIME.getSchema());
                    break;

                case 10:
                    message.dvordinalfield = input.mergeObject(message.dvordinalfield, DVORDINAL.getSchema());
                    break;

                default:
                    input.handleUnknownField(number, this);
            }   
        }
    }


    public void writeTo(Output output, DVORDEREDALTERNATIVES message) throws IOException
    {
        if(message.dvproportionfield != null)
             output.writeObject(1, message.dvproportionfield, DVPROPORTION.getSchema(), false);


        if(message.dvcountfield != null)
             output.writeObject(2, message.dvcountfield, DVCOUNT.getSchema(), false);


        if(message.dvtemporalfield != null)
             output.writeObject(3, message.dvtemporalfield, DVTEMPORAL.getSchema(), false);


        if(message.dvtimefield != null)
             output.writeObject(4, message.dvtimefield, DVTIME.getSchema(), false);


        if(message.dvquantityfield != null)
             output.writeObject(5, message.dvquantityfield, DVQUANTITY.getSchema(), false);


        if(message.dvdurationfield != null)
             output.writeObject(6, message.dvdurationfield, DVDURATION.getSchema(), false);


        if(message.dvdatefield != null)
             output.writeObject(7, message.dvdatefield, DVDATE.getSchema(), false);


        if(message.dvamountfield != null)
             output.writeObject(8, message.dvamountfield, DVAMOUNT.getSchema(), false);


        if(message.dvdatetimefield != null)
             output.writeObject(9, message.dvdatetimefield, DVDATETIME.getSchema(), false);


        if(message.dvordinalfield != null)
             output.writeObject(10, message.dvordinalfield, DVORDINAL.getSchema(), false);

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
