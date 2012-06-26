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

public final class ARCHETYPESLOT implements Externalizable, Message<ARCHETYPESLOT>
{

    public static Schema<ARCHETYPESLOT> getSchema()
    {
        return SCHEMA;
    }

    public static ARCHETYPESLOT getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final ARCHETYPESLOT DEFAULT_INSTANCE = new ARCHETYPESLOT();

    
    // non-private fields
    // see http://developer.android.com/guide/practices/design/performance.html#package_inner
    List<ASSERTION> includes;
    List<ASSERTION> excludes;
    String rmtypename;
    IntervalOfInteger occurrences;
    String nodeid;

    public ARCHETYPESLOT()
    {
        
    }

    public ARCHETYPESLOT(
        String rmtypename,
        IntervalOfInteger occurrences,
        String nodeid
    )
    {
        this.rmtypename = rmtypename;
        this.occurrences = occurrences;
        this.nodeid = nodeid;
    }

    // getters and setters

    // includes

    public List<ASSERTION> getIncludesList()
    {
        return includes;
    }

    public void setIncludesList(List<ASSERTION> includes)
    {
        this.includes = includes;
    }

    // excludes

    public List<ASSERTION> getExcludesList()
    {
        return excludes;
    }

    public void setExcludesList(List<ASSERTION> excludes)
    {
        this.excludes = excludes;
    }

    // rmtypename

    public String getRmtypename()
    {
        return rmtypename;
    }

    public void setRmtypename(String rmtypename)
    {
        this.rmtypename = rmtypename;
    }

    // occurrences

    public IntervalOfInteger getOccurrences()
    {
        return occurrences;
    }

    public void setOccurrences(IntervalOfInteger occurrences)
    {
        this.occurrences = occurrences;
    }

    // nodeid

    public String getNodeid()
    {
        return nodeid;
    }

    public void setNodeid(String nodeid)
    {
        this.nodeid = nodeid;
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

    public Schema<ARCHETYPESLOT> cachedSchema()
    {
        return SCHEMA;
    }

    static final Schema<ARCHETYPESLOT> SCHEMA = new Schema<ARCHETYPESLOT>()
    {
        // schema methods

        public ARCHETYPESLOT newMessage()
        {
            return new ARCHETYPESLOT();
        }

        public Class<ARCHETYPESLOT> typeClass()
        {
            return ARCHETYPESLOT.class;
        }

        public String messageName()
        {
            return ARCHETYPESLOT.class.getSimpleName();
        }

        public String messageFullName()
        {
            return ARCHETYPESLOT.class.getName();
        }

        public boolean isInitialized(ARCHETYPESLOT message)
        {
            return 
                message.rmtypename != null 
                && message.occurrences != null 
                && message.nodeid != null;
        }

        public void mergeFrom(Input input, ARCHETYPESLOT message) throws IOException
        {
            for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
            {
                switch(number)
                {
                    case 0:
                        return;
                    case 1:
                        if(message.includes == null)
                            message.includes = new ArrayList<ASSERTION>();
                        message.includes.add(input.mergeObject(null, ASSERTION.getSchema()));
                        break;

                    case 2:
                        if(message.excludes == null)
                            message.excludes = new ArrayList<ASSERTION>();
                        message.excludes.add(input.mergeObject(null, ASSERTION.getSchema()));
                        break;

                    case 3:
                        message.rmtypename = input.readString();
                        break;
                    case 4:
                        message.occurrences = input.mergeObject(message.occurrences, IntervalOfInteger.getSchema());
                        break;

                    case 5:
                        message.nodeid = input.readString();
                        break;
                    default:
                        input.handleUnknownField(number, this);
                }   
            }
        }


        public void writeTo(Output output, ARCHETYPESLOT message) throws IOException
        {
            if(message.includes != null)
            {
                for(ASSERTION includes : message.includes)
                {
                    if(includes != null)
                        output.writeObject(1, includes, ASSERTION.getSchema(), true);
                }
            }


            if(message.excludes != null)
            {
                for(ASSERTION excludes : message.excludes)
                {
                    if(excludes != null)
                        output.writeObject(2, excludes, ASSERTION.getSchema(), true);
                }
            }


            if(message.rmtypename == null)
                throw new UninitializedMessageException(message);
            output.writeString(3, message.rmtypename, false);

            if(message.occurrences == null)
                throw new UninitializedMessageException(message);
            output.writeObject(4, message.occurrences, IntervalOfInteger.getSchema(), false);


            if(message.nodeid == null)
                throw new UninitializedMessageException(message);
            output.writeString(5, message.nodeid, false);
        }

        public String getFieldName(int number)
        {
            switch(number)
            {
                case 1: return "includes";
                case 2: return "excludes";
                case 3: return "rmtypename";
                case 4: return "occurrences";
                case 5: return "nodeid";
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
            fieldMap.put("includes", 1);
            fieldMap.put("excludes", 2);
            fieldMap.put("rmtypename", 3);
            fieldMap.put("occurrences", 4);
            fieldMap.put("nodeid", 5);
        }
    };
    
}