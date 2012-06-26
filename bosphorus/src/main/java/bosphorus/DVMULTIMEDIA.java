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

public final class DVMULTIMEDIA implements Externalizable, Message<DVMULTIMEDIA>, Schema<DVMULTIMEDIA>
{

    public static Schema<DVMULTIMEDIA> getSchema()
    {
        return DEFAULT_INSTANCE;
    }

    public static DVMULTIMEDIA getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final DVMULTIMEDIA DEFAULT_INSTANCE = new DVMULTIMEDIA();

    
    private String alternatetext;
    private DVURI uri;
    private List<String> data;
    private CODEPHRASE mediatype;
    private CODEPHRASE compressionalgorithm;
    private List<String> integritycheck;
    private CODEPHRASE integritycheckalgorithm;
    private Integer size;
    private DVMULTIMEDIA thumbnail;
    private CODEPHRASE charset;
    private CODEPHRASE language;

    public DVMULTIMEDIA()
    {
        
    }

    public DVMULTIMEDIA(
        CODEPHRASE mediatype
    )
    {
        this.mediatype = mediatype;
    }

    // getters and setters

    // alternatetext

    public String getAlternatetext()
    {
        return alternatetext;
    }

    public void setAlternatetext(String alternatetext)
    {
        this.alternatetext = alternatetext;
    }

    // uri

    public DVURI getUri()
    {
        return uri;
    }

    public void setUri(DVURI uri)
    {
        this.uri = uri;
    }

    // data

    public List<String> getDataList()
    {
        return data;
    }

    public void setDataList(List<String> data)
    {
        this.data = data;
    }

    // mediatype

    public CODEPHRASE getMediatype()
    {
        return mediatype;
    }

    public void setMediatype(CODEPHRASE mediatype)
    {
        this.mediatype = mediatype;
    }

    // compressionalgorithm

    public CODEPHRASE getCompressionalgorithm()
    {
        return compressionalgorithm;
    }

    public void setCompressionalgorithm(CODEPHRASE compressionalgorithm)
    {
        this.compressionalgorithm = compressionalgorithm;
    }

    // integritycheck

    public List<String> getIntegritycheckList()
    {
        return integritycheck;
    }

    public void setIntegritycheckList(List<String> integritycheck)
    {
        this.integritycheck = integritycheck;
    }

    // integritycheckalgorithm

    public CODEPHRASE getIntegritycheckalgorithm()
    {
        return integritycheckalgorithm;
    }

    public void setIntegritycheckalgorithm(CODEPHRASE integritycheckalgorithm)
    {
        this.integritycheckalgorithm = integritycheckalgorithm;
    }

    // size

    public Integer getSize()
    {
        return size;
    }

    public void setSize(Integer size)
    {
        this.size = size;
    }

    // thumbnail

    public DVMULTIMEDIA getThumbnail()
    {
        return thumbnail;
    }

    public void setThumbnail(DVMULTIMEDIA thumbnail)
    {
        this.thumbnail = thumbnail;
    }

    // charset

    public CODEPHRASE getCharset()
    {
        return charset;
    }

    public void setCharset(CODEPHRASE charset)
    {
        this.charset = charset;
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

    public Schema<DVMULTIMEDIA> cachedSchema()
    {
        return this;
    }

    // schema methods

    public DVMULTIMEDIA newMessage()
    {
        return new DVMULTIMEDIA();
    }

    public Class<DVMULTIMEDIA> typeClass()
    {
        return DVMULTIMEDIA.class;
    }

    public String messageName()
    {
        return DVMULTIMEDIA.class.getSimpleName();
    }

    public String messageFullName()
    {
        return DVMULTIMEDIA.class.getName();
    }

    public boolean isInitialized(DVMULTIMEDIA message)
    {
        return 
            message.mediatype != null;
    }

    public void mergeFrom(Input input, DVMULTIMEDIA message) throws IOException
    {
        for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
        {
            switch(number)
            {
                case 0:
                    return;
                case 1:
                    message.alternatetext = input.readString();
                    break;
                case 2:
                    message.uri = input.mergeObject(message.uri, DVURI.getSchema());
                    break;

                case 3:
                    if(message.data == null)
                        message.data = new ArrayList<String>();
                    message.data.add(input.readString());
                    break;
                case 4:
                    message.mediatype = input.mergeObject(message.mediatype, CODEPHRASE.getSchema());
                    break;

                case 5:
                    message.compressionalgorithm = input.mergeObject(message.compressionalgorithm, CODEPHRASE.getSchema());
                    break;

                case 6:
                    if(message.integritycheck == null)
                        message.integritycheck = new ArrayList<String>();
                    message.integritycheck.add(input.readString());
                    break;
                case 7:
                    message.integritycheckalgorithm = input.mergeObject(message.integritycheckalgorithm, CODEPHRASE.getSchema());
                    break;

                case 8:
                    message.size = input.readInt32();
                    break;
                case 9:
                    message.thumbnail = input.mergeObject(message.thumbnail, DVMULTIMEDIA.getSchema());
                    break;

                case 10:
                    message.charset = input.mergeObject(message.charset, CODEPHRASE.getSchema());
                    break;

                case 11:
                    message.language = input.mergeObject(message.language, CODEPHRASE.getSchema());
                    break;

                default:
                    input.handleUnknownField(number, this);
            }   
        }
    }


    public void writeTo(Output output, DVMULTIMEDIA message) throws IOException
    {
        if(message.alternatetext != null)
            output.writeString(1, message.alternatetext, false);

        if(message.uri != null)
             output.writeObject(2, message.uri, DVURI.getSchema(), false);


        if(message.data != null)
        {
            for(String data : message.data)
            {
                if(data != null)
                    output.writeString(3, data, true);
            }
        }

        if(message.mediatype == null)
            throw new UninitializedMessageException(message);
        output.writeObject(4, message.mediatype, CODEPHRASE.getSchema(), false);


        if(message.compressionalgorithm != null)
             output.writeObject(5, message.compressionalgorithm, CODEPHRASE.getSchema(), false);


        if(message.integritycheck != null)
        {
            for(String integritycheck : message.integritycheck)
            {
                if(integritycheck != null)
                    output.writeString(6, integritycheck, true);
            }
        }

        if(message.integritycheckalgorithm != null)
             output.writeObject(7, message.integritycheckalgorithm, CODEPHRASE.getSchema(), false);


        if(message.size != null)
            output.writeInt32(8, message.size, false);

        if(message.thumbnail != null)
             output.writeObject(9, message.thumbnail, DVMULTIMEDIA.getSchema(), false);


        if(message.charset != null)
             output.writeObject(10, message.charset, CODEPHRASE.getSchema(), false);


        if(message.language != null)
             output.writeObject(11, message.language, CODEPHRASE.getSchema(), false);

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
