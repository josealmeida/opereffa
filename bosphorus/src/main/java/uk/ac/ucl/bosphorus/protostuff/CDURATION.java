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

public final class CDURATION implements Externalizable, Message<CDURATION>
{

    public static Schema<CDURATION> getSchema()
    {
        return SCHEMA;
    }

    public static CDURATION getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final CDURATION DEFAULT_INSTANCE = new CDURATION();

    
    // non-private fields
    // see http://developer.android.com/guide/practices/design/performance.html#package_inner
    String pattern;
    IntervalOfDuration range;
    String assumedvalue;

    public CDURATION()
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

    // range

    public IntervalOfDuration getRange()
    {
        return range;
    }

    public void setRange(IntervalOfDuration range)
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
        GraphIOUtil.mergeDelimitedFrom(in, this, SCHEMA);
    }

    public void writeExternal(ObjectOutput out) throws IOException
    {
        GraphIOUtil.writeDelimitedTo(out, this, SCHEMA);
    }

    // message method

    public Schema<CDURATION> cachedSchema()
    {
        return SCHEMA;
    }

    static final Schema<CDURATION> SCHEMA = new Schema<CDURATION>()
    {
        // schema methods

        public CDURATION newMessage()
        {
            return new CDURATION();
        }

        public Class<CDURATION> typeClass()
        {
            return CDURATION.class;
        }

        public String messageName()
        {
            return CDURATION.class.getSimpleName();
        }

        public String messageFullName()
        {
            return CDURATION.class.getName();
        }

        public boolean isInitialized(CDURATION message)
        {
            return true;
        }

        public void mergeFrom(Input input, CDURATION message) throws IOException
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
                        message.range = input.mergeObject(message.range, IntervalOfDuration.getSchema());
                        break;

                    case 3:
                        message.assumedvalue = input.readString();
                        break;
                    default:
                        input.handleUnknownField(number, this);
                }   
            }
        }


        public void writeTo(Output output, CDURATION message) throws IOException
        {
            if(message.pattern != null)
                output.writeString(1, message.pattern, false);

            if(message.range != null)
                 output.writeObject(2, message.range, IntervalOfDuration.getSchema(), false);


            if(message.assumedvalue != null)
                output.writeString(3, message.assumedvalue, false);
        }

        public String getFieldName(int number)
        {
            switch(number)
            {
                case 1: return "pattern";
                case 2: return "range";
                case 3: return "assumedvalue";
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
            fieldMap.put("pattern", 1);
            fieldMap.put("range", 2);
            fieldMap.put("assumedvalue", 3);
        }
    };
    
}