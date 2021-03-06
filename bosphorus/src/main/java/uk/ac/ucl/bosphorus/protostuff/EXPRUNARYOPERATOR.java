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

public final class EXPRUNARYOPERATOR implements Externalizable, Message<EXPRUNARYOPERATOR>
{

    public static Schema<EXPRUNARYOPERATOR> getSchema()
    {
        return SCHEMA;
    }

    public static EXPRUNARYOPERATOR getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final EXPRUNARYOPERATOR DEFAULT_INSTANCE = new EXPRUNARYOPERATOR();

    
    // non-private fields
    // see http://developer.android.com/guide/practices/design/performance.html#package_inner
    EXPRITEMALTERNATIVES operand;
    String operator;
    Boolean precedenceoverridden;
    String type;

    public EXPRUNARYOPERATOR()
    {
        
    }

    public EXPRUNARYOPERATOR(
        EXPRITEMALTERNATIVES operand,
        String operator,
        String type
    )
    {
        this.operand = operand;
        this.operator = operator;
        this.type = type;
    }

    // getters and setters

    // operand

    public EXPRITEMALTERNATIVES getOperand()
    {
        return operand;
    }

    public void setOperand(EXPRITEMALTERNATIVES operand)
    {
        this.operand = operand;
    }

    // operator

    public String getOperator()
    {
        return operator;
    }

    public void setOperator(String operator)
    {
        this.operator = operator;
    }

    // precedenceoverridden

    public Boolean getPrecedenceoverridden()
    {
        return precedenceoverridden;
    }

    public void setPrecedenceoverridden(Boolean precedenceoverridden)
    {
        this.precedenceoverridden = precedenceoverridden;
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

    public Schema<EXPRUNARYOPERATOR> cachedSchema()
    {
        return SCHEMA;
    }

    static final Schema<EXPRUNARYOPERATOR> SCHEMA = new Schema<EXPRUNARYOPERATOR>()
    {
        // schema methods

        public EXPRUNARYOPERATOR newMessage()
        {
            return new EXPRUNARYOPERATOR();
        }

        public Class<EXPRUNARYOPERATOR> typeClass()
        {
            return EXPRUNARYOPERATOR.class;
        }

        public String messageName()
        {
            return EXPRUNARYOPERATOR.class.getSimpleName();
        }

        public String messageFullName()
        {
            return EXPRUNARYOPERATOR.class.getName();
        }

        public boolean isInitialized(EXPRUNARYOPERATOR message)
        {
            return 
                message.operand != null 
                && message.operator != null 
                && message.type != null;
        }

        public void mergeFrom(Input input, EXPRUNARYOPERATOR message) throws IOException
        {
            for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
            {
                switch(number)
                {
                    case 0:
                        return;
                    case 1:
                        message.operand = input.mergeObject(message.operand, EXPRITEMALTERNATIVES.getSchema());
                        break;

                    case 2:
                        message.operator = input.readString();
                        break;
                    case 3:
                        message.precedenceoverridden = input.readBool();
                        break;
                    case 4:
                        message.type = input.readString();
                        break;
                    default:
                        input.handleUnknownField(number, this);
                }   
            }
        }


        public void writeTo(Output output, EXPRUNARYOPERATOR message) throws IOException
        {
            if(message.operand == null)
                throw new UninitializedMessageException(message);
            output.writeObject(1, message.operand, EXPRITEMALTERNATIVES.getSchema(), false);


            if(message.operator == null)
                throw new UninitializedMessageException(message);
            output.writeString(2, message.operator, false);

            if(message.precedenceoverridden != null)
                output.writeBool(3, message.precedenceoverridden, false);

            if(message.type == null)
                throw new UninitializedMessageException(message);
            output.writeString(4, message.type, false);
        }

        public String getFieldName(int number)
        {
            switch(number)
            {
                case 1: return "operand";
                case 2: return "operator";
                case 3: return "precedenceoverridden";
                case 4: return "type";
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
            fieldMap.put("operand", 1);
            fieldMap.put("operator", 2);
            fieldMap.put("precedenceoverridden", 3);
            fieldMap.put("type", 4);
        }
    };
    
}
