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

public final class CDATETIME implements Externalizable, Message<CDATETIME>, Schema<CDATETIME>
{

    public static Schema<CDATETIME> getSchema()
    {
        return DEFAULT_INSTANCE;
    }

    public static CDATETIME getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final CDATETIME DEFAULT_INSTANCE = new CDATETIME();

    
    private String pattern;
    private String timezonevalidity;
    private IntervalOfDateTime range;
    private String assumedvalue;

    public CDATETIME()
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

    // timezonevalidity

    public String getTimezonevalidity()
    {
        return timezonevalidity;
    }

    public void setTimezonevalidity(String timezonevalidity)
    {
        this.timezonevalidity = timezonevalidity;
    }

    // range

    public IntervalOfDateTime getRange()
    {
        return range;
    }

    public void setRange(IntervalOfDateTime range)
    {
        this.range = range;
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

    public Schema<CDATETIME> cachedSchema()
    {
        return this;
    }

    // schema methods

    public CDATETIME newMessage()
    {
        return new CDATETIME();
    }

    public Class<CDATETIME> typeClass()
    {
        return CDATETIME.class;
    }

    public String messageName()
    {
        return CDATETIME.class.getSimpleName();
    }

    public String messageFullName()
    {
        return CDATETIME.class.getName();
    }

    public boolean isInitialized(CDATETIME message)
    {
        return true;
    }

    public void mergeFrom(Input input, CDATETIME message) throws IOException
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
                    message.timezonevalidity = input.readString();
                    break;
                case 3:
                    message.range = input.mergeObject(message.range, IntervalOfDateTime.getSchema());
                    break;

                case 4:
                    message.assumedvalue = input.readString();
                    break;
                default:
                    input.handleUnknownField(number, this);
            }   
        }
    }


    public void writeTo(Output output, CDATETIME message) throws IOException
    {
        if(message.pattern != null)
            output.writeString(1, message.pattern, false);

        if(message.timezonevalidity != null)
            output.writeString(2, message.timezonevalidity, false);

        if(message.range != null)
             output.writeObject(3, message.range, IntervalOfDateTime.getSchema(), false);


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
