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

public final class OBJECTVERSIONID implements Externalizable, Message<OBJECTVERSIONID>
{

    public static Schema<OBJECTVERSIONID> getSchema()
    {
        return SCHEMA;
    }

    public static OBJECTVERSIONID getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final OBJECTVERSIONID DEFAULT_INSTANCE = new OBJECTVERSIONID();

    
    // non-private fields
    // see http://developer.android.com/guide/practices/design/performance.html#package_inner
    String value;

    public OBJECTVERSIONID()
    {
        
    }

    public OBJECTVERSIONID(
        String value
    )
    {
        this.value = value;
    }

    // getters and setters

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

    public Schema<OBJECTVERSIONID> cachedSchema()
    {
        return SCHEMA;
    }

    static final Schema<OBJECTVERSIONID> SCHEMA = new Schema<OBJECTVERSIONID>()
    {
        // schema methods

        public OBJECTVERSIONID newMessage()
        {
            return new OBJECTVERSIONID();
        }

        public Class<OBJECTVERSIONID> typeClass()
        {
            return OBJECTVERSIONID.class;
        }

        public String messageName()
        {
            return OBJECTVERSIONID.class.getSimpleName();
        }

        public String messageFullName()
        {
            return OBJECTVERSIONID.class.getName();
        }

        public boolean isInitialized(OBJECTVERSIONID message)
        {
            return 
                message.value != null;
        }

        public void mergeFrom(Input input, OBJECTVERSIONID message) throws IOException
        {
            for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
            {
                switch(number)
                {
                    case 0:
                        return;
                    case 1:
                        message.value = input.readString();
                        break;
                    default:
                        input.handleUnknownField(number, this);
                }   
            }
        }


        public void writeTo(Output output, OBJECTVERSIONID message) throws IOException
        {
            if(message.value == null)
                throw new UninitializedMessageException(message);
            output.writeString(1, message.value, false);
        }

        public String getFieldName(int number)
        {
            switch(number)
            {
                case 1: return "value";
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
            fieldMap.put("value", 1);
        }
    };
    
}