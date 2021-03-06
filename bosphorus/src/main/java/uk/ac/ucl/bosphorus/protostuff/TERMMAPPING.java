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

public final class TERMMAPPING implements Externalizable, Message<TERMMAPPING>
{

    public static Schema<TERMMAPPING> getSchema()
    {
        return SCHEMA;
    }

    public static TERMMAPPING getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final TERMMAPPING DEFAULT_INSTANCE = new TERMMAPPING();

    
    // non-private fields
    // see http://developer.android.com/guide/practices/design/performance.html#package_inner
    String match;
    DVCODEDTEXT purpose;
    CODEPHRASE target;

    public TERMMAPPING()
    {
        
    }

    public TERMMAPPING(
        String match,
        CODEPHRASE target
    )
    {
        this.match = match;
        this.target = target;
    }

    // getters and setters

    // match

    public String getMatch()
    {
        return match;
    }

    public void setMatch(String match)
    {
        this.match = match;
    }

    // purpose

    public DVCODEDTEXT getPurpose()
    {
        return purpose;
    }

    public void setPurpose(DVCODEDTEXT purpose)
    {
        this.purpose = purpose;
    }

    // target

    public CODEPHRASE getTarget()
    {
        return target;
    }

    public void setTarget(CODEPHRASE target)
    {
        this.target = target;
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

    public Schema<TERMMAPPING> cachedSchema()
    {
        return SCHEMA;
    }

    static final Schema<TERMMAPPING> SCHEMA = new Schema<TERMMAPPING>()
    {
        // schema methods

        public TERMMAPPING newMessage()
        {
            return new TERMMAPPING();
        }

        public Class<TERMMAPPING> typeClass()
        {
            return TERMMAPPING.class;
        }

        public String messageName()
        {
            return TERMMAPPING.class.getSimpleName();
        }

        public String messageFullName()
        {
            return TERMMAPPING.class.getName();
        }

        public boolean isInitialized(TERMMAPPING message)
        {
            return 
                message.match != null 
                && message.target != null;
        }

        public void mergeFrom(Input input, TERMMAPPING message) throws IOException
        {
            for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
            {
                switch(number)
                {
                    case 0:
                        return;
                    case 1:
                        message.match = input.readString();
                        break;
                    case 2:
                        message.purpose = input.mergeObject(message.purpose, DVCODEDTEXT.getSchema());
                        break;

                    case 3:
                        message.target = input.mergeObject(message.target, CODEPHRASE.getSchema());
                        break;

                    default:
                        input.handleUnknownField(number, this);
                }   
            }
        }


        public void writeTo(Output output, TERMMAPPING message) throws IOException
        {
            if(message.match == null)
                throw new UninitializedMessageException(message);
            output.writeString(1, message.match, false);

            if(message.purpose != null)
                 output.writeObject(2, message.purpose, DVCODEDTEXT.getSchema(), false);


            if(message.target == null)
                throw new UninitializedMessageException(message);
            output.writeObject(3, message.target, CODEPHRASE.getSchema(), false);

        }

        public String getFieldName(int number)
        {
            switch(number)
            {
                case 1: return "match";
                case 2: return "purpose";
                case 3: return "target";
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
            fieldMap.put("match", 1);
            fieldMap.put("purpose", 2);
            fieldMap.put("target", 3);
        }
    };
    
}
