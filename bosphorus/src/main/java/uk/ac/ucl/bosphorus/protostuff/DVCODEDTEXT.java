/*******************************************************************************
 * Copyright 2012 Sevket Seref Arikan, David Ingram
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
// Generated by http://code.google.com/p/protostuff/ ... DO NOT EDIT!
// Generated from aom.proto

package uk.ac.ucl.bosphorus.protostuff;

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

public final class DVCODEDTEXT implements Externalizable, Message<DVCODEDTEXT>
{

    public static Schema<DVCODEDTEXT> getSchema()
    {
        return SCHEMA;
    }

    public static DVCODEDTEXT getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final DVCODEDTEXT DEFAULT_INSTANCE = new DVCODEDTEXT();

    
    // non-private fields
    // see http://developer.android.com/guide/practices/design/performance.html#package_inner
    CODEPHRASE definingcode;
    String value;
    DVURI hyperlink;
    String formatting;
    List<TERMMAPPING> mappings;
    CODEPHRASE language;
    CODEPHRASE encoding;

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
        GraphIOUtil.mergeDelimitedFrom(in, this, SCHEMA);
    }

    public void writeExternal(ObjectOutput out) throws IOException
    {
        GraphIOUtil.writeDelimitedTo(out, this, SCHEMA);
    }

    // message method

    public Schema<DVCODEDTEXT> cachedSchema()
    {
        return SCHEMA;
    }

    static final Schema<DVCODEDTEXT> SCHEMA = new Schema<DVCODEDTEXT>()
    {
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
            switch(number)
            {
                case 1: return "definingcode";
                case 2: return "value";
                case 3: return "hyperlink";
                case 4: return "formatting";
                case 5: return "mappings";
                case 6: return "language";
                case 7: return "encoding";
                default: return null;
            }
        }

        public int getFieldNumber(String name)
        {
            final Integer number = fieldMap.get(name);
            return number == null ? 0 : number.intValue();
        }

        final java.util.HashMap<String,Integer> fieldMap = new java.util.HashMap<String,Integer>();
        {
            fieldMap.put("definingcode", 1);
            fieldMap.put("value", 2);
            fieldMap.put("hyperlink", 3);
            fieldMap.put("formatting", 4);
            fieldMap.put("mappings", 5);
            fieldMap.put("language", 6);
            fieldMap.put("encoding", 7);
        }
    };
    
}
