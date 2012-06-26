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

package bosphoruspojos;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import com.dyuproject.protostuff.GraphIOUtil;
import com.dyuproject.protostuff.Input;
import com.dyuproject.protostuff.Message;
import com.dyuproject.protostuff.Output;
import com.dyuproject.protostuff.Schema;

public final class AtrCardinality implements Externalizable, Message<AtrCardinality>
{

    public static Schema<AtrCardinality> getSchema()
    {
        return SCHEMA;
    }

    public static AtrCardinality getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final AtrCardinality DEFAULT_INSTANCE = new AtrCardinality();

    
    // non-private fields
    // see http://developer.android.com/guide/practices/design/performance.html#package_inner
    Integer isordered;
    Integer isunique;
    Interval intervalofcardinality;

    public AtrCardinality()
    {
        
    }

    // getters and setters

    // isordered

    public Integer getIsordered()
    {
        return isordered;
    }

    public void setIsordered(Integer isordered)
    {
        this.isordered = isordered;
    }

    // isunique

    public Integer getIsunique()
    {
        return isunique;
    }

    public void setIsunique(Integer isunique)
    {
        this.isunique = isunique;
    }

    // intervalofcardinality

    public Interval getIntervalofcardinality()
    {
        return intervalofcardinality;
    }

    public void setIntervalofcardinality(Interval intervalofcardinality)
    {
        this.intervalofcardinality = intervalofcardinality;
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

    public Schema<AtrCardinality> cachedSchema()
    {
        return SCHEMA;
    }

    static final Schema<AtrCardinality> SCHEMA = new Schema<AtrCardinality>()
    {
        // schema methods

        public AtrCardinality newMessage()
        {
            return new AtrCardinality();
        }

        public Class<AtrCardinality> typeClass()
        {
            return AtrCardinality.class;
        }

        public String messageName()
        {
            return AtrCardinality.class.getSimpleName();
        }

        public String messageFullName()
        {
            return AtrCardinality.class.getName();
        }

        public boolean isInitialized(AtrCardinality message)
        {
            return true;
        }

        public void mergeFrom(Input input, AtrCardinality message) throws IOException
        {
            for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
            {
                switch(number)
                {
                    case 0:
                        return;
                    case 1:
                        message.isordered = input.readInt32();
                        break;
                    case 2:
                        message.isunique = input.readInt32();
                        break;
                    case 3:
                        message.intervalofcardinality = input.mergeObject(message.intervalofcardinality, Interval.getSchema());
                        break;

                    default:
                        input.handleUnknownField(number, this);
                }   
            }
        }


        public void writeTo(Output output, AtrCardinality message) throws IOException
        {
            if(message.isordered != null)
                output.writeInt32(1, message.isordered, false);

            if(message.isunique != null)
                output.writeInt32(2, message.isunique, false);

            if(message.intervalofcardinality != null)
                 output.writeObject(3, message.intervalofcardinality, Interval.getSchema(), false);

        }

        public String getFieldName(int number)
        {
            switch(number)
            {
                case 1: return "isordered";
                case 2: return "isunique";
                case 3: return "intervalofcardinality";
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
            fieldMap.put("isordered", 1);
            fieldMap.put("isunique", 2);
            fieldMap.put("intervalofcardinality", 3);
        }
    };
    
}
