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
import com.dyuproject.protostuff.UninitializedMessageException;

public final class GENERICID implements Externalizable, Message<GENERICID>
{

    public static Schema<GENERICID> getSchema()
    {
        return SCHEMA;
    }

    public static GENERICID getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final GENERICID DEFAULT_INSTANCE = new GENERICID();

    
    // non-private fields
    // see http://developer.android.com/guide/practices/design/performance.html#package_inner
    String scheme;
    String value;

    public GENERICID()
    {
        
    }

    public GENERICID(
        String scheme,
        String value
    )
    {
        this.scheme = scheme;
        this.value = value;
    }

    // getters and setters

    // scheme

    public String getScheme()
    {
        return scheme;
    }

    public void setScheme(String scheme)
    {
        this.scheme = scheme;
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

    public Schema<GENERICID> cachedSchema()
    {
        return SCHEMA;
    }

    static final Schema<GENERICID> SCHEMA = new Schema<GENERICID>()
    {
        // schema methods

        public GENERICID newMessage()
        {
            return new GENERICID();
        }

        public Class<GENERICID> typeClass()
        {
            return GENERICID.class;
        }

        public String messageName()
        {
            return GENERICID.class.getSimpleName();
        }

        public String messageFullName()
        {
            return GENERICID.class.getName();
        }

        public boolean isInitialized(GENERICID message)
        {
            return 
                message.scheme != null 
                && message.value != null;
        }

        public void mergeFrom(Input input, GENERICID message) throws IOException
        {
            for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
            {
                switch(number)
                {
                    case 0:
                        return;
                    case 1:
                        message.scheme = input.readString();
                        break;
                    case 2:
                        message.value = input.readString();
                        break;
                    default:
                        input.handleUnknownField(number, this);
                }   
            }
        }


        public void writeTo(Output output, GENERICID message) throws IOException
        {
            if(message.scheme == null)
                throw new UninitializedMessageException(message);
            output.writeString(1, message.scheme, false);

            if(message.value == null)
                throw new UninitializedMessageException(message);
            output.writeString(2, message.value, false);
        }

        public String getFieldName(int number)
        {
            switch(number)
            {
                case 1: return "scheme";
                case 2: return "value";
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
            fieldMap.put("scheme", 1);
            fieldMap.put("value", 2);
        }
    };
    
}
