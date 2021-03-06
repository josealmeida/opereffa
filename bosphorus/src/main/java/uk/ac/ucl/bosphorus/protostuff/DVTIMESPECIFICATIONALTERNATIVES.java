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

public final class DVTIMESPECIFICATIONALTERNATIVES implements Externalizable, Message<DVTIMESPECIFICATIONALTERNATIVES>
{

    public static Schema<DVTIMESPECIFICATIONALTERNATIVES> getSchema()
    {
        return SCHEMA;
    }

    public static DVTIMESPECIFICATIONALTERNATIVES getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final DVTIMESPECIFICATIONALTERNATIVES DEFAULT_INSTANCE = new DVTIMESPECIFICATIONALTERNATIVES();

    
    // non-private fields
    // see http://developer.android.com/guide/practices/design/performance.html#package_inner
    DVPERIODICTIMESPECIFICATION dvperiodictimespecificationfield;
    DVGENERALTIMESPECIFICATION dvgeneraltimespecificationfield;

    public DVTIMESPECIFICATIONALTERNATIVES()
    {
        
    }

    // getters and setters

    // dvperiodictimespecificationfield

    public DVPERIODICTIMESPECIFICATION getDvperiodictimespecificationfield()
    {
        return dvperiodictimespecificationfield;
    }

    public void setDvperiodictimespecificationfield(DVPERIODICTIMESPECIFICATION dvperiodictimespecificationfield)
    {
        this.dvperiodictimespecificationfield = dvperiodictimespecificationfield;
    }

    // dvgeneraltimespecificationfield

    public DVGENERALTIMESPECIFICATION getDvgeneraltimespecificationfield()
    {
        return dvgeneraltimespecificationfield;
    }

    public void setDvgeneraltimespecificationfield(DVGENERALTIMESPECIFICATION dvgeneraltimespecificationfield)
    {
        this.dvgeneraltimespecificationfield = dvgeneraltimespecificationfield;
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

    public Schema<DVTIMESPECIFICATIONALTERNATIVES> cachedSchema()
    {
        return SCHEMA;
    }

    static final Schema<DVTIMESPECIFICATIONALTERNATIVES> SCHEMA = new Schema<DVTIMESPECIFICATIONALTERNATIVES>()
    {
        // schema methods

        public DVTIMESPECIFICATIONALTERNATIVES newMessage()
        {
            return new DVTIMESPECIFICATIONALTERNATIVES();
        }

        public Class<DVTIMESPECIFICATIONALTERNATIVES> typeClass()
        {
            return DVTIMESPECIFICATIONALTERNATIVES.class;
        }

        public String messageName()
        {
            return DVTIMESPECIFICATIONALTERNATIVES.class.getSimpleName();
        }

        public String messageFullName()
        {
            return DVTIMESPECIFICATIONALTERNATIVES.class.getName();
        }

        public boolean isInitialized(DVTIMESPECIFICATIONALTERNATIVES message)
        {
            return true;
        }

        public void mergeFrom(Input input, DVTIMESPECIFICATIONALTERNATIVES message) throws IOException
        {
            for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
            {
                switch(number)
                {
                    case 0:
                        return;
                    case 1:
                        message.dvperiodictimespecificationfield = input.mergeObject(message.dvperiodictimespecificationfield, DVPERIODICTIMESPECIFICATION.getSchema());
                        break;

                    case 2:
                        message.dvgeneraltimespecificationfield = input.mergeObject(message.dvgeneraltimespecificationfield, DVGENERALTIMESPECIFICATION.getSchema());
                        break;

                    default:
                        input.handleUnknownField(number, this);
                }   
            }
        }


        public void writeTo(Output output, DVTIMESPECIFICATIONALTERNATIVES message) throws IOException
        {
            if(message.dvperiodictimespecificationfield != null)
                 output.writeObject(1, message.dvperiodictimespecificationfield, DVPERIODICTIMESPECIFICATION.getSchema(), false);


            if(message.dvgeneraltimespecificationfield != null)
                 output.writeObject(2, message.dvgeneraltimespecificationfield, DVGENERALTIMESPECIFICATION.getSchema(), false);

        }

        public String getFieldName(int number)
        {
            switch(number)
            {
                case 1: return "dvperiodictimespecificationfield";
                case 2: return "dvgeneraltimespecificationfield";
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
            fieldMap.put("dvperiodictimespecificationfield", 1);
            fieldMap.put("dvgeneraltimespecificationfield", 2);
        }
    };
    
}
