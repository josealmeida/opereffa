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

public final class OBJECTREF implements Externalizable, Message<OBJECTREF>
{

    public static Schema<OBJECTREF> getSchema()
    {
        return SCHEMA;
    }

    public static OBJECTREF getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final OBJECTREF DEFAULT_INSTANCE = new OBJECTREF();

    
    // non-private fields
    // see http://developer.android.com/guide/practices/design/performance.html#package_inner
    OBJECTIDALTERNATIVES id;
    String namespace;
    String type;

    public OBJECTREF()
    {
        
    }

    public OBJECTREF(
        OBJECTIDALTERNATIVES id,
        String namespace,
        String type
    )
    {
        this.id = id;
        this.namespace = namespace;
        this.type = type;
    }

    // getters and setters

    // id

    public OBJECTIDALTERNATIVES getId()
    {
        return id;
    }

    public void setId(OBJECTIDALTERNATIVES id)
    {
        this.id = id;
    }

    // namespace

    public String getNamespace()
    {
        return namespace;
    }

    public void setNamespace(String namespace)
    {
        this.namespace = namespace;
    }

    // type

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
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

    public Schema<OBJECTREF> cachedSchema()
    {
        return SCHEMA;
    }

    static final Schema<OBJECTREF> SCHEMA = new Schema<OBJECTREF>()
    {
        // schema methods

        public OBJECTREF newMessage()
        {
            return new OBJECTREF();
        }

        public Class<OBJECTREF> typeClass()
        {
            return OBJECTREF.class;
        }

        public String messageName()
        {
            return OBJECTREF.class.getSimpleName();
        }

        public String messageFullName()
        {
            return OBJECTREF.class.getName();
        }

        public boolean isInitialized(OBJECTREF message)
        {
            return 
                message.id != null 
                && message.namespace != null 
                && message.type != null;
        }

        public void mergeFrom(Input input, OBJECTREF message) throws IOException
        {
            for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
            {
                switch(number)
                {
                    case 0:
                        return;
                    case 1:
                        message.id = input.mergeObject(message.id, OBJECTIDALTERNATIVES.getSchema());
                        break;

                    case 2:
                        message.namespace = input.readString();
                        break;
                    case 3:
                        message.type = input.readString();
                        break;
                    default:
                        input.handleUnknownField(number, this);
                }   
            }
        }


        public void writeTo(Output output, OBJECTREF message) throws IOException
        {
            if(message.id == null)
                throw new UninitializedMessageException(message);
            output.writeObject(1, message.id, OBJECTIDALTERNATIVES.getSchema(), false);


            if(message.namespace == null)
                throw new UninitializedMessageException(message);
            output.writeString(2, message.namespace, false);

            if(message.type == null)
                throw new UninitializedMessageException(message);
            output.writeString(3, message.type, false);
        }

        public String getFieldName(int number)
        {
            switch(number)
            {
                case 1: return "id";
                case 2: return "namespace";
                case 3: return "type";
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
            fieldMap.put("id", 1);
            fieldMap.put("namespace", 2);
            fieldMap.put("type", 3);
        }
    };
    
}
