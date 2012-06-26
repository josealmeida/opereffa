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

public final class IntervalOfDateTime implements Externalizable, Message<IntervalOfDateTime>
{

    public static Schema<IntervalOfDateTime> getSchema()
    {
        return SCHEMA;
    }

    public static IntervalOfDateTime getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final IntervalOfDateTime DEFAULT_INSTANCE = new IntervalOfDateTime();

    
    // non-private fields
    // see http://developer.android.com/guide/practices/design/performance.html#package_inner
    String lower;
    String upper;
    Boolean lowerincluded;
    Boolean upperincluded;
    Boolean lowerunbounded;
    Boolean upperunbounded;

    public IntervalOfDateTime()
    {
        
    }

    // getters and setters

    // lower

    public String getLower()
    {
        return lower;
    }

    public void setLower(String lower)
    {
        this.lower = lower;
    }

    // upper

    public String getUpper()
    {
        return upper;
    }

    public void setUpper(String upper)
    {
        this.upper = upper;
    }

    // lowerincluded

    public Boolean getLowerincluded()
    {
        return lowerincluded;
    }

    public void setLowerincluded(Boolean lowerincluded)
    {
        this.lowerincluded = lowerincluded;
    }

    // upperincluded

    public Boolean getUpperincluded()
    {
        return upperincluded;
    }

    public void setUpperincluded(Boolean upperincluded)
    {
        this.upperincluded = upperincluded;
    }

    // lowerunbounded

    public Boolean getLowerunbounded()
    {
        return lowerunbounded;
    }

    public void setLowerunbounded(Boolean lowerunbounded)
    {
        this.lowerunbounded = lowerunbounded;
    }

    // upperunbounded

    public Boolean getUpperunbounded()
    {
        return upperunbounded;
    }

    public void setUpperunbounded(Boolean upperunbounded)
    {
        this.upperunbounded = upperunbounded;
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

    public Schema<IntervalOfDateTime> cachedSchema()
    {
        return SCHEMA;
    }

    static final Schema<IntervalOfDateTime> SCHEMA = new Schema<IntervalOfDateTime>()
    {
        // schema methods

        public IntervalOfDateTime newMessage()
        {
            return new IntervalOfDateTime();
        }

        public Class<IntervalOfDateTime> typeClass()
        {
            return IntervalOfDateTime.class;
        }

        public String messageName()
        {
            return IntervalOfDateTime.class.getSimpleName();
        }

        public String messageFullName()
        {
            return IntervalOfDateTime.class.getName();
        }

        public boolean isInitialized(IntervalOfDateTime message)
        {
            return true;
        }

        public void mergeFrom(Input input, IntervalOfDateTime message) throws IOException
        {
            for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
            {
                switch(number)
                {
                    case 0:
                        return;
                    case 1:
                        message.lower = input.readString();
                        break;
                    case 2:
                        message.upper = input.readString();
                        break;
                    case 3:
                        message.lowerincluded = input.readBool();
                        break;
                    case 4:
                        message.upperincluded = input.readBool();
                        break;
                    case 5:
                        message.lowerunbounded = input.readBool();
                        break;
                    case 6:
                        message.upperunbounded = input.readBool();
                        break;
                    default:
                        input.handleUnknownField(number, this);
                }   
            }
        }


        public void writeTo(Output output, IntervalOfDateTime message) throws IOException
        {
            if(message.lower != null)
                output.writeString(1, message.lower, false);

            if(message.upper != null)
                output.writeString(2, message.upper, false);

            if(message.lowerincluded != null)
                output.writeBool(3, message.lowerincluded, false);

            if(message.upperincluded != null)
                output.writeBool(4, message.upperincluded, false);

            if(message.lowerunbounded != null)
                output.writeBool(5, message.lowerunbounded, false);

            if(message.upperunbounded != null)
                output.writeBool(6, message.upperunbounded, false);
        }

        public String getFieldName(int number)
        {
            switch(number)
            {
                case 1: return "lower";
                case 2: return "upper";
                case 3: return "lowerincluded";
                case 4: return "upperincluded";
                case 5: return "lowerunbounded";
                case 6: return "upperunbounded";
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
            fieldMap.put("lower", 1);
            fieldMap.put("upper", 2);
            fieldMap.put("lowerincluded", 3);
            fieldMap.put("upperincluded", 4);
            fieldMap.put("lowerunbounded", 5);
            fieldMap.put("upperunbounded", 6);
        }
    };
    
}