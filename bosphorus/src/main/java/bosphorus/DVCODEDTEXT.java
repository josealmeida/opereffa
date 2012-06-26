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

public final class DVCODEDTEXT implements Externalizable, Message<DVCODEDTEXT>, Schema<DVCODEDTEXT>
{

    public static Schema<DVCODEDTEXT> getSchema()
    {
        return DEFAULT_INSTANCE;
    }

    public static DVCODEDTEXT getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final DVCODEDTEXT DEFAULT_INSTANCE = new DVCODEDTEXT();

    
    private CODEPHRASE definingcode;
    private String value;
    private DVURI hyperlink;
    private String formatting;
    private List<TERMMAPPING> mappings;
    private CODEPHRASE language;
    private CODEPHRASE encoding;

    public DVCODEDTEXT()
    {
        
    }

    public DVCODEDTEXT(
        CODEPHRASE definingcode,
        String value
    )
    {
        this.definingcode = definingcode;
        this.value = value;
    }

    // getters and setters

    // definingcode

    public CODEPHRASE getDefiningcode()
    {
        return definingcode;
    }

    public void setDefiningcode(CODEPHRASE definingcode)
    {
        this.definingcode = definingcode;
    }

    // value

    public String getValue()
    {
        return value;
    }

    public void setValue(String value)
    {
        this.value = value;
    }

    // hyperlink

    public DVURI getHyperlink()
    {
        return hyperlink;
    }

    public void setHyperlink(DVURI hyperlink)
    {
        this.hyperlink = hyperlink;
    }

    // formatting

    public String getFormatting()
    {
        return formatting;
    }

    public void setFormatting(String formatting)
    {
        this.formatting = formatting;
    }

    // mappings

    public List<TERMMAPPING> getMappingsList()
    {
        return mappings;
    }

    public void setMappingsList(List<TERMMAPPING> mappings)
    {
        this.mappings = mappings;
    }

    // language

    public CODEPHRASE getLanguage()
    {
        return language;
    }

    public void setLanguage(CODEPHRASE language)
    {
        this.language = language;
    }

    // encoding

    public CODEPHRASE getEncoding()
    {
        return encoding;
    }

    public void setEncoding(CODEPHRASE encoding)
    {
        this.encoding = encoding;
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

    public Schema<DVCODEDTEXT> cachedSchema()
    {
        return this;
    }

    // schema methods

    public DVCODEDTEXT newMessage()
    {
        return new DVCODEDTEXT();
    }

    public Class<DVCODEDTEXT> typeClass()
    {
        return DVCODEDTEXT.class;
    }

    public String messageName()
    {
        return DVCODEDTEXT.class.getSimpleName();
    }

    public String messageFullName()
    {
        return DVCODEDTEXT.class.getName();
    }

    public boolean isInitialized(DVCODEDTEXT message)
    {
        return 
            message.definingcode != null 
            && message.value != null;
    }

    public void mergeFrom(Input input, DVCODEDTEXT message) throws IOException
    {
        for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
        {
            switch(number)
            {
                case 0:
                    return;
                case 1:
                    message.definingcode = input.mergeObject(message.definingcode, CODEPHRASE.getSchema());
                    break;

                case 2:
                    message.value = input.readString();
                    break;
                case 3:
                    message.hyperlink = input.mergeObject(message.hyperlink, DVURI.getSchema());
                    break;

                case 4:
                    message.formatting = input.readString();
                    break;
                case 5:
                    if(message.mappings == null)
                        message.mappings = new ArrayList<TERMMAPPING>();
                    message.mappings.add(input.mergeObject(null, TERMMAPPING.getSchema()));
                    break;

                case 6:
                    message.language = input.mergeObject(message.language, CODEPHRASE.getSchema());
                    break;

                case 7:
                    message.encoding = input.mergeObject(message.encoding, CODEPHRASE.getSchema());
                    break;

                default:
                    input.handleUnknownField(number, this);
            }   
        }
    }


    public void writeTo(Output output, DVCODEDTEXT message) throws IOException
    {
        if(message.definingcode == null)
            throw new UninitializedMessageException(message);
        output.writeObject(1, message.definingcode, CODEPHRASE.getSchema(), false);


        if(message.value == null)
            throw new UninitializedMessageException(message);
        output.writeString(2, message.value, false);

        if(message.hyperlink != null)
             output.writeObject(3, message.hyperlink, DVURI.getSchema(), false);


        if(message.formatting != null)
            output.writeString(4, message.formatting, false);

        if(message.mappings != null)
        {
            for(TERMMAPPING mappings : message.mappings)
            {
                if(mappings != null)
                    output.writeObject(5, mappings, TERMMAPPING.getSchema(), true);
            }
        }


        if(message.language != null)
             output.writeObject(6, message.language, CODEPHRASE.getSchema(), false);


        if(message.encoding != null)
             output.writeObject(7, message.encoding, CODEPHRASE.getSchema(), false);

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