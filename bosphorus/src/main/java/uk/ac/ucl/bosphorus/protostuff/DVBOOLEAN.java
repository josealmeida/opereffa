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

public final class DVBOOLEAN implements Externalizable, Message<DVBOOLEAN>
{

    public static Schema<DVBOOLEAN> getSchema()
    {
        return SCHEMA;
    }

    public static DVBOOLEAN getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final DVBOOLEAN DEFAULT_INSTANCE = new DVBOOLEAN();

    
    // non-private fields
    // see http://developer.android.com/guide/practices/design/performance.html#package_inner
    Boolean value;

    public DVBOOLEAN()
    {
        
    }

    // getters and setters

    // value

    public Boolean getValue()
    {
        return value;
    }

    public void setValue(Boolean value)
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

    public Schema<DVBOOLEAN> cachedSchema()
    {
        return SCHEMA;
    }

    static final Schema<DVBOOLEAN> SCHEMA = new Schema<DVBOOLEAN>()
    {
        // schema methods

        public DVBOOLEAN newMessage()
        {
            return new DVBOOLEAN();
        }

        public Class<DVBOOLEAN> typeClass()
        {
            return DVBOOLEAN.class;
        }

        public String messageName()
        {
            return DVBOOLEAN.class.getSimpleName();
        }

        public String messageFullName()
        {
            return DVBOOLEAN.class.getName();
        }

        public boolean isInitialized(DVBOOLEAN message)
        {
            return true;
        }

        public void mergeFrom(Input input, DVBOOLEAN message) throws IOException
        {
            for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
            {
                switch(number)
                {
                    case 0:
                        return;
                    case 1:
                        message.value = input.readBool();
                        break;
                    default:
                        input.handleUnknownField(number, this);
                }   
            }
        }


        public void writeTo(Output output, DVBOOLEAN message) throws IOException
        {
            if(message.value != null)
                output.writeBool(1, message.value, false);
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