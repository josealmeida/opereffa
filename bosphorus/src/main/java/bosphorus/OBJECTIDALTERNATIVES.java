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

public final class OBJECTIDALTERNATIVES implements Externalizable, Message<OBJECTIDALTERNATIVES>, Schema<OBJECTIDALTERNATIVES>
{

    public static Schema<OBJECTIDALTERNATIVES> getSchema()
    {
        return DEFAULT_INSTANCE;
    }

    public static OBJECTIDALTERNATIVES getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final OBJECTIDALTERNATIVES DEFAULT_INSTANCE = new OBJECTIDALTERNATIVES();

    
    private GENERICID genericidfield;
    private ARCHETYPEID archetypeidfield;
    private HIEROBJECTID hierobjectidfield;
    private TEMPLATEID templateidfield;
    private TERMINOLOGYID terminologyidfield;
    private OBJECTVERSIONID objectversionidfield;
    private UIDBASEDID uidbasedidfield;

    public OBJECTIDALTERNATIVES()
    {
        
    }

    // getters and setters

    // genericidfield

    public GENERICID getGenericidfield()
    {
        return genericidfield;
    }

    public void setGenericidfield(GENERICID genericidfield)
    {
        this.genericidfield = genericidfield;
    }

    // archetypeidfield

    public ARCHETYPEID getArchetypeidfield()
    {
        return archetypeidfield;
    }

    public void setArchetypeidfield(ARCHETYPEID archetypeidfield)
    {
        this.archetypeidfield = archetypeidfield;
    }

    // hierobjectidfield

    public HIEROBJECTID getHierobjectidfield()
    {
        return hierobjectidfield;
    }

    public void setHierobjectidfield(HIEROBJECTID hierobjectidfield)
    {
        this.hierobjectidfield = hierobjectidfield;
    }

    // templateidfield

    public TEMPLATEID getTemplateidfield()
    {
        return templateidfield;
    }

    public void setTemplateidfield(TEMPLATEID templateidfield)
    {
        this.templateidfield = templateidfield;
    }

    // terminologyidfield

    public TERMINOLOGYID getTerminologyidfield()
    {
        return terminologyidfield;
    }

    public void setTerminologyidfield(TERMINOLOGYID terminologyidfield)
    {
        this.terminologyidfield = terminologyidfield;
    }

    // objectversionidfield

    public OBJECTVERSIONID getObjectversionidfield()
    {
        return objectversionidfield;
    }

    public void setObjectversionidfield(OBJECTVERSIONID objectversionidfield)
    {
        this.objectversionidfield = objectversionidfield;
    }

    // uidbasedidfield

    public UIDBASEDID getUidbasedidfield()
    {
        return uidbasedidfield;
    }

    public void setUidbasedidfield(UIDBASEDID uidbasedidfield)
    {
        this.uidbasedidfield = uidbasedidfield;
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

    public Schema<OBJECTIDALTERNATIVES> cachedSchema()
    {
        return this;
    }

    // schema methods

    public OBJECTIDALTERNATIVES newMessage()
    {
        return new OBJECTIDALTERNATIVES();
    }

    public Class<OBJECTIDALTERNATIVES> typeClass()
    {
        return OBJECTIDALTERNATIVES.class;
    }

    public String messageName()
    {
        return OBJECTIDALTERNATIVES.class.getSimpleName();
    }

    public String messageFullName()
    {
        return OBJECTIDALTERNATIVES.class.getName();
    }

    public boolean isInitialized(OBJECTIDALTERNATIVES message)
    {
        return true;
    }

    public void mergeFrom(Input input, OBJECTIDALTERNATIVES message) throws IOException
    {
        for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
        {
            switch(number)
            {
                case 0:
                    return;
                case 1:
                    message.genericidfield = input.mergeObject(message.genericidfield, GENERICID.getSchema());
                    break;

                case 2:
                    message.archetypeidfield = input.mergeObject(message.archetypeidfield, ARCHETYPEID.getSchema());
                    break;

                case 3:
                    message.hierobjectidfield = input.mergeObject(message.hierobjectidfield, HIEROBJECTID.getSchema());
                    break;

                case 4:
                    message.templateidfield = input.mergeObject(message.templateidfield, TEMPLATEID.getSchema());
                    break;

                case 5:
                    message.terminologyidfield = input.mergeObject(message.terminologyidfield, TERMINOLOGYID.getSchema());
                    break;

                case 6:
                    message.objectversionidfield = input.mergeObject(message.objectversionidfield, OBJECTVERSIONID.getSchema());
                    break;

                case 7:
                    message.uidbasedidfield = input.mergeObject(message.uidbasedidfield, UIDBASEDID.getSchema());
                    break;

                default:
                    input.handleUnknownField(number, this);
            }   
        }
    }


    public void writeTo(Output output, OBJECTIDALTERNATIVES message) throws IOException
    {
        if(message.genericidfield != null)
             output.writeObject(1, message.genericidfield, GENERICID.getSchema(), false);


        if(message.archetypeidfield != null)
             output.writeObject(2, message.archetypeidfield, ARCHETYPEID.getSchema(), false);


        if(message.hierobjectidfield != null)
             output.writeObject(3, message.hierobjectidfield, HIEROBJECTID.getSchema(), false);


        if(message.templateidfield != null)
             output.writeObject(4, message.templateidfield, TEMPLATEID.getSchema(), false);


        if(message.terminologyidfield != null)
             output.writeObject(5, message.terminologyidfield, TERMINOLOGYID.getSchema(), false);


        if(message.objectversionidfield != null)
             output.writeObject(6, message.objectversionidfield, OBJECTVERSIONID.getSchema(), false);


        if(message.uidbasedidfield != null)
             output.writeObject(7, message.uidbasedidfield, UIDBASEDID.getSchema(), false);

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