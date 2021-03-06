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

public final class ArchetypeList implements Externalizable, Message<ArchetypeList>
{

    public static Schema<ArchetypeList> getSchema()
    {
        return SCHEMA;
    }

    public static ArchetypeList getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final ArchetypeList DEFAULT_INSTANCE = new ArchetypeList();

    
    // non-private fields
    // see http://developer.android.com/guide/practices/design/performance.html#package_inner
    List<String> names;

    public ArchetypeList()
    {
        
    }

    // getters and setters

    // names

    public List<String> getNamesList()
    {
        return names;
    }

    public void setNamesList(List<String> names)
    {
        this.names = names;
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

    public Schema<ArchetypeList> cachedSchema()
    {
        return SCHEMA;
    }

    static final Schema<ArchetypeList> SCHEMA = new Schema<ArchetypeList>()
    {
        // schema methods

        public ArchetypeList newMessage()
        {
            return new ArchetypeList();
        }

        public Class<ArchetypeList> typeClass()
        {
            return ArchetypeList.class;
        }

        public String messageName()
        {
            return ArchetypeList.class.getSimpleName();
        }

        public String messageFullName()
        {
            return ArchetypeList.class.getName();
        }

        public boolean isInitialized(ArchetypeList message)
        {
            return true;
        }

        public void mergeFrom(Input input, ArchetypeList message) throws IOException
        {
            for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
            {
                switch(number)
                {
                    case 0:
                        return;
                    case 1:
                        if(message.names == null)
                            message.names = new ArrayList<String>();
                        message.names.add(input.readString());
                        break;
                    default:
                        input.handleUnknownField(number, this);
                }   
            }
        }


        public void writeTo(Output output, ArchetypeList message) throws IOException
        {
            if(message.names != null)
            {
                for(String names : message.names)
                {
                    if(names != null)
                        output.writeString(1, names, true);
                }
            }
        }

        public String getFieldName(int number)
        {
            switch(number)
            {
                case 1: return "names";
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
            fieldMap.put("names", 1);
        }
    };
    
}
