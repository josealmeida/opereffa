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

public final class EXPRBINARYOPERATOR implements Externalizable, Message<EXPRBINARYOPERATOR>
{

    public static Schema<EXPRBINARYOPERATOR> getSchema()
    {
        return SCHEMA;
    }

    public static EXPRBINARYOPERATOR getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final EXPRBINARYOPERATOR DEFAULT_INSTANCE = new EXPRBINARYOPERATOR();

    
    // non-private fields
    // see http://developer.android.com/guide/practices/design/performance.html#package_inner
    EXPRITEMALTERNATIVES leftoperand;
    EXPRITEMALTERNATIVES rightoperand;
    String operator;
    Boolean precedenceoverridden;
    String type;

    public EXPRBINARYOPERATOR()
    {
        
    }

    public EXPRBINARYOPERATOR(
        EXPRITEMALTERNATIVES leftoperand,
        EXPRITEMALTERNATIVES rightoperand,
        String operator,
        String type
    )
    {
        this.leftoperand = leftoperand;
        this.rightoperand = rightoperand;
        this.operator = operator;
        this.type = type;
    }

    // getters and setters

    // leftoperand

    public EXPRITEMALTERNATIVES getLeftoperand()
    {
        return leftoperand;
    }

    public void setLeftoperand(EXPRITEMALTERNATIVES leftoperand)
    {
        this.leftoperand = leftoperand;
    }

    // rightoperand

    public EXPRITEMALTERNATIVES getRightoperand()
    {
        return rightoperand;
    }

    public void setRightoperand(EXPRITEMALTERNATIVES rightoperand)
    {
        this.rightoperand = rightoperand;
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

    public Schema<EXPRBINARYOPERATOR> cachedSchema()
    {
        return SCHEMA;
    }

    static final Schema<EXPRBINARYOPERATOR> SCHEMA = new Schema<EXPRBINARYOPERATOR>()
    {
        // schema methods

        public EXPRBINARYOPERATOR newMessage()
        {
            return new EXPRBINARYOPERATOR();
        }

        public Class<EXPRBINARYOPERATOR> typeClass()
        {
            return EXPRBINARYOPERATOR.class;
        }

        public String messageName()
        {
            return EXPRBINARYOPERATOR.class.getSimpleName();
        }

        public String messageFullName()
        {
            return EXPRBINARYOPERATOR.class.getName();
        }

        public boolean isInitialized(EXPRBINARYOPERATOR message)
        {
            return 
                message.leftoperand != null 
                && message.rightoperand != null 
                && message.operator != null 
                && message.type != null;
        }

        public void mergeFrom(Input input, EXPRBINARYOPERATOR message) throws IOException
        {
            for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
            {
                switch(number)
                {
                    case 0:
                        return;
                    case 1:
                        message.leftoperand = input.mergeObject(message.leftoperand, EXPRITEMALTERNATIVES.getSchema());
                        break;

                    case 2:
                        message.rightoperand = input.mergeObject(message.rightoperand, EXPRITEMALTERNATIVES.getSchema());
                        break;

                    case 3:
                        message.operator = input.readString();
                        break;
                    case 4:
                        message.precedenceoverridden = input.readBool();
                        break;
                    case 5:
                        message.type = input.readString();
                        break;
                    default:
                        input.handleUnknownField(number, this);
                }   
            }
        }


        public void writeTo(Output output, EXPRBINARYOPERATOR message) throws IOException
        {
            if(message.leftoperand == null)
                throw new UninitializedMessageException(message);
            output.writeObject(1, message.leftoperand, EXPRITEMALTERNATIVES.getSchema(), false);


            if(message.rightoperand == null)
                throw new UninitializedMessageException(message);
            output.writeObject(2, message.rightoperand, EXPRITEMALTERNATIVES.getSchema(), false);


            if(message.operator == null)
                throw new UninitializedMessageException(message);
            output.writeString(3, message.operator, false);

            if(message.precedenceoverridden != null)
                output.writeBool(4, message.precedenceoverridden, false);

            if(message.type == null)
                throw new UninitializedMessageException(message);
            output.writeString(5, message.type, false);
        }

        public String getFieldName(int number)
        {
            switch(number)
            {
                case 1: return "leftoperand";
                case 2: return "rightoperand";
                case 3: return "operator";
                case 4: return "precedenceoverridden";
                case 5: return "type";
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
            fieldMap.put("leftoperand", 1);
            fieldMap.put("rightoperand", 2);
            fieldMap.put("operator", 3);
            fieldMap.put("precedenceoverridden", 4);
            fieldMap.put("type", 5);
        }
    };
    
}
