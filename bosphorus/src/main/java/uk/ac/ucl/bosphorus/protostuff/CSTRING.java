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

public final class CSTRING implements Externalizable, Message<CSTRING>
{

    public static Schema<CSTRING> getSchema()
    {
        return SCHEMA;
    }

    public static CSTRING getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final CSTRING DEFAULT_INSTANCE = new CSTRING();

    
    // non-private fields
    // see http://developer.android.com/guide/practices/design/performance.html#package_inner
    String pattern;
    List<String> list;
    Boolean listopen;
    String assumedvalue;

    public CSTRING()
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

    // list

    public List<String> getListList()
    {
        return list;
    }

    public void setListList(List<String> list)
    {
        this.list = list;
    }

    // listopen

    public Boolean getListopen()
    {
        return listopen;
    }

    public void setListopen(Boolean listopen)
    {
        this.listopen = listopen;
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

    public Schema<CSTRING> cachedSchema()
    {
        return SCHEMA;
    }

    static final Schema<CSTRING> SCHEMA = new Schema<CSTRING>()
    {
        // schema methods

        public CSTRING newMessage()
        {
            return new CSTRING();
        }

        public Class<CSTRING> typeClass()
        {
            return CSTRING.class;
        }

        public String messageName()
        {
            return CSTRING.class.getSimpleName();
        }

        public String messageFullName()
        {
            return CSTRING.class.getName();
        }

        public boolean isInitialized(CSTRING message)
        {
            return true;
        }

        public void mergeFrom(Input input, CSTRING message) throws IOException
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
                        if(message.list == null)
                            message.list = new ArrayList<String>();
                        message.list.add(input.readString());
                        break;
                    case 3:
                        message.listopen = input.readBool();
                        break;
                    case 4:
                        message.assumedvalue = input.readString();
                        break;
                    default:
                        input.handleUnknownField(number, this);
                }   
            }
        }


        public void writeTo(Output output, CSTRING message) throws IOException
        {
            if(message.pattern != null)
                output.writeString(1, message.pattern, false);

            if(message.list != null)
            {
                for(String list : message.list)
                {
                    if(list != null)
                        output.writeString(2, list, true);
                }
            }

            if(message.listopen != null)
                output.writeBool(3, message.listopen, false);

            if(message.assumedvalue != null)
                output.writeString(4, message.assumedvalue, false);
        }

        public String getFieldName(int number)
        {
            switch(number)
            {
                case 1: return "pattern";
                case 2: return "list";
                case 3: return "listopen";
                case 4: return "assumedvalue";
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
            fieldMap.put("list", 2);
            fieldMap.put("listopen", 3);
            fieldMap.put("assumedvalue", 4);
        }
    };
    
}
