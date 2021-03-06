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

import com.dyuproject.protostuff.GraphIOUtil;
import com.dyuproject.protostuff.Input;
import com.dyuproject.protostuff.Message;
import com.dyuproject.protostuff.Output;
import com.dyuproject.protostuff.Schema;

public final class DVENCAPSULATED implements Externalizable, Message<DVENCAPSULATED>
{

    public static Schema<DVENCAPSULATED> getSchema()
    {
        return SCHEMA;
    }

    public static DVENCAPSULATED getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final DVENCAPSULATED DEFAULT_INSTANCE = new DVENCAPSULATED();

    
    // non-private fields
    // see http://developer.android.com/guide/practices/design/performance.html#package_inner
    CODEPHRASE charset;
    CODEPHRASE language;

    public DVENCAPSULATED()
    {
        
    }

    // getters and setters

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
        GraphIOUtil.mergeDelimitedFrom(in, this, SCHEMA);
    }

    public void writeExternal(ObjectOutput out) throws IOException
    {
        GraphIOUtil.writeDelimitedTo(out, this, SCHEMA);
    }

    // message method

    public Schema<DVENCAPSULATED> cachedSchema()
    {
        return SCHEMA;
    }

    static final Schema<DVENCAPSULATED> SCHEMA = new Schema<DVENCAPSULATED>()
    {
        // schema methods

        public DVENCAPSULATED newMessage()
        {
            return new DVENCAPSULATED();
        }

        public Class<DVENCAPSULATED> typeClass()
        {
            return DVENCAPSULATED.class;
        }

        public String messageName()
        {
            return DVENCAPSULATED.class.getSimpleName();
        }

        public String messageFullName()
        {
            return DVENCAPSULATED.class.getName();
        }

        public boolean isInitialized(DVENCAPSULATED message)
        {
            return true;
        }

        public void mergeFrom(Input input, DVENCAPSULATED message) throws IOException
        {
            for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
            {
                switch(number)
                {
                    case 0:
                        return;
                    case 1:
                        message.charset = input.mergeObject(message.charset, CODEPHRASE.getSchema());
                        break;

                    case 2:
                        message.language = input.mergeObject(message.language, CODEPHRASE.getSchema());
                        break;

                    default:
                        input.handleUnknownField(number, this);
                }   
            }
        }


        public void writeTo(Output output, DVENCAPSULATED message) throws IOException
        {
            if(message.charset != null)
                 output.writeObject(1, message.charset, CODEPHRASE.getSchema(), false);


            if(message.language != null)
                 output.writeObject(2, message.language, CODEPHRASE.getSchema(), false);

        }

        public String getFieldName(int number)
        {
            switch(number)
            {
                case 1: return "charset";
                case 2: return "language";
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
            fieldMap.put("charset", 1);
            fieldMap.put("language", 2);
        }
    };
    
}
