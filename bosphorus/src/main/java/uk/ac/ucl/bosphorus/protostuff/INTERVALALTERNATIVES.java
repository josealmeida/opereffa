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

public final class INTERVALALTERNATIVES implements Externalizable, Message<INTERVALALTERNATIVES>
{

    public static Schema<INTERVALALTERNATIVES> getSchema()
    {
        return SCHEMA;
    }

    public static INTERVALALTERNATIVES getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final INTERVALALTERNATIVES DEFAULT_INSTANCE = new INTERVALALTERNATIVES();

    
    // non-private fields
    // see http://developer.android.com/guide/practices/design/performance.html#package_inner
    IntervalOfReal intervalofrealfield;
    IntervalOfTime intervaloftimefield;
    IntervalOfDateTime intervalofdatetimefield;
    IntervalOfInteger intervalofintegerfield;
    IntervalOfDuration intervalofdurationfield;
    IntervalOfDate intervalofdatefield;

    public INTERVALALTERNATIVES()
    {
        
    }

    // getters and setters

    // intervalofrealfield

    public IntervalOfReal getIntervalofrealfield()
    {
        return intervalofrealfield;
    }

    public void setIntervalofrealfield(IntervalOfReal intervalofrealfield)
    {
        this.intervalofrealfield = intervalofrealfield;
    }

    // intervaloftimefield

    public IntervalOfTime getIntervaloftimefield()
    {
        return intervaloftimefield;
    }

    public void setIntervaloftimefield(IntervalOfTime intervaloftimefield)
    {
        this.intervaloftimefield = intervaloftimefield;
    }

    // intervalofdatetimefield

    public IntervalOfDateTime getIntervalofdatetimefield()
    {
        return intervalofdatetimefield;
    }

    public void setIntervalofdatetimefield(IntervalOfDateTime intervalofdatetimefield)
    {
        this.intervalofdatetimefield = intervalofdatetimefield;
    }

    // intervalofintegerfield

    public IntervalOfInteger getIntervalofintegerfield()
    {
        return intervalofintegerfield;
    }

    public void setIntervalofintegerfield(IntervalOfInteger intervalofintegerfield)
    {
        this.intervalofintegerfield = intervalofintegerfield;
    }

    // intervalofdurationfield

    public IntervalOfDuration getIntervalofdurationfield()
    {
        return intervalofdurationfield;
    }

    public void setIntervalofdurationfield(IntervalOfDuration intervalofdurationfield)
    {
        this.intervalofdurationfield = intervalofdurationfield;
    }

    // intervalofdatefield

    public IntervalOfDate getIntervalofdatefield()
    {
        return intervalofdatefield;
    }

    public void setIntervalofdatefield(IntervalOfDate intervalofdatefield)
    {
        this.intervalofdatefield = intervalofdatefield;
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

    public Schema<INTERVALALTERNATIVES> cachedSchema()
    {
        return SCHEMA;
    }

    static final Schema<INTERVALALTERNATIVES> SCHEMA = new Schema<INTERVALALTERNATIVES>()
    {
        // schema methods

        public INTERVALALTERNATIVES newMessage()
        {
            return new INTERVALALTERNATIVES();
        }

        public Class<INTERVALALTERNATIVES> typeClass()
        {
            return INTERVALALTERNATIVES.class;
        }

        public String messageName()
        {
            return INTERVALALTERNATIVES.class.getSimpleName();
        }

        public String messageFullName()
        {
            return INTERVALALTERNATIVES.class.getName();
        }

        public boolean isInitialized(INTERVALALTERNATIVES message)
        {
            return true;
        }

        public void mergeFrom(Input input, INTERVALALTERNATIVES message) throws IOException
        {
            for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
            {
                switch(number)
                {
                    case 0:
                        return;
                    case 1:
                        message.intervalofrealfield = input.mergeObject(message.intervalofrealfield, IntervalOfReal.getSchema());
                        break;

                    case 2:
                        message.intervaloftimefield = input.mergeObject(message.intervaloftimefield, IntervalOfTime.getSchema());
                        break;

                    case 3:
                        message.intervalofdatetimefield = input.mergeObject(message.intervalofdatetimefield, IntervalOfDateTime.getSchema());
                        break;

                    case 4:
                        message.intervalofintegerfield = input.mergeObject(message.intervalofintegerfield, IntervalOfInteger.getSchema());
                        break;

                    case 5:
                        message.intervalofdurationfield = input.mergeObject(message.intervalofdurationfield, IntervalOfDuration.getSchema());
                        break;

                    case 6:
                        message.intervalofdatefield = input.mergeObject(message.intervalofdatefield, IntervalOfDate.getSchema());
                        break;

                    default:
                        input.handleUnknownField(number, this);
                }   
            }
        }


        public void writeTo(Output output, INTERVALALTERNATIVES message) throws IOException
        {
            if(message.intervalofrealfield != null)
                 output.writeObject(1, message.intervalofrealfield, IntervalOfReal.getSchema(), false);


            if(message.intervaloftimefield != null)
                 output.writeObject(2, message.intervaloftimefield, IntervalOfTime.getSchema(), false);


            if(message.intervalofdatetimefield != null)
                 output.writeObject(3, message.intervalofdatetimefield, IntervalOfDateTime.getSchema(), false);


            if(message.intervalofintegerfield != null)
                 output.writeObject(4, message.intervalofintegerfield, IntervalOfInteger.getSchema(), false);


            if(message.intervalofdurationfield != null)
                 output.writeObject(5, message.intervalofdurationfield, IntervalOfDuration.getSchema(), false);


            if(message.intervalofdatefield != null)
                 output.writeObject(6, message.intervalofdatefield, IntervalOfDate.getSchema(), false);

        }

        public String getFieldName(int number)
        {
            switch(number)
            {
                case 1: return "intervalofrealfield";
                case 2: return "intervaloftimefield";
                case 3: return "intervalofdatetimefield";
                case 4: return "intervalofintegerfield";
                case 5: return "intervalofdurationfield";
                case 6: return "intervalofdatefield";
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
            fieldMap.put("intervalofrealfield", 1);
            fieldMap.put("intervaloftimefield", 2);
            fieldMap.put("intervalofdatetimefield", 3);
            fieldMap.put("intervalofintegerfield", 4);
            fieldMap.put("intervalofdurationfield", 5);
            fieldMap.put("intervalofdatefield", 6);
        }
    };
    
}
